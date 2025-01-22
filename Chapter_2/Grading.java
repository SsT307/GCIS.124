public enum Grading{
    A(100, "Excellent!"),
    B(90, "Very Good!"),
    C(80, "Average."),
    D(70,"Below Average."),
    F(50, "Failed. Loser!");

    private int points;
    private String description;

    private Grading(int points, String desc)
    {
        this.points = points;
        this.description = desc;
    }

    /* --------------------------------- getters -------------------------------- */
    public int getPoints() { return this.points; }
    public String getDesc() { return this.description; }
    // no setters needed
}
