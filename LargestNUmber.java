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
public class LargestNUmber 
{
    public static void main(String[] args)   
    {  
        int a, b, c, largest, temp;  
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the first number:");  
        a = sc.nextInt();  
        System.out.println("Enter the second number:");  
        b = sc.nextInt();  
        System.out.println("Enter the third number:");  
        c = sc.nextInt();  
        
        temp=a>b?a:b;  
        largest=c>temp?c:temp;  
        System.out.println("The largest number is: "+largest);  
    }
}
