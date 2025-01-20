public class Pet {
    // Members
    public int petAge;
    public String petName;
    public String petSpecies;
    
    // Constructor
    public Pet(int age, String name, String species) 
    {
        /* ------------------------------ this function ----------------------------- */
        // this is used on the memebers of the class, not on the parameters
        this.petAge = age;
        this.petName = name;
        this.petSpecies = species;

    }
    
    /* ----------------------- ovrloading a counstructor ------------------------ */
    // this will defult the pet as a "Dog" when only two arguments are given
    public Pet(int age, String name)
    {
        this.petAge = age;
        this.petName = name;
        this.petSpecies = "Dog";
    }
    /* --------------------------------- getters -------------------------------- */
    public int getAge() { return this.petAge; }
    
    public String getName() { return this.petName; }

    public String getSpecies() { return this.petSpecies; }

    /* --------------------------------- setters -------------------------------- */
    public void setAge(int age) { this.petAge = age;}    
        
    public void setName(String name) { this.petName = name;}
        
    public void setSpecies(String species) { this.petSpecies = species;}

    /* --------------------------------- __str__ -------------------------------- */
    public String toString()   // printing a statement for the object
    { return this.petName+" pet is a "+ this.petSpecies +" that is " + this.petAge + " year(s) old."; }

    /* ---------------------------------- extra --------------------------------- */
    public void sound(){System.out.println("Wuf Wuf!");}

    /* --------------------------- creating an object --------------------------- */
    public static void main(String[] args) 
    {
        Pet ciu = new Pet(12, "Ciu", "Dog");
        System.out.println(ciu.getName() + " is a " + ciu.getSpecies() + " that is " + ciu.petAge + " year(s) old!");

        System.out.println(ciu);

        Pet rawr = new Pet(1, "rawr");
        System.out.println(rawr);
    }
    

}
