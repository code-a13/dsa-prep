
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Problem1{
    public static void main(String[] args) {
        List<Character> s = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String input = sc.nextLine();
        for(int i = 0;i<input.length();i++){
            s.add(input.charAt(i));
        }
        reverseString(s);
        for(int i = 0;i<s.size();i++){
            System.out.print(s.get(i));
        }
        sc.close();
    }
    public static  void reverseString(List<Character> s) {
        
        List<Character> temp = new ArrayList<>(s.size());
        for(int i = 0;i<s.size();i++){
            temp.add(' ');
        }

        for(int i = 0;i<s.size();i++){
            temp.set(i,s.get(s.size()-i-1));
        }

        for(int i = 0;i<s.size();i++){
            s.set(i,temp.get(i));
        }
    }
}