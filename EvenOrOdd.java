/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assingment.no.pkg1;
import java.util.*;

/**
 *
 * @author Lenovo
 */
public class EvenOrOdd 
{
     public static void main(String[] args) 
     {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println(num + " is even");
        else
            System.out.println(num + " is odd");
     }
}
