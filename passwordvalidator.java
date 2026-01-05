import java.util.*;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter passwords separated by commas:");
        String input = sc.nextLine();
        String[] passwords = input.split(",");
        List<String> result = new ArrayList<>();

        for (String p : passwords) {
            p = p.trim();
            if (p.length() >= 6 && p.length() <= 12) {
                if (p.matches(".*[a-z].*") && 
                    p.matches(".*[A-Z].*") && 
                    p.matches(".*[0-9].*") && 
                    p.matches(".*[$#@].*")) {
                    result.add(p);
                }
            }
        }
        System.out.println(String.join(",", result));
    }
}