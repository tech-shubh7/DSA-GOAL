public class CheckPasswordStrength {
    public static String check(String password) {
        if (password == null || password.length() < 8) {
            return "poor";
        }

        boolean hasLower = password.matches(".*[a-z].*");
        boolean hasUpper = password.matches(".*[A-Z].*");
        boolean hasDigit = password.matches(".*\\d.*");
        boolean hasSpecial = password.matches(".*[^a-zA-Z0-9].*");

        if (hasLower && hasUpper && hasDigit && hasSpecial) {
            return "very good";
        }
        if (hasSpecial) {
            return "good";
        }
        return "bad";
    }

    public static void main(String[] args) {
        System.out.println(check("12345"));
        System.out.println(check("gewwgdd323"));
        System.out.println(check("gewwgdd323$"));
        System.out.println(check("Gewwgdd323$"));
    }
}
