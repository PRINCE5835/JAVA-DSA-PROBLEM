// Write a program to find maximum beetween two numbers.

import java.util.Scanner;
public class max3 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1 = ");
        int a = sc.nextInt();

        System.out.print("Enter number 2 = ");
        int b = sc.nextInt();

        System.out.print("Enter number 3 = ");
        int c = sc.nextInt();

         System.out.print("Maximum number is = ");
        
         if(a>b&a>c){
                System.out.println(""+a);
        }else if(b>a&b>c){
                System.out.println(""+b);  
        }else if(c>a&c>b){
                System.out.println(""+c);
           sc.close();  
        }   
    }
}
