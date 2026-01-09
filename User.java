import java.net.SocketOption;
import java.sql.SQLOutput;
import java.time.LocalDate;
public class User {
    protected String name ;
    protected LocalDate dob ;  // current date
    public User(){
        this.name = null;
        this.dob =  LocalDate.now();
    }

    public User(String name,int year , int month , int day) {
        this.name = name;
        this.dob = LocalDate.of(year,month,day);

    }
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDob(){
        return dob;
    }
    public void setDob(LocalDate dob){
        this.dob = dob;

    }
    public void displayInfo(){
        System.out.println("name :" + this.name);
        System.out.println("Birthday :" + this.dob);
    }
}
