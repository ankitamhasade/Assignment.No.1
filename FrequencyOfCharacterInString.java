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
public class FrequencyOfCharacterInString 
{
    public static void main(String args[]) 
    {
        String str = "This website is awesome.";
        char ch = 'P';
        int frequency = 0;

        for(int i = 0; i < str.length(); i++) 
        {
            if(ch == str.charAt(i)) 
            {
                ++frequency;
            }
        }
        System.out.println("Frequency of " + ch + " = " + frequency);
    }
}
