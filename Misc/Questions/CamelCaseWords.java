package Questions;

import java.util.Scanner;

public class CamelCaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        
        int n = input.length();
        int start = 0;
        
        for (int i = 0; i < n; i++) {
            char c = input.charAt(i);
            if (Character.isUpperCase(c)) {
                String word = input.substring(start, i);
                System.out.println(convertCase(word));
                start = i;
            }
        }
        
        String lastWord = input.substring(start);
        System.out.println(convertCase(lastWord));
    }
    
    public static String convertCase(String word) {
        char[] result = new char[word.length()];
        
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (Character.isUpperCase(c)) {
                result[i] = Character.toLowerCase(c);
            } else {
                result[i] = Character.toUpperCase(c);
            }
        }
        
        return new String(result);
    }
}