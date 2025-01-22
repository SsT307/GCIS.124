public enum months {
    Jan(31),
    Feb(28),
    Mar(31),
    Apr(30),
    May(31),
    June(30),
    July(31),
    Aug(31),
    Sept(30),
    Oct(31),
    Nov(30),
    Dec(31);

    private int days;

    private months(int days)
    {
        this.days = days;
    }

    public int getDays() {
        return days; }
    
    // public String toString() { return "Months in the season of "+ m.name();}
    public static void main(String[] args)
    {
        months[] summer = {months.June, months.July, months.Aug};
        System.out.println(summer);
    }
}

