/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joguinhosDePrompt.mySimpletron;


public class Converter {
    public static int parseInt(String v){
        int r = Integer.parseInt(v);
        return r;
    }
    
    public static int[] parseFunction(String f){
        int[] a = new int[2];
        a[0] = Integer.parseInt(f.substring(0,2));
        a[1] = Integer.parseInt(f.substring(2));
        return a;
    }
    
    public static String parseString(int v){
        if(v < 1000){
            return "0"+v;
        }
        return ""+v;
    }
}
