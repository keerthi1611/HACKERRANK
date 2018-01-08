
import java.util.Arrays;

import java.util.*;
import java.lang.*;

public class Solution {
  
   public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        int l=s.length();
       int a[]=new int[50];
       String c[]=new String[l];
       int i,j;
       for(i=0;i<=l;i++)
       {
           c[i]=s.substring(i,k);
           k++;
         
            
      }
       for(i=0; i < c.length; i++){
                        System.out.println(c[i]);
                }
      
      
       
    }
}
