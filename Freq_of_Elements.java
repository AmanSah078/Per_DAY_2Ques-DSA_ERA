package Dsa_Once_Again.Array_Pattern5_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Freq_of_Elements {

     public static void main(String[] args) {
         int[] arr={1,2,2,3,1};
         Map<Integer,Integer> hm=new HashMap<Integer,Integer>();

         //this is compulosry
         for(int i=0;i<arr.length;i++)
         {
             hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
         }
         System.out.println(hm);
     }
}

