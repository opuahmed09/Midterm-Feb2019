package string.problems;

public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        ptation (" ", "DAB");
    }
    private static void ptation(String p,String t){
        int v=t.length();
        if (v==0){
            System.out.println(p);
        }else {
            for(int b=0; b<v; b++){
                ptation(p+t.charAt(b),t.substring(0,b)+t.substring(b+1,v));
            }
        }
    }
}
