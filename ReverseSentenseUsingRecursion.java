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
public class ReverseSentenseUsingRecursion 
{
    public static void main(String args[]) 
    {
      String sentence = "Hello World";
      String reversed = reverse(sentence);
      System.out.println("The reversed sentence is: " + reversed);
    }
    public static String reverse(String sentence) 
    {
      if (sentence.isEmpty())
      return sentence;
      return reverse(sentence.substring(1)) + sentence.charAt(0);
    }
}
