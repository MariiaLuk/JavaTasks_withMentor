package week6;

public class Task1_String_PasswordValidation {
    /*
    String -- Password Validation Task
        1. Write a return method that can verify if a password is valid or not.
        requirements:
        1. Password MUST be at least have 6 characters and should not contain space
        2. PassWord should at least contain one upper case letter
        3. PassWord should at least contain one lowercase letter
        4. Password should at least contain one special characters
        5. Password should at least contain a digit
     */
    public static void main(String[] args) {
        System.out.println(isValid("iH5hszhz hszh"));
    }

    public static boolean isValid(String password){
      if(password.length()<6){
          return false;
      }
      boolean doesntHaveSpace = true;
      boolean hasUpperCase = false, hasLowerCase = false, hasSpecialChar = false, hasDigit = false;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if(Character.isSpaceChar(ch)){
                doesntHaveSpace = false;
            }else if(Character.isUpperCase(ch)){
                hasUpperCase = true;
            }else if(Character.isLowerCase(ch)){
                hasLowerCase = true;
            }else if (Character.isDigit(ch)){
                hasDigit = true;
            }else{
                hasSpecialChar = true;
            }
        }
        return doesntHaveSpace && hasUpperCase && hasLowerCase && hasSpecialChar && hasDigit;
    }

}
