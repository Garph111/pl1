import java.util.Scanner;
public class App {

   public static void main(String[] args) {
    String name = "";
    String newname = "";
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a name: "); 
    name = scanner.nextLine();

    
    while("Quit".equals(name) == false){
        newname += name;
        System.out.println(newname);
        System.out.println("Enter your name: "); 
        name = scanner.nextLine();
        
        
    }

    }

   } 

