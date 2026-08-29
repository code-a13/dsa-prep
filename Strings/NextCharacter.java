package Strings;

import java.util.Scanner;

public class NextCharacter {

    public String nextChar(String str){
        String chr ="";
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i)=='z'|| str.charAt(i)=='Z'){
                chr += (char) (str.charAt(i)-25);
            }
            else{
                chr += (char) (str.charAt(i)+1);
            }
        }
        return chr;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        NextCharacter nc = new NextCharacter();
        System.out.println(nc.nextChar(s));
        sc.close();
    }
}
