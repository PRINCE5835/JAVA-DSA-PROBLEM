//WAP to input week number and print week day.

import java.util.Scanner;
public class weekdays {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number = ");
        int a = sc.nextInt();
        
        System.out.print("This is a ");
        if(a==1){
            System.out.println("Monday");
        }else if(a==2){
            System.out.println("Tuesday");
        }else if(a==3){
            System.out.println("Wednusday");
        }else if(a==4){
            System.out.println("Thrusday");
        }else if(a==5){
            System.out.println("Friday");
        }else if(a==6){
            System.out.println("Sutarday");
        }else if(a==7){
            System.out.println("Sunday");
        }else{
            System.out.println("not velid week number");
        }
        sc.close();
    }
    
}
