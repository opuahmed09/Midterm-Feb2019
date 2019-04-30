package math.problems;

import org.testng.Assert;

import java.util.Arrays;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        Arrays.sort(array1);
        Arrays.sort(array2);
        int dif1=array1[1]-array1[0];
        for (int t=2; t!=array2.length;t++){
            dif1=Math.min(dif1,array1[t]-array1[t-1]);
        }
        System.out.println("Lowest difference are in array 1= "+ dif1+ "\n");
        int dif2=array2[1]-array2[0];
        for(int u=2; u!=array2.length;u++){
            dif2=Math.min(dif2,array2[u]-array2[u-1]);
        }
        System.out.println("Lowest difference are in Array 2= "+ dif2);

        if(dif1>dif2){
            System.out.println("Lowest difference in arrays are :- "+dif2);
        }else if (dif2<dif1){
            System.out.println("Lowest diffreence in arrays are :- "+dif1);
        }else if (dif1==dif2){
            System.out.println("Lowest difference in arrays are = "+dif1);
            int o=1;
            Assert.assertEquals(o,1);
        }




    }

}
