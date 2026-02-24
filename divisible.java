//Wap to check whether a number is divisible by 5 and 11 or not.

import java.util.Scanner;
public class divisible {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number = ");
        int a = sc.nextInt();

        if((a%5==0)&&(a%11==0)){
            System.out.println(a+" is divisible by 5 & 11");
        }else{
            System.out.println(a+" is not divisible by 5 & 11");
        }
        sc.close();
    }
    
}
