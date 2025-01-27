package Chapter_3;
/* ------------------------------ child of Goat ----------------------------- */
public class Mage extends Goat {

    private final static int maxHealth = 100;
    // requirement of the parent
    public Mage(String name)
    {
        // set the HP to 100,
        super(name, maxHealth, maxHealth); // calling the parent class (SUPERCLASS), have to fullfill these requirements with arguments
        // if you want to add more parameters, you can, but you have to make the member using this. as well
    }

    // specifics for this class
    public Attack attack() 
    {
        String name = "Magic Missiles";
        int[] hits = {9,9,9,9};
        DamageType damage = DamageType.Magical;
        Attack strikes = new Attack(name, hits, damage);
        return strikes;
    }

    public void takeDamage(Attack attack)
    {
        int hitsTotalDamage = 0;
        for(int i = 0; i<attack.getHits().length; i++)
            { hitsTotalDamage+=attack.getHits()[i]; }

        if (attack.getDamageType() == DamageType.Magical) 
            { hitsTotalDamage*=0.75; } 
        if (attack.getDamageType()==DamageType.Physical) 
            { hitsTotalDamage*=1.25; }

        if(getCurrentHP()>=hitsTotalDamage)
            { setCurrentHP(getCurrentHP()-hitsTotalDamage); }
        else { setCurrentHP(0); }
    }
}
