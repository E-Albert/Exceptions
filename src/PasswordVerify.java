public class PasswordVerify {
    private String username;
    private String password;

    // Constructor that accepts username and password
    public PasswordVerify(String username, String password) throws PasswordVerifyException {
        this.username = username;
        this.password = password;
        checkUsername();
        checkPassword();
    }

    //checks if input username follows the rules
    private void checkUsername() throws PasswordVerifyException {
        if (username.length() == 10 && vowelCounter(username) >= 4) {
            // Rule 1: Username has 10 characters and at least 4 vowels
            return;
        }
        if (username.length() >= 5 && numberCounter(username) >= 3) {
            // Rule 2: Username has 5+ characters and at least 3 digits
            return;
        }
        // If both rules fail, throw exception
        throw new PasswordVerifyException(username, password);
    }

    //checks if input password follows the rules
    private void checkPassword() throws PasswordVerifyException {
        // Rule 1: Password has 20+ characters, 10 'E's
        // Rule 2: 3 special characters
        if (password.length() >= 20 && countOccurrences(password, 'E') >= 10 && specialCharCounter(password) >= 3) {
            return;
        }
        // If the password is invalid, throw exception
        throw new PasswordVerifyException(username, password);
    }

    // counts the amount of vowels in a string
    private int vowelCounter(String str) {
        int vowelsCount = 0;
        String vowels = "AEIOUaeiou";
        for (int i = 0; i < str.length(); i++) {
            if (vowels.indexOf(str.charAt(i)) != -1) {
                vowelsCount++;
            }
        }
        return vowelsCount;
    }

    // counts the number of digits in the string
    private int numberCounter(String str) {
        int digitsCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                digitsCount++;
            }
        }
        return digitsCount;
    }

    // counts how many times capital E occurs
    private int countOccurrences(String str, char target) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }

    // special character counter
    private int specialCharCounter(String str) {
        int specialCount = 0;
        String specialChars = "!@#$%^&*()-_+=<>?{}[]|/\\~`";
        for (int i = 0; i < str.length(); i++) {
            if (specialChars.indexOf(str.charAt(i)) != -1) {
                specialCount++;
            }
        }
        return specialCount;
    }

    //returns username
    public String getUsername() {
        return username;
    }
}
