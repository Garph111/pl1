import java.util.Scanner;
public class App {

   public static void main(String[] args) {
    String name;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter your name: "); 
    name = scanner.nextLine();

    
    while("Quit".equals(name) == false){
        System.out.println(name);
        System.out.println("Enter your name: "); 
        name = scanner.nextLine();
        
        
    }

    }

   } 

