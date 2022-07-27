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
public class SumOfNaturalNumbersUsingRecursion 
{
    public static void main(String args[]) 
    {
        int number = 10;
        int sum = addNumbers(number);
        System.out.println("Sum = " + sum);
    }
    public static int addNumbers(int num)
    {
        if (num != 0)
            return num + addNumbers(num - 1);
        else
            return num;
    }
}
