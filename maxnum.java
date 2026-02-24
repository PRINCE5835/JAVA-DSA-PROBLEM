// Write a program to find maximum beetween two numbers.

import java.util.Scanner;
public class maxnum {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number 1 = ");
        int a = sc.nextInt();

        System.out.print("Enter the number 2 = ");
        int b = sc.nextInt();

        if(a>b){
            System.out.println("Maximum number is = "+a);
        }else{
            System.out.println("Maximum number is = "+b);
        }sc.close();
    }

    
}
