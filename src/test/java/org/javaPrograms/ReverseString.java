package org.javaPrograms;

public class ReverseString {

    public char[] reverseString(char[] s) {

        //char[] character = s.toCharArray();
        int i=0;
        int j = s.length-1;
        System.out.println(s.length);
        while(i<j)
        {
            char temp=s[i];
            s[i++]=s[j];
            s[j--] = temp;
        }

        return s;

    }

    public static void main(String args[]) {
        ReverseString cl =  new ReverseString();
        char[] s = {'h','e','l','l','o'};
        System.out.println(cl.reverseString(s));

        System.out.println("Modulus"+5%2);

        System.out.println("Divide"+5/2);

    }
}