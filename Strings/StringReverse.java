package Strings;
import java.util.*;
public class StringReverse
{
    static String reverseString(String str){
        String s = "";
        for(int i = str.length()-1;i>=0;i--){
            s += str.charAt(i);
        }
        return s;
    }

    static String reverseString(String str, int n){
        if(n<0){
            return "";
        }
        return  str.charAt(n)+ reverseString(str,n-1);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println("Normal");
        System.out.println(StringReverse.reverseString(str));
        System.out.println("Recursion");
        System.out.println(StringReverse.reverseString(str,str.length()-1));
    }
}

