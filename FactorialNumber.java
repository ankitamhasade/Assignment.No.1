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
public class FactorialNumber 
{
    public static void main(String args[]) 
    {
        int num = 5 , i;
        long factorial = 1;
        for(i = 1; i <= num; ++i)
        {
          factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}
