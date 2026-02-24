//WAP to input month number and print month name.

import java.util.Scanner;
public class monthnumber {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number = ");
        int a = sc.nextInt();
        
        System.out.print("This is a ");
        if(a==1){
            System.out.println("January");
        }else if(a==2){
            System.out.println("Febuary");
        }else if(a==3){
            System.out.println("March");
        }else if(a==4){
            System.out.println("April");
        }else if(a==5){
            System.out.println("May");
        }else if(a==6){
            System.out.println("June");
        }else if(a==7){
            System.out.println("July");
        }else if(a==8){
            System.out.println("Augaust");
        }else if(a==9){
            System.out.println("September");
        }else if(a==10){
            System.out.println("Octomber");
        }else if(a==11){
            System.out.println("November");
        }else if(a==12){
            System.out.println("December");
        }else{
            System.out.println( "not velid month number");
        }
        sc.close();
    }
    
}

