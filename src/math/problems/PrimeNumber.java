package math.problems;

public class PrimeNumber {

    public static void main(String[] args) {
        /*
         * Find list of Prime numbers from number 2 to 1 million.
         * Try the best solution as possible.Which will take less CPU life cycle.
         * Out put number of Prime numbers on the given range.
         *
         *
         * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
         *
         */
        String pnumber="";
        for(int t=2;t<=100000; t++){
            int count =0;
            for (int n=t;n>=1;n--){
                if (t%n==0){
                    count=count+1;
                }
            }
            if (count==2){
                pnumber=pnumber+t+" ";

            }
        }
        System.out.println("Prime Numbers for 2 to 1000 are : "+pnumber);

    }

}
