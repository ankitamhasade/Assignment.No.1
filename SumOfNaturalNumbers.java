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
public class SumOfNaturalNumbers 
{
    public static void main(String[] args)
    {

        int  i, num = 100, sum = 0;

        for(i = 1; i <= num; ++i)
        {
            sum += i;
        }
        System.out.println("Sum = " + sum);
    }
}
