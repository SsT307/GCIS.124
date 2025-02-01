/* ------------------------------ parent class ------------------------------ */
public abstract class Goat {
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

    @Override
    public String toString(){
        return "Goat "+name+", max health: "+maxHP+", current health: "+currentHP;
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


    abstract public Attack attack();
    abstract public void takeDamage(Attack attack);
    // helps to define what methods the children have and will implement
    // have to add the word abstract to the class name for it to work

}
