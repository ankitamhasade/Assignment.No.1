/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assingment.no.pkg1;

/**
 *
 * @author Lenovo
 */
public class FactorOfAnyNumber 
{
    public static void main(String args[]) 
    {
        int number = 20;
        System.out.print("Factors of " + number + " are: ");

        for (int i = 1; i <= number; ++i) 
        {
            if (number % i == 0) 
            {
              System.out.print(i + " ");
            }
        }
    }
}
