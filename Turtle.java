public class Turtle extends Animal implements CanSwim, CanWalkOnLand {
    private double weight;
    private double height;
    private String sound = "Turtle Sound";

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getSound() {
        return this.sound;
    }

    public Turtle(int age, String id, int cage, double weight, double height) {
        super(age, id, cage);
        this.weight = weight;
        this.height = height;
    }

    public boolean canSwim() {
        return true;
    }

    public boolean canWalkOnLand() {
        return true;
    }

    public String toString() {
        return "Turtle";
    }
}