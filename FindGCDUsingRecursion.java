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
public class FindGCDUsingRecursion
{
    public static void main(String args[]) 
    {
        int n1 = 520, n2 = 50;
        int hcf = hcf(n1, n2);
        System.out.printf("G.C.D of %d and %d is %d.", n1, n2, hcf);
    }
    public static int hcf(int n1, int n2)
    {
        if (n2 != 0)
            return hcf(n2, n1 % n2);
        else
            return n1;
    }
}
