class FibonacciSeries{
    
    public static void main(String args[]){
        System.out.println("Fibonacci Series till 15 terms :");
        int n1=0, n2=1, n3;
        int count = 15;
        for(int i=2;i<count;i++){
          n3 = n1+n2;
          n1=n2;
          n2=n3;
          System.out.print(n1+",");

        }
    }
    
}