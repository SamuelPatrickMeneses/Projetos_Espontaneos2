/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joguinhosDePrompt.mySimpletron;

import java.util.Scanner;


public class Texte {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        SMLs sml = new SMLs(SMLs.max);
        Core c = new Core(sml);
        c.rum();
    }
   
}
