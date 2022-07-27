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
public class CalculatePowerOfNumber 
{
    public static void main(String args[]) 
    {
        int base = 3, exponent = 4;
        long result = 1;
        
        while (exponent != 0)
        {
            result *= base;
            --exponent;
        }
        System.out.println("Answer = " + result);
   }
}
