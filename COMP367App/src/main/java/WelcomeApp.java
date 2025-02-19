import java.time.LocalTime;

public class WelcomeApp {
    
     public static void main(String[] args) {
        String name = "Neha";  
        LocalTime currentTime = LocalTime.now();
        
        if (currentTime.isBefore(LocalTime.NOON)) {
            System.out.println("Good morning, " + name + ", Welcome to COMP367");
        } else {
            System.out.println("Good afternoon, " + name + ", Welcome to COMP367");
        }
    }
}
