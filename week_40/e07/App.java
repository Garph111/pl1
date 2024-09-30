import java.util.Scanner;
public class App {

   public static void main(String[] args) {
    int countUppercase = 0, countLowercase = 0, countDigit = 0;

    String error = "";
    Scanner scanner = new Scanner(System.in);
    System.out.print("Input: "); 
    String password = scanner.nextLine();
    if(password.length() < 8)
    {
        error += " Needs to be at least 8 characters long.";
    }
    for(int i = 0; i < password.length();i++ ){
        if(Character.isUpperCase(password.charAt(i)) == true){
            countUppercase ++;
        }
        if(Character.isLowerCase(password.charAt(i)) == true){
            countLowercase ++;
        }
        if(Character.isDigit(password.charAt(i)) == true){
            countDigit ++;
        }
    }
    if(countUppercase < 1){
        
        error += " Needs to include at least one uppercase letter.";
    }
    if(countLowercase < 1){
        
        error += " Needs to include at least one lowercase letter.";
    }
    if(countDigit < 1){
        
        error += " Needs to include at least one digit.";
    }

    while(error.length() > 1){
        System.out.println("Output: " + error);
        System.out.println("Input: ");
        password = scanner.nextLine();
    }

    System.out.println("Output: Password is valid.");
    


    }

    }

   

