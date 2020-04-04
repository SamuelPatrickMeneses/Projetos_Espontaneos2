
package aplicaçõesGraficas.pixelArtBasico;


public class Launcher {
   public static Tela tela = new Tela();
   public static Janela janela = new Janela();
 public static void main(String[] args){
    
    Launcher.janela.add(tela);
    Launcher.janela.addMouseListener(tela);
 }   
}
