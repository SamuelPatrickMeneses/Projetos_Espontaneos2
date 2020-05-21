/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joguinhosDePrompt.mySimpletron;


public class SMLs {
    public static String[] soma = {"1007","1008","2007","3008","2109","1109","4300"};
    public static String[] max = {"1009","1010","2009","3110","4107","1109","4300","1110","4300"};
    private String[] memori;
    
    public SMLs(String[] v){
        memori = v;
    }
    
    public SMLs(){
        String v = "";
        memori = new String[100];
        for(int x = 0;x < memori.length &!(v.equals("0000"));x++){
            String xt = x + "";
            if(x < 10) xt = "0" + x;
            v = Converter.catchString(x);
            memori[x] = v; 
            }
    }
    public String[] get(){
        return memori;
    }
    
}
