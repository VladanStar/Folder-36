
package sekundiminute;

import java.util.Scanner;


public class SekundiMinute {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int minuti;
        int sekundeUnos;
        int sekunde;
        
        System.out.println("Unesite sekunde: ");
        sekundeUnos = input.nextInt();
        minuti = sekundeUnos/60;
        sekunde = sekundeUnos%60;
        
        System.out.println("Unete sekunde " + sekundeUnos +"su ukupno "+ minuti +" minuta i " + sekunde + " sekundi" );
        
    }
    
}
