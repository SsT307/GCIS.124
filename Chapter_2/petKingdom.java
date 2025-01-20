// In java you dont have to import any file as long as they are in the same folder
public class PetKingdom {
    public static void main(String[] args) {
        Pet cat = new Pet(5, "Oreo","Cat");
        Pet rabbit = new Pet(1, "Bunny", "Rabbit");
        Pet cow = new Pet(3, "Milka", "Cow");

        System.out.println(cat);

        // every class in java by defult has defult constructor which is empty 
        PetKingdom pk = new PetKingdom();
    }
}
