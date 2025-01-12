public class PasswordVerifyException extends Exception {
    //stores username if it doesnt meet criteria
    private String username;
    //stores password if it doesnt meet criteria
    private String password;

    // Constructor that takes username and password as parameters
    public PasswordVerifyException(String username, String password) {
        //message to be shown when either username or password is incorrect
        super("Invalid username or password. Please try again." );
        this.username = username;
        this.password = password;
    }

    // Getter methods for username and password
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}