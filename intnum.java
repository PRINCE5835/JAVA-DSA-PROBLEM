//Write a program to check whether a number is negetive,positive or zero.

import java.util.Scanner;
public class intnum {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number = ");
        int a = sc.nextInt();

        if(a<0){
            System.out.println("Negetive number");
            }else if(a>0){
                System.out.println("Positive number");
            }else{
                System.out.println("Number is 0");
            }sc.close();   
    }
}
