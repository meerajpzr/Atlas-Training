// Manager class extends Employee
class Manager extends Employee {
    private int teamSize;
    private String level;

    public Manager(String name, int id, String department, double salary, int teamSize, String level) {
        super(name, id, department, salary);
        this.teamSize = teamSize;
        this.level = level;
    }

    public int getTeamSize() {
        return teamSize;
    }
    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    public String getLevel() {
        return level;
    }
    public void setLevel(String level) {
        this.level = level;
    }

    public String toString() {
        return super.toString() + ", Team Size: " + teamSize + ", Level: " + level;
    }
}
