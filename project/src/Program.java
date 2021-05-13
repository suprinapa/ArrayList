import java.util.ArrayList;


public class Program {
    public static void main(String args[]) {

        Courses java = new Courses();
        java.Courseid = 1;
        java.CourseName="java";

        Courses Python = new Courses();
        Python.Courseid = 2;
        Python.CourseName="Python";

        Courses PHP = new Courses();
        PHP.Courseid =3;
        PHP.CourseName="PHP";

        Courses Cpp = new Courses();
        Cpp.Courseid =3;
        Cpp.CourseName="PHP";

        Vehicle TwoWheeler = new Vehicle();
        TwoWheeler.vid = 1;
        TwoWheeler.vehicleName="Bike";

        Vehicle FourWheeler = new Vehicle();
        FourWheeler.vid = 2;
        FourWheeler.vehicleName="Car";

        Person p = new Person();
        p.PersonId = 1;
        p.FirstName = "Suprina";
        p.LastName = "Paudel";
        p.YearOfBirth = 1998;
        p.Country = "Nepal";
        p.PersonCourses.add(java);
        p.PersonCourses.add(Python);
        p.PersonCourses.add(PHP);
        p.PersonVehicles.add(TwoWheeler);


        Person n = new Person();
        n.PersonId = 2;
        n.FirstName = "Narayan";
        n.LastName = "Paudel";
        n.YearOfBirth = 1968;
        n.Country = "Nepal";
        n.PersonCourses.add(PHP);
        n.PersonVehicles.add(FourWheeler);

        ArrayList<Person> listOfPerson = new ArrayList();

        listOfPerson.add(p);
        listOfPerson.add(n);


        for(int i=0;i<listOfPerson.size();i++) {
            Person myPerson = listOfPerson.get(i);
            int thisPersonAge = myPerson.CalculateAge();
           System.out.println("age of this person is" + thisPersonAge);

           //To access Courses used
            ArrayList<Courses> thisPersonCourses = myPerson.PersonCourses;
            for (int j = 0; j < thisPersonCourses.size(); j++) {
                Courses myCourses = thisPersonCourses.get(j);
                System.out.println(myPerson.FirstName + " took the course " + myCourses.CourseName);
            }
            // To access Vehicles used
            ArrayList<Vehicle> thisPersonVehicle = myPerson.PersonVehicles;
            for (int k = 0; k < thisPersonVehicle.size(); k++) {
                Vehicle myVehicle = thisPersonVehicle.get(k);
                System.out.println(myPerson.FirstName + " " + myPerson.LastName + " uses  " + myVehicle.vehicleName);
            }
        }
    }
}




