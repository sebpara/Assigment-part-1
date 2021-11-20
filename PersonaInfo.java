/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personainfo;
import java.util.Scanner;

/**
 *
 * @author sebastianparaschivescu
 */
    public class PersonaInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // TODO code application logic here
             
        Scanner person = new Scanner(System.in);

       // imput name
        System.out.printf("Please enter your name: ");
        
       // string variable
        String name = person.nextLine();
       // imput age
        System.out.printf("Please enter your age: ");
       // integer variable
        int age = person.nextInt();

       // imput gender
        System.out.printf("Please enter your gender: ");
       // string variable
        String gender = person.next();
        
        person.nextLine();
       // imput department
        System.out.printf("Please enter your department: ");
       // string variable
        String department = person.nextLine();
       //imput PI
        System.out.printf("Please enter the value of PI (3.14159265): ");
       // double variable
        double pi = person.nextDouble();
       // Output
        String sep = ":";
   
        System.out.printf("\nName %14s %s\nAge %15s %s\nGender %12s %s\n" +
            "Department %8s %s\nPI %16s %.2f\n",
            sep, name, sep, age, sep, gender,
            sep, department,  sep, pi);
    }  
}

    
    

