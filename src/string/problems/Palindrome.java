package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        Palindrome pilandrome= new Palindrome();
        String pil="DAD";
        pilandrome.pilldrome(pil);


    }
    public void pilldrome(String p){
        for (int q=0; q<p.length()/2; q++){
            if(p.charAt(q)==p.charAt(p.length()-q-1)){
                System.out.println("The Word is Palindrome");
            }else
                System.out.println("The Word is NOt PaildROME");

        }
    }
}
