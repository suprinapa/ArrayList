import java.util.ArrayList;
import java.util.Calendar;


public class Person {

    public int PersonId;
    public String FirstName;
    public String LastName;
    public String Country;
    public int YearOfBirth;
    public ArrayList<Courses> PersonCourses = new ArrayList<Courses>();
    public ArrayList<Vehicle> PersonVehicles = new ArrayList<Vehicle>();

    public int CalculateAge() {
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int PersonAge = YearOfBirth - year;
        return PersonAge;
    }

    public String FullName() {
        String Full = FirstName + LastName;
        return Full;
    }
    public String Greet(String lang){
        String FinalGreet="";
        if(lang == "Nepali"){
            FinalGreet="Namaste" + " " + this.FullName();
        }
        return FinalGreet;




    }

}


