//WAP to check whwther a character is alphabet or not.

import java.util.Scanner;
public class character {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Character = ");
        char ch = sc.next().charAt(0);
        
        if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println(ch +" is a Alphabet");
        }else{
            System.out.println(ch +" is not a Alphabet");
        }sc.close();
    }
}
