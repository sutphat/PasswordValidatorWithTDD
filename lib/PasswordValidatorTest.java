package lib;

public class PasswordValidatorTest {
    public static void run() {
        System.out.println("\n-- Running Password Validator Tests --");

        // Test Case 1: Invalid password (too short)
       // String pw ="123" ;
        PasswordStrength result = PasswordValidator.validate("123");
        if (result == PasswordStrength.INVALID) {
            System.out.println("Test Case 1 Passed: Short password is INVALID.");
        } else {
            System.out.println("Test Case 1 FAILED: Expected INVALID but got " + result);
        }

        // Test Case 2: Weak password
        result = PasswordValidator.validate("abcdef1212");
        if (result == PasswordStrength.WEAK) {
            System.out.println("Test Case 2 Passed: Simple password is WEAK.");
        } else {
            System.out.println("Test Case 2 FAILED: Expected WEAK but got " + result);
        }
        // Test Case 3: 
        result = PasswordValidator.validate("abc123");
        if (result == PasswordStrength.MEDIUM) {
            System.out.println("Test Case 3 Passed: password is MEDIUM.");
        } else {
            System.out.println("Test Case 3 FAILED: Expected MEDIUM but got " + result);
        }
        //4
         result = PasswordValidator.validate("Abc123");
        if (result == PasswordStrength.STRONG) {
            System.out.println("Test Case 4 Passed: password is STRONG.");
        } else {
            System.out.println("Test Case 4 FAILED: Expected STRONG but got " + result);
        }
        
        
    }
}