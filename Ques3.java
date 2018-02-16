import java.util.*;

public class Ques3 {
    private static void frequencyOfChars(String s) {
        Map< Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        Set keys = map.keySet();
        Iterator setIterator = keys.iterator();
        while(setIterator.hasNext()) {
            char key = (char) setIterator.next();
            int freq = map.get(key);
            System.out.println("Character : " + key + " Number of Occurences : " + freq);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string.");
        String inputString = sc.next();
        frequencyOfChars(inputString);
    }
}
