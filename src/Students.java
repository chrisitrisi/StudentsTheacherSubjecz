import java.util.HashMap;
import java.util.LinkedList;

public class Students {
    private String name;
    private int alter;
    private final String studentID;
    private String className;
    private HashMap<Double, Boolean> fehlstunden; // Fehlstunden, ist enschuldigt
    private HashMap<String, Double> grades;       // Fach, Note

    public Students(String name, int alter, String studentID, String className) {
        this.name = name;
        this.alter = alter;
        this.studentID = studentID;
        this.className = className;
        this.grades = new HashMap<String, Double> ();
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAlter() {
        return this.alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }


    public String getStudentID() {
        return this.studentID;
    }


    public String getClassName() {
        return this.className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void setGrades(String fach, Double note) throws Exception {
        if (fehlstunden.containsKey(fach))
            if (note < 1.0 || note > 5.0) {
                this.grades.put(fach, note);
            }
            else {
                throw new Exception("Grades can only be between 1.0 and 5.0");
            }
        else {
            throw new Exception("Subject not Found");
        }
    }

    public Double getGrades(String fach) {
        return this.grades.get(fach);
    }



}
