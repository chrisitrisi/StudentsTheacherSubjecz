import java.util.LinkedList;

public class Teacher extends Mensch {
    private int capacity;
    private String roomNumber;
    private LinkedList<Students> Students;
    private LinkedList<String> teachingSubjects;

    public Teacher(int alter,String vorname, String nachname,String addresse, String sozialversicherungsnummer, int capacity, String roomNumber) {
        super(alter, vorname, nachname, addresse, sozialversicherungsnummer);
        this.capacity = capacity;
        this.roomNumber = roomNumber;
        this.Students = new LinkedList<Students> ();
        this.teachingSubjects = new LinkedList<String> ();
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setName(int capacity) {
        this.capacity = capacity;
    }

    public String getRoomNumber() {
        return this.roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void addStudent(Students student) throws Exception{
        if (!(capacity <= this.Students.size() || !Students.contains(student)) )
            this.Students.add(student);
        else {
            throw new Exception("To many Students or Student allready in it");
        }
    }

    public void removeStudent(String student) throws Exception{
        int index = Students.indexOf(student); // -1 when not found
        if (index != -1) {
            Students.remove(index);
        }
        else {
            throw new Exception("Student not found");
        }
    }

    public void addTeachingSubject(String Subject) {
        teachingSubjects.add(Subject);
    }
}
