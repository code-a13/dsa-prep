package Strings;

public class Problem {
    void main() {
        String n = "10101101001";
        int max = 0;
        int a = 0;
        int b = 0;
        for(int i = 0;i<n.length();i++){
            int count = 0;
            for(int j = i;j<n.length();j++){
                if(n.charAt(j)=='1'){
                    count++;
                }
                else{
                    count--;
                }
                if(count == 0){
                    if(max<=j-i){
                        max = j-i;
                        a = i;
                        b = j;
                    }

                }
            }
        }
        System.out.println("Max: "+(max+1));
        for(int i = a;i<=b;i++){
            System.out.print(n.charAt(i));
        }
    }
}