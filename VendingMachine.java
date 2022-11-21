import java.util.*;
import java.lang.*;
public class VendingMachine {
    public static void FewestNotes(int Change){
        int[] ReturnedNotes = new int[] {1,2,5,10,50,100, 500, 1000};
        int[] count = new int[8];
       
        //count notes 
        for(int i=0; i<8; i++){
            if(Change>=ReturnedNotes[i]){
                count[i]=Change/ReturnedNotes[i];
                Change=Change%ReturnedNotes[i];
            }
        }
        // print notes
        System.out.println("Currency Count");
        for(int i=0; i<8;i++){
            if(count[i]!=0){
                System.out.println(ReturnedNotes[i]+ " : "+ count[i]);
            }
        }


    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Change in Rs to be returned : ");
        int Change = sc.nextInt();
        FewestNotes(Change);
    }
    
}
