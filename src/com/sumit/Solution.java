package com.sumit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Solution {
	
   public static List<Integer> arrayRankTransform(int[] arr) {
        
        HashMap<Integer,Integer>hm = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        int[] tempArray = new int[arr.length];
        
        
        //Copying original array to an temporary array before modifying
        for(int i =0 ;i<arr.length;i++)
        {
            tempArray[i] = arr[i];
        }
        
        //Sort original array in increasing order.
        Arrays.sort(tempArray);
        
        
        for(int i =0;i<tempArray.length;i++)
        {
        	//if no key, increase the map size by 1 and store it as value for current key
            if(!hm.containsKey(tempArray[i]))
            {
                hm.put(tempArray[i],hm.size()+1);
            }
        }
        
        
        for(int i =0; i<arr.length;i++)
        {
        	//putting the rank at their proper index in original array 
            arr[i]=hm.get(arr[i]);
            list.add(arr[i]);
        }
        
        return list;
        
  }
   
   public static void main(String[] args) {
	   
	   int [] arr = {100,100,100};
	   
	   int [] arr2 = {40,10,20, 30};
	   
	   System.out.println(Solution.arrayRankTransform(arr));
	   
	   System.out.println(Solution.arrayRankTransform(arr2));
	
   }
}