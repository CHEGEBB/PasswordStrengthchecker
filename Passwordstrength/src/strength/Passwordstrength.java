package strength;
import java.util.Scanner;

public class Passwordstrength {

    public static void main(String[] args) {
    	System.out.println("*****WRITTEN BY @PHILGABBY*****");
    	 String line = new String(new char[40]).replace('\0', '_');
    	  System.out.println(line);
        String password, specialCharacters = "!@#$%^&*()_-+=<>?";
        int i,Score =0;
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialCharacter = false;
        System.out.println("Enter Your Password:");
        Scanner input = new Scanner(System.in);
        password = input.next();
        int passwordLength = password.length();

        if (passwordLength >= 9) {
            System.out.println("***Password meets the minimum requirement***");
        } else {
            System.out.println("***Password too short!!!***");
        }

        for (i = 0; i < password.length(); i++) {
            char alphabet = password.charAt(i);

            if (alphabet >= 'A' && alphabet <= 'Z') {
                hasUppercase = true;
            } else if (alphabet >= 'a' && alphabet <= 'z') {
                hasLowercase = true;
            } else if (Character.isDigit(alphabet)) { 
                hasDigit = true;
            } else if (specialCharacters.contains(String.valueOf(alphabet))) {
                hasSpecialCharacter = true;
            }
        }

        if (hasUppercase && hasLowercase) {
            System.out.println("***Password contains both uppercase and lowercase letters.***");
        } else {
            System.out.println("***Password is missing either uppercase or lowercase letters.***");
        }

        if (hasDigit && hasSpecialCharacter) {
            System.out.println("***Password contains digits and special characters.***");
        } else {
            System.out.println("***Password is missing either digits or special characters.***");
        }
        if (passwordLength >= 9) {
        	Score+=3;
        }
        if (hasUppercase && hasLowercase) {
        	Score+=2;
        }
        if (hasDigit && hasSpecialCharacter) {
        	Score+=2;
        }
        if (Score >=7) {
        	System.out.println("**********Your Password is Strong and Secure.*********");
        }
        else {
        	System.out.println("**********Your Password is Weak and Insecure!!!**********");
        }
    }
}
