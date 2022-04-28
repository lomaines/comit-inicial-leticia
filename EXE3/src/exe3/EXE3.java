/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe3;
import java.util.*;
/**
 *
 * @author Dias
 */
public class EXE3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner numb = new Scanner(System.in);
        int x = 0;
        int s = 0;
        int d = 0;
        while (x<10) {
            System.out.println("voce gostou do produto novo se sim 0 se nao 1 ?");
            int a = numb.nextInt();
            
            if (a == 0) {
             s = s + 1;                 
            }
            else{
                d = d + 1;}
         x = x + 1; 
        }
        System.out.println("Valor Sim : " + (s));
        System.out.println("Valor Não : " + (d));
    }
    
}
