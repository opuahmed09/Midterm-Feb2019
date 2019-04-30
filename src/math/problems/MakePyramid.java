package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

                *
               * *
              * * *
             * * * *
            * * * * *
           * * * * * *

         */
        int num=10;
        for(int i =0; i<num; i++){
            for(int t=num-1;t>=i;t--){

            }
            for (int q=0;q<=i;q++){
                System.out.println("* ");
            }
            System.out.println(" ");
        }


    }
}
