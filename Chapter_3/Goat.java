package Chapter_3;
/* ------------------------------ parent class ------------------------------ */
public class Goat {
    private String name;
    private int maxHP;
    private int currentHP;

    public Goat (String name, int maxHP, int currentHP) {
        this.name = name;
        this.maxHP = maxHP;
        this.currentHP = currentHP;
    }

    /* --------------------------- getters and setters -------------------------- */
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getMaxHP() { return maxHP; }
    public void setMaxHP(int maxHP) { this.maxHP = maxHP; }

    public int getCurrentHP() { return currentHP; }
    public void setCurrentHP(int currentHP) { this.currentHP = currentHP; }
    
    /* --------------------------------- methods -------------------------------- */
    public boolean isConscious(){
        return currentHP > 0; // if it is, it will return True
    }

    /**
     * increases current HP, heals the goat to the maximum health allowed
     * @param amount int amount to heal
     */
    public void heal(int amount){
        if ((currentHP+amount)>maxHP){
            currentHP = maxHP;
        } else {
            currentHP += amount;
        }
    }


}
