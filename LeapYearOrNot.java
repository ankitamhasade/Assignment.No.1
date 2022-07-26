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
public class LeapYearOrNot 
{
    public static void main(String args[])
    {
      int year;
      System.out.println("Enter an Year : ");
      Scanner sc = new Scanner(System.in);
      year = sc.nextInt();

      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
         System.out.println("leap year");
      else
         System.out.println("Not a leap year");
    } 
}
