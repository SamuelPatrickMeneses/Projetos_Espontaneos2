
package joguinhosDePrompt.mySimpletron;

import java.util.Scanner;

public class Core {
    private final int READ = 10;
    private final int WRITE = 11;
    private final int LOAD = 20;
    private final int STORE = 21;
    private final int ADD = 30;
    private final int SUBTRACT = 31;
    private final int DIVIDE = 32;
    private final int MULTIPLY = 33;
    private final int BRANCH = 40;
    private final int BRANCHNEG = 41;
    private final int BRANCHZERO = 42;
    private final int HALT = 43;
    private boolean key;
    private int pointer;
    private String collector;
    private String[] memory = new String[100];
    
    public Core(String[] v){
        for(int x = 0;x < v.length;x++){
            memory[x] = v[x];
        }
        key = true;
    }
    
    public void rum(){
        for(pointer = 0;pointer <= 99 & key;pointer++){
            this.controller(Converter.parseFunction(memory[pointer]));
        }
    }
    
    public void controller(int[] v){
        switch(v[0]){
            case READ:
                read(v);
                break;
            case WRITE:
                write(v);
                break;
            case LOAD:
                load(v);
                break;
            case STORE:
                store(v);
                break;
            case ADD:
                add(v);
                break;
            case SUBTRACT:
                subtract(v);
                break;
            case DIVIDE:
                 divide(v);
                 break;
            case MULTIPLY:
                 multiply(v);
                 break;
            case BRANCH:
                 branch(v);
                 break;
            case BRANCHNEG:
                 branchNeg(v);
                 break;
            case BRANCHZERO:
                 branchZero(v);
                 break;
            case HALT:
                 halt();
        }
    }
    
    public void read(int[] v){
        Scanner in = new Scanner(System.in);
        System.out.println("Incira um valor inteiro de quatro digitoas");
        this.memory[v[1]] = "" + in.nextInt();
    }
    
    public void write(int[] v){
        System.out.println("write: "+memory[v[1]]);
    }
    
    public void load(int[] v){
        this.collector = memory[v[1]];
    }
    
    public void store(int[] v){
        memory[v[1]] = this.collector;
    }
    
    public void add(int[] v){
        v[0] =   Integer.parseInt(collector) +  Integer.parseInt(memory[v[1]]);
        collector = ""+ v[0];
    }
    
    public void subtract(int[] v){
      v[0] =   Integer.parseInt(collector) -  Integer.parseInt(memory[v[1]]);
      collector = ""+ v[0];
    }
    
    public void divide(int[] v){
      v[0] =   Integer.parseInt(collector) /  Integer.parseInt(memory[v[1]]);
      collector = ""+ v[0];
    }
    
    public void multiply(int[] v){
      v[0] =   Integer.parseInt(collector) *  Integer.parseInt(memory[v[1]]);
      collector = ""+ v[0];
    }
    
    public void branch(int[] v){
        this.pointer = v[1];
    }
    
    public void branchNeg(int[] v){
        if(Integer.parseInt(collector) < 0){
          this.pointer = v[1];  
        }  
    }
    
    public void branchZero(int[] v){
        if(Integer.parseInt(collector) == 0){
          this.pointer = v[1];  
        }  
    }
    
    public void halt(){
        key = false;
    }
}
