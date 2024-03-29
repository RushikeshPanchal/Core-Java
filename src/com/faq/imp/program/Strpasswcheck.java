package com.faq.imp.program;
// password checker with string Vimp
import java.util.*;
public class Strpasswcheck
{
public static int checkPassword(String str , int n) {
    if(n<4)
    return 0; // false bcaz return atleast 4 char
    
    if(str.charAt(0) >='0' && str.charAt(0) <='9')
    return 0;          // false case first letter doesn't contain number
    
    int num=0,cap=0;
    
    for(int i=0;i<n;i++) {
        if(str.charAt(i)==' ' || str.charAt(i)=='/')
        return 0;                             // false case except space and slash..otherspecial char will take
        if(str.charAt(i) >='A' && str.charAt(i) <='Z')
        cap++;                                         // true ..atleats one capital letter 
        if(str.charAt(i) >='0' && str.charAt(i) <='9')
        num++;                                         // true .. atleast one digit number
    }
    
    if(num > 0 && cap > 0)
    return 1;
    else
    return 0;
}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(checkPassword(str,str.length()));
	}
}


/* below is the problem statement
You are given a function.
int CheckPassword(char str[], int n);
The function accepts string str of size n as an argument. Implement the function which returns 1 if given string str is valid password else 0.
str is a valid password if it satisfies the below conditions.

– At least 4 characters
– At least one numeric digit
– At Least one Capital Letter
– Must not have space or slash (/)
– Starting character must not be a number
Assumption:
Input string will not be empty.

Example:

Input:
aA1_67
Output:
1

Sample Input:
a987 abC012
Output:
0*/