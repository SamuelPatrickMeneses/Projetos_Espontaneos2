/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joguinhosDePrompt.mySimpletron;

import java.util.Scanner;

public class Converter {
    public static int parseInt(String v){
        String t = v;
        boolean k = false;
        if(v.startsWith("-")){ 
            t = v.substring(1);
            k = true;
        }
        int r = Integer.parseInt(t);
        if(k)r *= -1;
        return r;
    }
    
    public static int[] parseFunction(String f){
        int[] a = new int[2];
        a[0] = Converter.parseInt(f.substring(0,2));
        a[1] = Converter.parseInt(f.substring(2,4));
        return a;
    }
    
    public static String parseString(int v){
        String x = Math.abs(v) + "";
        if(v<0)x = x.substring(0);
         for(;x.length()<4;)
                switch(x.length()){
                    case 0: x = "0000" + x; break;
                    case 1: x =  "000" + x; break;
                    case 2: x =   "00" + x; break;
                    case 3: x =    "0" + x; break;
                }
         if(v<0)x = "-"+x;
         return x;
    }
    
    public static String catchString(int n){
        Scanner in = new Scanner(System.in);
        String v;
        do{
            System.out.printf("%2d ? ",n);
            v = in.nextLine();
            for(;v.length()<4;){
                boolean negativo = false;
                if(v.startsWith("-")){
                    v = v.substring(1);
                    negativo = true;
                }
                switch(v.length()){
                    case 0: v = "0000" + v; break;
                    case 1: v =  "000" + v; break;
                    case 2: v =   "00" + v ; break;
                    case 3: v =    "0" + v; break;
                }
                if(negativo)v = "-"+v;
            }
        }while(!v.matches("[+-]{0,1}\\d{4}"));
        return  v;
    }
}
