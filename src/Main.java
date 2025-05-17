//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        Teacher t = new Teacher("Pz", 5, "816");
        Teacher t2 = new Teacher("Gu", 15, "916");

        Students s = new Students("Adem", 18, "ADBCD", "3BHEL");
        Students s2 = new Students("Erik", 14, "ADBCDE", "3BHEL");
        Students s3 = new Students("Rami", 17, "ADBCDEF", "3BHEL");


        try {
            t.addStudent(s);
            t.addStudent(s2);
            t.addStudent(s3);

            t2.addStudent(s);
            t2.addStudent(s2);
            t2.addStudent(s3);

            t.addStudent(s);

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}