Q.4.

        import java.util.HashSet;
import java.util.Set;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String str = "hello world";
        Set<Character> uniqueChars = new HashSet<>();
        Set<Character> duplicateChars = new HashSet<>();

       
        for (char c : str.toCharArray()) {
            
            if (!uniqueChars.add(c)) {
               
                duplicateChars.add(c);
            }
        }

        if (!duplicateChars.isEmpty()) {
            System.out.println("Duplicate characters: " + duplicateChars);
        } else {
            System.out.println("No duplicate characters found.");
        }
    }
}


