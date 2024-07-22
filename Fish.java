public class Fish extends Animal implements CanSwim, CanWalkOnLand {
    private double height;
    private double weight;
    private String sound = "Blob";

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSound() {
        return sound;
    }

    public Fish(int age, String id, int cage, double height, double weight) {
        super(age, id, cage);
        this.height = height;
        this.weight = weight;
    }

    public boolean canSwim() {
        return true;
    }

    public boolean canWalkOnLand() {
        return false;
    }

    public String toString() {
        return "Fish";
    }
}