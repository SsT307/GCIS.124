package Chapter_3;
/* ------------------------------ child of Goat ----------------------------- */
// DO IT YOURSELF
public class Fighter extends Goat {

    private final static int maxHealth = 150;

    public Fighter(String name) 
    {
        super(name, maxHealth , maxHealth); // HP is set to 150
    }

    public Attack attack()
    {
        int[] hits = {25};
        Attack strikes = new Attack("Cleave",hits, DamageType.Physical);
        return strikes;
    }

    /**
     * 
     * @param attack
     */
    public void takeDamage(Attack attack)
    {
        int hitsTotalDamage = 0;
        for(int i=0; i<attack.getHits()[i];i++)
            { hitsTotalDamage += attack.getHits()[i];}
        
        if (attack.getDamageType() == DamageType.Physical)
            { hitsTotalDamage *= 0.75; }
        if (attack.getDamageType() == DamageType.Magical)
            { hitsTotalDamage *= 1.25; }

        if(getCurrentHP()>=hitsTotalDamage)
            { setCurrentHP(getCurrentHP()-hitsTotalDamage); }
        else { setCurrentHP(0); }
    }
    

    public static void main(String[] args) {
        Mage MAGE1 = new Mage("Hairy Potter");
        Fighter FIGHTER1 = new Fighter("Darth Vader");
        Fighter FIGHTER2 = new Fighter("Nick Cage");

        System.out.println(FIGHTER1+"\n"+FIGHTER2+"\n"+MAGE1);

        Attack MAGEATTACK = MAGE1.attack();
        Attack FIGHTERATTACK = FIGHTER1.attack();

        FIGHTER2.takeDamage(FIGHTERATTACK);
        FIGHTER2.takeDamage(MAGEATTACK);
        MAGE1.takeDamage(FIGHTERATTACK);

        System.out.println(FIGHTER1+"\n"+FIGHTER2+"\n"+MAGE1);

        goatArena(MAGE1,FIGHTER1);

        Goat jackie = new Fighter("Connan");
        Goat fin = new Mage("Arnold");
        goatArena(jackie,fin);
    }

    public static void goatArena(Goat m, Goat f)
    // This object is a parent's objects, meaning it cannot see what is in the child classes, 
        // so we are gonna create the method of abstract to show that there exists these functions
    {
        while (m.isConscious() && f.isConscious()){
            m.takeDamage(f.attack());
            f.takeDamage(m.attack());

        }
        if(m.isConscious()){
            System.out.println("Winner is "+m.getName());
        } else if (f.isConscious()){
            System.out.println("Winner is "+f.getName());
        } else {
            System.out.println("No one wins.");
        }
    }
}
