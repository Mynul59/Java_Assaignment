/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_assaignment;
import java.util.Scanner;
public class FibonacciReference {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         System.out.print("How many numbers you want : ");
         int n=input.nextInt();
         
         int first=0;
         int second=1;
         int f;
         System.out.print(first+" "+second);
         
         
         for(int i=3;i<=n;i++)
         {
             f=first+second;
             System.out.print(" "+ f);
          first=second;
          second=f;
             
             
         }
         
         
    }
}
