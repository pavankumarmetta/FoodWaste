package klu;

public class BCryptPasswordEncoder {
    // Simple demo implementation – in a production system, use a robust BCrypt library.
    public String encode(String rawPassword) {
        // For demonstration, simply prefix the password. DO NOT use in production!
        return "encoded:" + rawPassword;
    }
    
    public boolean matches(String rawPassword, String encodedPassword) {
        return encodedPassword.equals(encode(rawPassword));
    }
}
