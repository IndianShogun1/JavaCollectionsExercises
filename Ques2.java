import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ques2 {
    private static int uniqueChars(String s) {
        Set set = new HashSet();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        }
        return set.size();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string.");
        String inputString = sc.nextLine();
        System.out.println("Number of unique elements is " + uniqueChars(inputString));
    }
}
