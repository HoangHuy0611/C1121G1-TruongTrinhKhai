package ss19_string_and_regex.thuc_hanh.validate_email;

public class EmailExampleTest {
    private static EmailExample emailExample;
    public static final String[] validEmail = new String[] {"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com", "truongtrinhkhaidng@gmail.com"};
    public static final String[] invalidEmail = new String[] {"@gmail.com", "ab@gmail.", "@#abc@gmail.com", "trinhkhai21@icloud.com"};

    public static void main(String[] args) {
        emailExample = new EmailExample();
        for (String email: validEmail) {
            boolean isValid = emailExample.validate(email);
            System.out.println("Email is " + email + " is valid: " + isValid);
        }
        for (String email: invalidEmail) {
            boolean isValid = emailExample.validate(email);
            System.out.println("Email is " + email + " is valid: " + isValid);
        }
    }
}