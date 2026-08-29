package Strings;

import java.util.Arrays;

public class Swap {

    public void chainWords(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            String currentWord = arr[i];

            if (currentWord == null || currentWord.isEmpty()) continue;

            char target = currentWord.charAt(currentWord.length() - 1);

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] != null && !arr[j].isEmpty() && arr[j].charAt(0) == target) {
                    String temp = arr[i + 1];
                    arr[i + 1] = arr[j];
                    arr[j] = temp;
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        String[] arr = {"train", "noble", "keplar", "eat"};
        String[] arr1 = {"train", "noble", "keplar", "eat", "reverse"};

        Swap r = new Swap();
        r.chainWords(arr);
        r.chainWords(arr1);
    }
}