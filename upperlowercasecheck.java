//Wap to check whether a character is uppercase or lowercase alphabet.

import java.util.Scanner;
public class upperlowercasecheck {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter character = ");
        char ch = sc.next().charAt(0);
        

        if(Character.isLowerCase(ch)){
            System.out.println("This character is lowercase");
        }else  if(Character.isUpperCase(ch)){
            System.out.println("This character is uppercase");
        }else{
            System.out.println("Enter velid character");
        }
        sc.close();
    }
    
}
