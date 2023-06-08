import compilerTools.Token;

%%
%class Lexer
%type Token
%line
%column
%{
    private Token token(String lexeme, String lexicalComp, int line, int column){
        return new Token(lexeme, lexicalComp, line+1, column+1);
    }
%}
/* Variables básicas de comentarios y espacios */
TerminadorDeLinea = \r|\n|\r\n
EntradaDeCaracter = [^\r\n]
EspacioEnBlanco = {TerminadorDeLinea} | [ \t\f]
ComentarioTradicional = "/*" [^*] ~"*/" | "/*" "*"+ "/"
FinDeLineaComentario = "//" {EntradaDeCaracter}* {TerminadorDeLinea}?
ContenidoComentario = ( [^*] | \*+ [^/*] )*
ComentarioDeDocumentacion = "/**" {ContenidoComentario} "*"+ "/"


/* Variables para cadendas de texto*/
CadenaDeTexto = \" {EntradaDeCaracter}* \"

/* Comentario */
Comentario = {ComentarioTradicional} | {FinDeLineaComentario} | {ComentarioDeDocumentacion}

/* Identificador */
Letra = [A-Za-zÑñ_ÁÉÍÓÚáéíóúÜü]
Digito = [0-9]
Identificador = {Letra}({Letra}|{Digito})*

/* Número */
Numero = 0 | [1-9][0-9]*
%%
/* Comentarios o espacios en blanco */
{Comentario}|{EspacioEnBlanco} { /*Ignorar*/ }

/* Tipos de dato */
numero |
bool |
cadena |
fecha { return token(yytext(), "TIPO_DATO", yyline, yycolumn); }

/* Tipos de dato */
constante { return token(yytext(), "CONSTANTE", yyline, yycolumn); }

/* Número */
{Numero} { return token(yytext(), "NUMERO", yyline, yycolumn); }


/* Operadores de agrupación */
"(" { return token(yytext(), "PARENTESIS_A", yyline, yycolumn); }
")" { return token(yytext(), "PARENTESIS_C", yyline, yycolumn); }
"{" { return token(yytext(), "LLAVE_A", yyline, yycolumn); }
"}" { return token(yytext(), "LLAVE_C", yyline, yycolumn); }
"[" { return token(yytext(), "CORCHETE_A", yyline, yycolumn); }
"]" { return token(yytext(), "CORCHETE_C", yyline, yycolumn); }

/* Signos de puntuación */
"," { return token(yytext(), "COMA", yyline, yycolumn); }
";" { return token(yytext(), "PUNTO_COMA", yyline, yycolumn); }

/* Operador de asignación */
= { return token (yytext(), "OP_ASIG", yyline, yycolumn); }

/* Zona */
zona { return token(yytext(), "ZONA", yyline, yycolumn); }


/* PALABRAS RESERVADAS */
mensaje |
alerta { return token(yytext(), "OUT_MENSAJE", yyline, yycolumn); }

/* Estructuras de control */
/* Repetir */
repetir |
repetirMientras { return token(yytext(), "REPETIR", yyline, yycolumn); }

/* Intentar */
intentar { return token(yytext(), "INTENTAR", yyline, yycolumn); }

/* Mientras */
mientras { return token(yytext(), "INTENTAR", yyline, yycolumn); }

/* Activar */
activar { return token(yytext(), "ACTIVAR", yyline, yycolumn); }

/* Desactivar */
desactivar { return token(yytext(), "DESACTIVAR", yyline, yycolumn); }

/* Valores booleanos */
verdadero |
falso { return token(yytext(), "VALOR_BOOLEANO", yyline, yycolumn); }

/* Valores Predefinidos */
auto { return token(yytext(), "VALOR_AUTOMATICO", yyline, yycolumn); }

/* Estadiasticas */

/* Estado */
estado { return token(yytext(), "STAT_ESTADO", yyline, yycolumn); }

/* Temperatura */
temperatura { return token(yytext(), "STAT_TEMPERATURA", yyline, yycolumn); }

/* Potencia */
potencia { return token(yytext(), "STAT_POTENCIA", yyline, yycolumn); }

/* Riego */
riego { return token(yytext(), "STAT_RIEGO", yyline, yycolumn); }

/* Horario */
horario { return token(yytext(), "STAT_HORARIO", yyline, yycolumn); }

/* Incremento */
inc { return token(yytext(), "INCREMENTO", yyline, yycolumn); }

/* Falla */
falla { return token(yytext(), "ESC_FALLA", yyline, yycolumn); }

/* Aspersor */
aspersor { return token(yytext(), "ASPERSOR", yyline, yycolumn); }

/* Estructura si */
si |
sino { return token(yytext(), "ESTRUCTURA_SI", yyline, yycolumn); }

/* Operadores lógicos */
"&" |
"|" { return token(yytext(), "OP_LOGICO", yyline, yycolumn); }

/* Identificador */
{Identificador} { return token(yytext(), "IDENTIFICADOR", yyline, yycolumn); }


/* CadenaDeTexto */
{CadenaDeTexto} { return token(yytext(), "CADENA_TEXTO", yyline, yycolumn); }

/* Errores */
// Número erróneo
0 {Numero}+ { return token(yytext(), "ERROR_1", yyline, yycolumn); }
// Identificador error
{Numero}+{Identificador} | 
{Identificador}"("{Identificador} | 
{Identificador}")"{Identificador} |
{Identificador}"{"{Identificador} |
{Identificador}"}"{Identificador} |
{Identificador}"["{Identificador} |
{Identificador}"."{Identificador} |
{Identificador}"]"{Identificador} { return token(yytext(), "ERROR_2", yyline, yycolumn); }
. { return token(yytext(), "ERROR", yyline, yycolumn); }


