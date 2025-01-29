
public class Attack {
    private String name;
    private int[] hits;
    private DamageType damageType;

    /**
     * Attack constructor
     * @param name String inputer for name
     * @param hits int input for array of hits
     * @param damageType 
     */
    public Attack(String name, int[] hits, DamageType damageType) {
        this.name = name;
        this.hits = hits;
        this.damageType = damageType;
    }

    /* --------------------------------- getters -------------------------------- */
    /**
     * Gets name of the attack
     * @return String name
     */
    public String getName() { return name; }
    /**
     * Gets array of hits of the attack
     * @return int array of hits
     */
    public int[] getHits() { return hits; }
    /**
     * Gets 
     * @return
     */
    public DamageType getDamageType() { return damageType; }

    /* --------------------------------- setters -------------------------------- */
    public void setName(String name) { this.name = name; }

    public void setHits(int[] hits) { this.hits = hits; }

    public void setDamageType(DamageType damageType) { this.damageType = damageType;}
    
}
