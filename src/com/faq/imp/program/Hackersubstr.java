package com.faq.imp.program;
import java.util.Scanner;

public class Hackersubstr {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        smallest=s.substring(0,k); // ava
        largest=s.substring(0,k);  // wel
        
        for(int i=0;i<=s.length()-k;i++) {
            String str = s.substring(i,k+i);  // elc,lco,com 
            
            if(smallest.compareTo(str)>0) {
                smallest=str;
            }
            
            if(largest.compareTo(str)<0) {
                largest=str;
            }
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}