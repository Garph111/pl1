import java.util.Scanner;
public class App {

   public static void main(String[] args) {
    String reverse = "";
    Scanner scanner = new Scanner(System.in);
    System.out.println("Palindrome test, please enter some text: "); 
    String word = scanner.nextLine();
    for(int i = word.length() - 1; i >= 0; i--)
    {
        while(!(word.charAt(i) >= 54 && word.charAt(i) <= 90 || 
        word.charAt(i) >= 97 && word.charAt(i) <= 122 )){
            i--;
            
        }
            reverse += Character.toString(word.charAt(i));
        }
        
        
        
        
    
    String newword = "";
    for(int j = 0; j < word.length() - 1; j++){
        while(!(word.charAt(j) >= 54 && word.charAt(j) <= 90 || 
        word.charAt(j) >= 97 && word.charAt(j) <= 122 )){
            j++;
            
        }
            newword += Character.toString(word.charAt(j));
        }
        
    
    System.out.println(reverse);
    System.out.println(newword);
    if(newword.equalsIgnoreCase(reverse)){
        System.out.println(word + " is a palindrome");
    }else{
        System.out.println(word + " is not a palindrome");
    }
    }
}


    

    
   

