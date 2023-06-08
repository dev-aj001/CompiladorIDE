/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lexico;

import jflex.exceptions.SilentExit;

/**
 *
 * @author jairi
 */
public class ExecuteJflex {
    public static void main(String omega[]){
        String lexerFile = System.getProperty("user.dir") + "/src/lexico/Lexer.flex",
                lexerColor = System.getProperty("user.dir") + "/src/lexico/LexerColor.flex";
        try {
            jflex.Main.generate(new String[]{lexerFile, lexerColor});
        } catch (SilentExit ex) {
            System.out.println("Error al compilar/generar el archivo flex: " + ex);
        }
    }
}
