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
public class GCDNumber 
{
    public static void main(String args[]) 
    {
        int n1 = 81, n2 = 153;
        int gcd = 1;

        for (int i = 1; i <= n1 && i <= n2; ++i) 
        {
            if (n1 % i == 0 && n2 % i == 0)
            gcd = i;
        }
        System.out.println("GCD of " + n1 +" and " + n2 + " is " + gcd);
    }
}

    

