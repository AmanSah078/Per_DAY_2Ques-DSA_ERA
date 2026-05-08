package Dsa_Once_Again.Array_Pattern5_HashMap;

import java.util.HashMap;
import java.util.Map;

public class Dublicates_Element {

    public static boolean containsDuplicate(int[] arr) //this is one method
    {
        Map<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            if(hm.containsKey(arr[i]))
            {
                return true;
            }

            hm.put(arr[i],i);
        }

        return false;
    }

    public static void main(String[] args)
    {
        int[] arr = {1,2,3,1};

        System.out.println(containsDuplicate(arr));
        System.out.println(containsDuplicate(arr));
    }
}