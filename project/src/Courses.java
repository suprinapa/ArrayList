public class Courses {

    public int Courseid;
    public String CourseName;

    //Teacher name
    public String TeacherName() {
        String Name= "";
        if (CourseName == "Java") {
            Name= "Sulabh";
        } else if (CourseName == "Python") {
            Name= "Asha";
        }
        return Name;
    }

    }





