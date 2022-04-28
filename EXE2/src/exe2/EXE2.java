/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe2;
import java.util.*;
/**
 *
 * @author Dias
 */
public class EXE2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner numb = new Scanner(System.in);
        
        double x = 0;
        double d = 0;
        int r = 0;
        int b = 0;

        while(x < 10){   
         System.out.println("Digite sua media : "); 
         Double a = numb.nextDouble();    
               
                if (a >= 7) {
                System.out.println("APROVADO");
                b = b + 1;    
                 }if (a>=5 && (a<7)){
                System.out.println("EXAME");
                
                }if(a<5) {
                System.out.println("REPROVADO");
                r = r + 1;
                }
              
                d = d + a;
                x = x + 1;
        }
        System.out.println("A media geral da sala foi :" + (d/10));
        System.out.println("Quantidade de alunos Aprovados :" +(b)+ " Quantidade de alunos reprovados :" + (r) );
    }
    
}
2
