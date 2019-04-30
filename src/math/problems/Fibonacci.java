package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
         Fibonacci fibonacci=new Fibonacci();
         fibonacci.fibonaccik(40);



    }
    public void fibonaccik(int t){
        int a =0;
        int b =1;
        int c =a+b;
        System.out.println("Fibonacci numbers " + t+" are ");
        for(int d=0; d<=t; d++){
            System.out.println(a+" ");
            a=b;
            b=c;
            c=a+b;
        }
    }
}
