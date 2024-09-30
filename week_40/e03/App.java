import java.util.Scanner;
public class App {

   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("What's your name?"); 
    String name = scanner.nextLine();
    if("Louis".equals(name) == true){
        System.out.println("Are you French?");
    }else{
        System.out.println("You have a great name.");
    }

    }

   } 

