import java.util.Scanner;

public class student {
    // Members
    public String name;
    public String lastName;
    public int id;
    public Grading grading;
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
    public String getName() { return this.name; }
    public String getLastName() { return this.lastName; }
    public int getId() { return this.id; }
    

    /* --------------------------------- setters -------------------------------- */
    public void setName(String name) { this.name = name; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setId(int id) { this.id = id; }

    /* ----------------------------------- str ---------------------------------- */
    @Override // to override the behavior from the parent
    public String toString() { return "The student is "+ this.name + " " + this.lastName + ", with the id of " + this.id + "got a "+ grading + "!"; }

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
    }

    /* --------------------- source action getter and setter -------------------- */
    public Grading getGrades() {
        return grading;
    }
    public void setGrades(Grading grading) {
        this.grading = grading;
    }
    
}
