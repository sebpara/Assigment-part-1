/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pricecalculator;
import java.util.Scanner;

/**
 *
 * @author sebastianparaschivescu
 */
    public class PriceCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
 
        Scanner person = new Scanner(System.in);
       // imput taxes
        double tva = 5;
        double tvq = 9.975;
        String sep = ":";
        String cent = "%";

       // imput item price
        System.out.printf("Please enter the item price: ");
        double price = person.nextDouble();
       // imput discount ratio
        System.out.printf("Please enter the discount ratio (5 for 5%s): ", cent);
        double discount = person.nextDouble();

        double beforeTax = price - price*discount/100;
        double tvaTax =  beforeTax*tva/100;
        double tvqTax =  beforeTax*tvq/100;
        double finalPrice = beforeTax + tvaTax + tvqTax;

       // output  
         System.out.printf(
            "\nOriginal price %11s %.2f"+
            "\nDiscount ratio %11s %.2f%s"+
            "\nPrice before tax %9s %.2f\n"+
            "\n----------------------------------\n"+
            "\nFederal Tax %14s %.2f"+
            "\nProvincial tax %11s %.2f" +
            "\nFinal price %14s %.2f\n"+
            "\n----------------------------------\n",
            sep, price, sep, discount, cent, sep, beforeTax,
            sep, tvaTax, sep, tvqTax, sep, finalPrice
        );
    }
   
}
    
    

