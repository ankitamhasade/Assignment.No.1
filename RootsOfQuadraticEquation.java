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
public class RootsOfQuadraticEquation 
{
     public static void main(String args[])
     {
       double secondRoot = 0, firstRoot = 0;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the value of a :");
       double a = sc.nextDouble();

       System.out.println("Enter the value of b :");
       double b = sc.nextDouble();

       System.out.println("Enter the value of c :");
       double c = sc.nextDouble();
       
        double determinant = (b*b)-(4*a*c);
        double sqrt = Math.sqrt(determinant);

        if(determinant>0)
        {
          firstRoot = (-b + sqrt)/(2*a);
          secondRoot = (-b - sqrt)/(2*a);
          System.out.println("Roots are :: "+ firstRoot +" and "+secondRoot);
        }
        else if(determinant == 0)
        {
          System.out.println("Root is :: "+(-b + sqrt)/(2*a));
        }
     }
}
