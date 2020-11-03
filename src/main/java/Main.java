import com.ipiecoles.java.java220.Commercial;
import com.ipiecoles.java.java220.Employe;
import com.ipiecoles.java.java220.Manager;
import com.ipiecoles.java.java220.Technicien;
import org.joda.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //Employe employe1 = new Employe("Eric", "Tran", "12345", LocalDate.parse("1970-01-01"), 500.0);
        //Employe employe2 = new Employe("Eric", "Tran", "12345", LocalDate.parse("1970-01-01"), 500.0);
        Commercial commercial1 = new Commercial("Eric", "Tran", "12345", LocalDate.parse("1970-01-01"), 500.0, 1000000.0);
        Technicien technicien1 = new Technicien("Eric", "Tran", "12345", LocalDate.parse("1970-01-01"), 500.0, 5);
        Technicien technicien2 = new Technicien("Eric", "Tran", "12345", LocalDate.parse("1970-01-01"), 500.0, 5);
        Technicien technicien3 = new Technicien("Eric", "Tran", "12345", LocalDate.parse("1970-01-01"), 500.0, 5);
        Manager manager1 = new Manager();

        manager1.ajoutTechnicienEquipe(technicien1);
        manager1.ajoutTechnicienEquipe(technicien2);
        manager1.ajoutTechnicienEquipe(technicien3);

        //System.out.println(employe1.toString());
        //if (employe2.equals(employe1) == true)
            //System.out.println("employe2 = employe1");


    }
}
