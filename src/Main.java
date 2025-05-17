//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

        Teacher t = new Teacher(35, "Franz", "Patz", "HTL Bulme", "012354", 14, "816");
        Teacher t2 = new Teacher(40, "Simon", "Gunacker", "Programmier keller", "012355", 17, "905");


        Students s = new Students(14, "Erik", "Wendler", "Unbeckannt(vor den Ops versteckt)", "012355", "1234", "816");
        Students s2 = new Students(18, "Adem", "Merdicz", "St Peter", "012356", "1235", "816");
        Students s3 = new Students(18, "Rami", "Murrabi", "GYM", "012357", "1236", "816");


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