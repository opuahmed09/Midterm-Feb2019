package string.problems;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        Set<String> duplicates= duplicateWords(st);
        System.out.println("Duplicate words are :- "+ duplicates);

    }

    private static Set<String> duplicateWords(String x) {
        if (x==null || x.isEmpty()){
            return Collections.emptySet();
        }
        Set<String> duplicate =new HashSet<>();
        String[] words=x.split("\\s+");
        Set <String> set=new HashSet<>();
        for (String word :words){
            if(set.add(word)){
                duplicate.add(word);
            }
        }return duplicate;
    }

}
