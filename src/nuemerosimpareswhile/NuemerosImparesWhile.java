/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nuemerosimpareswhile;

import java.util.Scanner;

/**
 *
 * @author Fsociety
 */
public class NuemerosImparesWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner _Conesole = new Scanner(System.in);
        int N,div = 1; 
        boolean Primo = true;
        System.out.println("Ingrese un Numero");
         N = _Conesole.nextInt();
        N--;
        
      

        while (Primo && div <N) {

            Primo = N % div != 0;
            div++;

            if (Primo == true) {
                System.out.println(N);
                div = 2;
                N--;
            } else {
                Primo = true;
                div++;
                N--;
            }
        }

    }

}
