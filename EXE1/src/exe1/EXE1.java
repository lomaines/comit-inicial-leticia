/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exe1;
import java.util.*;
/**
 *
 * @author Dias
 */
public class EXE1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner numb = new Scanner(System.in);
        System.out.println("Digite sua nota da P1");
        Double A = numb.nextDouble();
        System.out.println("Digite sua nota da P2");
        Double B = numb.nextDouble();
        double c = 0; 
        double d = 0; 
        while(A < B){
            if (A % 2 == 1 ) {
             c = c + A;   
             d = d + 1 ;
            }
        A = A +1 ;
    }
        System.out.println("A media dos numeros impares é : " + (c /d));
    }
}
