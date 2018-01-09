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
       String c[]=new String[(l-k)+1];
       int r=(l-k)+1;
       int i,j;
       char min=s.charAt(0);
       char max=s.charAt(0);
       int p=0,p1=0;
        TreeSet<String> a1=new TreeSet<String>();  
       for(i=0;i<r;i++)
       {
           a1.add(s.substring(i,k));
           k++;                        
      }
       System.out.println(a1.first());
        System.out.println(a1.last()); 
      
      
       
    }
}
