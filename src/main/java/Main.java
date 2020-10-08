import com.ipiecoles.java.java220.Employe;
import org.joda.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Employe employe1 = new Employe("Eric", "Tran", "12345", LocalDate.parse("1970-01-01"), 500.0);
        Employe employe2 = new Employe("Eric", "Tran", "12345", LocalDate.parse("1970-01-01"), 500.0);
        System.out.println(employe1.toString());
        if (employe2.equals(employe1) == true)
            System.out.println("employe2 = employe1");
    }
}
