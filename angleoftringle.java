//Wap  to input angles of a triangle and check whether triangle is valid or not.

import java.util.Scanner;
public class angleoftringle {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter angle a = ");
        int a = sc.nextInt();

        System.out.print("Enter angle b = ");
        int b = sc.nextInt();

        System.out.print("Enter angle c = ");
        int c = sc.nextInt();

        if(a+b+c==180){
            System.out.println("Triagle is velid");
        }else{
            System.out.println("Triangle is not velid");
        }
        sc.close();

    }
    
}
