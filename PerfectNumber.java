import java.util.Scanner;

public class PerfectNumber {
    static long isPerfect(long num)  { 
        long sum=0;  
//executes until the condition becomes false 
         for(int i=1; i <= num/2; i++)  
         {  
            if(num % i == 0)  {
                sum=sum + i;  

            }  
}  

//returns the sum of factors  
return sum;   
} //end of method  

    public static void main(String args[]){
        long number, s;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number :");
    number = sc.nextInt(); 
    s=isPerfect(number);
    if(s == number)
         System.out.println(number + " is a perfect number");
    else
        System.out.println(number + " is not a perfect number");
    
    }
}