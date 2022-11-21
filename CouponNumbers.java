import java.util.Scanner;
import java.util.Random;

public class CouponNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Distinct cupon num :");
        int N = sc.nextInt();
        
        int total=0;
        int randomnum = (int)Math.random();
        System.out.println(randomnum);
        for(int i=0; i<N; i++){
            if(N!=randomnum)
                total+=randomnum;
            else  
                System.out.println("it is a same num");
        }
        System.out.println(total);
    } 
}
