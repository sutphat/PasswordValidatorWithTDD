package lib;

public class PasswordValidator {
    public static PasswordStrength validate(String password) {
        if (password.length() < 6) {
            return PasswordStrength.INVALID;
        }

        int score = 0;
        if (password.matches(".*[a-z].*")) score++;
        if (password.matches(".*[A-Z].*")) score++;
        if (password.matches(".*[0-9].*")) score++;
        if (password.matches(".*[!@#$%^&*()].*")) score++;

        if (score >= 3) return PasswordStrength.STRONG;
        else if (score == 2) return PasswordStrength.MEDIUM;
        else return PasswordStrength.WEAK;
    }
}