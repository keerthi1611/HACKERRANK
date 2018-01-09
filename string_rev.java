import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        StringBuffer sb=new StringBuffer(sc.next());
         String S1=sb.toString();
       StringBuffer rev=sb.reverse();
     
       String S=rev.toString();
       
       if(S1.compareTo(S)==0)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
        
    }
}
