import java.util.Scanner;

public class student {
    // Members
    private String name;
    private String lastName;
    private int id;
    private Grading grading;
    public static final double PI = 3.141592653589793238462643;
    // scanner for three objects of student using for loop

    // Constructor
    public student(String name, String lastName, int id, Grading grading)
    {
        /* ---------------------------- loading members ---------------------------- */
        this.name = name;
        this.lastName = lastName;
        this.id = id;
        this.grading = grading;
    }

    /* --------------------------------- getters -------------------------------- */
    // adding /** first then enter will make automatic @return, in the first line write what does the function do
    // in the second line after the @, write what it returns
    /**
     * Gets name value
     * @return String value
     */
    public String getName() { return this.name; }
    public String getLastName() { return this.lastName; }
    public int getId() { return this.id; }
    

    /* --------------------------------- setters -------------------------------- */
    /**
     * Setting new value for name
     * @param name new String value
     */
    public void setName(String name) { this.name = name; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setId(int id) { this.id = id; }

    /* ----------------------------------- str ---------------------------------- */
    @Override // to override the behavior from the parent
    public String toString() { return "The student is "+ this.name + " " + this.lastName + ", with the id of " + this.id + "got a "+ grading + "!"; }

    /* -------------------------------- equals() -------------------------------- */ /* --------------------------- operator overloading IMP! -------------------------- */
    public boolean equals(Object obj)
    {
        if(obj instanceof student) {
            student other = (student)obj;
            return this.name.equals(other.getName()) && this.lastName.equals(other.getLastName()) && this.id == other.getId();
        }
        return false;
    }
    /* -------------------- creating the objects with inputs -------------------- */
    public static void main(String[] args)
    {
    //     Scanner scanner = new Scanner(System.in);
    //     student[] students = new student[3];
    //     /* -------------------------- for loop for objects -------------------------- */
    //     for(int i = 0; i<students.length; i++) {
    //         /* --------------------------------- scanner -------------------------------- */
    //         System.out.println("Please enter the name of student "+(i+1)+": ");
    //         String name = scanner.nextLine();
    //         System.out.println("Please enter the last name of student"+(i+1)+": ");
    //         String lastName = scanner.nextLine();
    //         System.out.println("Please enter the id of student"+(i+1)+": ");
    //         int id = scanner.nextInt();
    //         scanner.nextLine();
    //         /* -------------------------- making of the obejcts ------------------------- */
    //         students[i] = new student(name, lastName, id, Grading.A);
    //         System.out.println("\n"+students[i]+ "\n");
    //     }
    //     scanner.close();
    
    Grading mark = Grading.A;
    System.out.println(mark.getPoints() + "\n" + mark.getDesc());
    mark = Grading.B;
    System.out.println(mark.getPoints() + "\n" + mark.getDesc());
    
    final double y = student.PI;
    System.out.println(y);
    }

    /* --------------------- source action getter and setter -------------------- */
    public Grading getGrades() {
        return grading;
    }
    public void setGrades(Grading grading) {
        this.grading = grading;
    }
    
    
}
