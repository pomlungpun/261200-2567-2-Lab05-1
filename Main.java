import java.io.BufferedReader;
import java.time.LocalDate;
public class Main{
    public static void main(String[] args){
        User john = new User("John", 1954, 2, 18);
        john.displayInfo();

        User pom = new User();
        pom.displayInfo();

        System.out.println("---------------------admin------------------------");
        Admin nicolas = new Admin("Nicolas", 1964, 1, 7);
        nicolas.displayInfo();

        System.out.println("------------ Overloading ----------------------");

        nicolas.displayInfo(true);
        System.out.println("------------ Overloading ----------------------");
        nicolas.displayInfo(false);
    }
}
