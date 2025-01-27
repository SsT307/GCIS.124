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
        Mage m = new Mage("Hairy Potter");
        Fighter f = new Fighter("Darth Vader");

        System.out.println("Start Fighter health: " + f.getCurrentHP());
        System.out.println("Start Mage health: " + m.getCurrentHP());

        m.takeDamage(f.attack());
        f.takeDamage(m.attack());

        System.out.println("\nCurrent Fighter health: " + f.getCurrentHP());
        System.out.println("Current Mage health: " + m.getCurrentHP());
    }

}
