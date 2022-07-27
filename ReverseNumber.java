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
public class ReverseNumber 
{
    public static void main(String args[]) 
    {
        int num = 1234, reversed = 0;
        System.out.println("Original Number: " + num);

        while(num != 0) 
        {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed Number: " + reversed);
    }
}
