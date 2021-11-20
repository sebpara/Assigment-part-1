/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberconverter;
import java.util.Scanner;

/**
 *
 * @author sebastianparaschivescu
 */
public class NumberConverter {

    /**
     */
    public static int getDecimal(int octal) {
    // TODO code application logic here
   
        int decimal = 0;    
        int n = 0;    
   
        while(true){    
            if(octal == 0){    
                break;    
            } else {    
                int temp = octal%10;    
                decimal += temp*Math.pow(8, n);    
                octal = octal/10;    
                n++;    
            }    
        }    
    
        return decimal;    
    }    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
        
        Scanner converter = new Scanner(System.in);

        String sep = ":";
       // imput octal number
        System.out.printf("Please enter a 4-digits Octal number: ");
        
        int octal = converter.nextInt();
        int decialNumber = getDecimal(octal);
       // output
        System.out.printf(
            "\nOctal Number%11s %s"+
            "\nDecimal Number%9s %s"+
            "\n\n",sep, octal, sep, decialNumber
        );
    }
}
    
    

