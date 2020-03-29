
package jogunhosDePrompt;

import java.util.Random;
import java.util.Scanner;

public class BatalhaNaval1D {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        String[] m = {"~","~","~","~","~","~","~","~","~","~"};
        int[] b = {0,0,0,0,0,0,0,0,0,0};
        int pos = 0, palpite = 0, tentativas = 0, acertos = 0;
        pos = r.nextInt(8)+1;
        b[pos] = -1;
        b[pos+1] = -1;
        b[pos-1] = -1;
        do{
          System.out.println(m[0]+","+m[1]+","+m[2]+","+m[3]+","+m[4]+","+m[5]+","+m[6]+","+m[7]+","+m[8]+","+m[9]+",");
          System.out.println("1,2,3,4,5,6,7,8,9,10");
          System.out.println("Seus acertos: "+acertos+" suas tentativas: "+tentativas);
          do{
            System.out.println("De um palpite entre 1 e 10.");
            palpite = in.nextInt();
            if(palpite > 10 || palpite <1){
                System.out.println("Erro, valor invalido, digite novamente.");
            }  
          }while(palpite > 10 || palpite <1);
          palpite--;
          switch(b[palpite]){
              case-1: 
                  System.out.println("Você acertou uma embarcação!");
                  acertos++;
                  tentativas++;
                  b[palpite] = 2;
                  m[palpite] = "O";
                  break;
              case 0:
                  System.out.println("Tiro na agua!");
                  tentativas++;
                  b[palpite] = 1;
                  m[palpite] = "X";
                  break;
              case 1:
                  tentativas++;
                  System.out.println("Esta casa já foi revelada, tente novamente.");
                  break;
              case 2:
                  tentativas++;
                  System.out.println("Esta casa já foi revelada, tente novamente.");
                  break;
          }
          System.out.println("\n");
        }while(acertos < 3);
        System.out.println("Você afundou uma embarcação!");
        System.out.println("Seus acertos: "+acertos+" suas tentativas: "+tentativas);
    }
}
