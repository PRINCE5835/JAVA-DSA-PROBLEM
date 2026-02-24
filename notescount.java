//WAP to count total number of notes in given amount.

import java.util.Scanner;
public class notescount {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int[] notes = {500,100,50,20,10,5,2,1};
        int[] count = new int[notes.length];

        System.out.print("Enter ammount = ");
        int a = sc.nextInt();

        for(int i=0;i<notes.length;i++){
            if(a >= notes[i]){
                count[i] = a/notes[i];
                a = a%notes[i];
            }
        }
        System.out.println("Number of notes ");
        for(int i=0;i<notes.length;i++){
            if(count[i] != 0){
                System.out.println(notes[i]+" = "+count[i]);
            }
        }
        sc.close();

    }
    
}
