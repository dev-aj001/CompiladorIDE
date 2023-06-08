import compilerTools.TextColor;
import java.awt.Color;

%%
%class LexerColor
%type TextColor
%char
%{
    private TextColor textColor(long start, int size, Color color){
        return new TextColor((int) start, size, color);
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
{Comentario} { return textColor(yychar, yylength(), new Color(146, 146, 146)); }
{EspacioEnBlanco} { /*Ignorar*/ }

/* Tipos de dato */
numero |
bool |
cadena |
fecha { return textColor(yychar, yylength(), new Color(148, 58, 173)); }

/* Número */
{Numero} { return textColor(yychar, yylength(), new Color(35, 120, 147)); }

/* Colores */
#[{Letra}{Digito}]{6} { return textColor(yychar, yylength(), new Color(224, 195, 12)); }

/* Operadores de agrupación */
"("|")"|"{"|"}" { return textColor(yychar, yylength(), new Color(169, 155, 179)); }

/* Signos de puntuación */
","|
";" { return textColor(yychar, yylength(), new Color(169, 155, 179)); }

/* Operador de asignación */
--> { return textColor(yychar, yylength(), new Color(169, 155, 179)); }

/* Stats */
estado |
temperatura |
potencia |
riego |
horario |
aspersor { return textColor(yychar, yylength(), new Color(17, 94, 153)); }

/* Auto */
auto { return textColor(yychar, yylength(), new Color(212, 129, 6)); }

/* Zona */
zona { return textColor(yychar, yylength(), new Color(180, 29, 250)); }

/* Mientras */
mientras { return textColor(yychar, yylength(), new Color(255, 64, 129)); }

/* Falla */
falla { return textColor(yychar, yylength(), new Color(220, 41, 41)); }

/* Incremento */
inc { return textColor(yychar, yylength(), new Color(239, 108, 0)); }

/* Ver */
mensaje |
alerta { return textColor(yychar, yylength(), new Color(150, 0, 80)); }

/* Repetir */
repetir |
repetirMientras { return textColor(yychar, yylength(), new Color(121, 107, 255)); }

/* Intentar */
intentar { return textColor(yychar, yylength(), new Color(255, 64, 129)); }

/* Estructura si */
si |    
sino { return textColor(yychar, yylength(), new Color(48, 63, 159)); }

/* Operadores lógicos */
"&" |
"|" { return textColor(yychar, yylength(), new Color(46, 125, 50)); }

/* CadenaDeTexto */
{CadenaDeTexto} { return textColor(yychar, yylength(), new Color(46, 220, 50)); }

/* Identificador */
{Identificador} { /*Ignorar*/ }

/* Errores */
// Número erróneo
0 {Numero}+ { /* Ignorar */ }
// Identificador numero
{Numero}+{Identificador} { /* Ignorar */ }
. {EspacioEnBlanco} { /* Ignorar */ }
