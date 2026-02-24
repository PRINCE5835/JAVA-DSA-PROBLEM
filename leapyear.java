//WAP to check whether a year is leap year or not.

import java.util.Scanner;
public class leapyear {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the year = ");
        int a = sc.nextInt();

        if((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0)){
            System.out.println("Year is leap year");
        }else{
            System.out.println("Year is not leap");
        }sc.close();
    }
}
