package Strings;

import java.util.Scanner;

public class WordReverse {
    public String wordReverse(String s){
        String str = "";
        int k = s.length()-1;
        for(int i = s.length()-1;i>=0;i--){
            if(s.charAt(i)==' '|| i ==0){
                int j = (i == 0) ? i : i + 1;
                while(j<=k){
                    str += s.charAt(j);
                    j++;
                }
                if(i != 0){
                    str += " ";
                }
                k = i;
            }
        }
        return str;
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        WordReverse wd = new WordReverse();
        System.out.println(wd.wordReverse(s));
        sc.close();
    }
}
