//Trinh To, CS141, Fall 2019, Section A
//Homework Assignment 16, 11/21/19

//This program's behavior is store each word in an array. 
// The program should then go through the array of words
// one by one and it should upper case all the odd numbered words,
// and lowercase all the even numbered words.
// Print array word by word as a "sentence and by using the Arrays.toString() command.

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class HW16 {//open class
   public static void main(String[] args) 
   {//open main 
	   String[] N = new String[10];
      //create new array
      Scanner input = new Scanner(System.in);
      //scanning for user input
	   
      int i=0;
      while (i<N.length){
      //loops to input string	   
         int count=i+1;
	      System.out.printf("Please type in word #%d :",count);
         String n = input.nextLine();
         //input for N[i]
         N[i]=n;
         i++;
         //update i
      }
      
      int k=0;
      while (k<N.length){
      //loop to upper case all the odd numbered words, 
        //and lowercase all the even numbered words 
         String word=N[k];//assign N[k] to word
         if (k%2!=0){
            word=word.toUpperCase();
            //Upper case if k is odd
            N[k]=word;
            //update N[k]
         }else{
            word=word.toLowerCase();
            //Lower case if k is even
            N[k]=word;
            //update N[k]
         }
         k++;
         //update k
      }
      
      System.out.println();
      System.out.println("Your sentence is: ");
      System.out.println();
      
      int j=0;
      while (j<N.length){
      //loop to print off the entire "sentence" word by word onto a single line
         if (j==N.length-1){
         //if it reach the last index of the array
               System.out.println(N[j]+".");
               //print last index with "."
            }else{
               System.out.print(N[j]+" ");
               //else print index with a space 
            }
         j++;
         //update j 
      }      
      
      System.out.println();
      System.out.println("As a string it would look like: ");
      System.out.println();
      
      System.out.println(Arrays.toString(N));
      //print array as String
      
   }//end main
      
}//close class