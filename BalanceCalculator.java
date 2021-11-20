/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package balancecalculator;
import java.util.Scanner;

/**
 *
 * @author sebastianparaschivescu
 */
public class BalanceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
        
        Scanner balance = new Scanner(System.in);
         
        String sep = ":";
        String cent = "%";
       // input initial balance  
        System.out.printf("Please enter the initial balance: $");
        double initial = balance.nextDouble();
       // imput anual interet rate
        System.out.printf("Please enter the anual interet rate (2 for 2%s): ", cent);
        double rate = balance.nextDouble();
       // imput number of years
        System.out.printf("Please enter number of years the cleient wants oi save the money in the bank: ");
        int years = balance.nextInt();
         
        double totalBalance = initial*Math.pow(1 + rate/100, years);
       // output
        System.out.printf(
            "\nInitial Balance %7s %9.2f"+
            "\nAnnual Interest Rate %2s %8.2f%s"+
            "\nSaving years %10s %9.2s\n"+
            "\n-------------------------------\n"+
            "\nBalance after %s Years %s %.2f\n\n",
            sep, initial, sep, rate, cent, sep, years, years, sep, totalBalance
        );
    }
}

    
    

