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
public class SwapTwoNumber 
{
    public static void main(String args[])
    {
        int a=100,b=200,temp=0;
        
        System.out.println("Before swapping ");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);

        temp=a;            
        a=b;
        b=temp;
        
        System.out.println("After swapping");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);

    }
}
