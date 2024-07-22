public class Dog extends Animal implements CanWalkOnLand, CanSwim {
    private double weight;
    private double height;
    private String sound;

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
        return sound;
    }

    public Dog(int age, String id, int cage, double weight, double height) {
        super(age, id, cage);
        this.weight = weight;
        this.height = height;
        this.sound = "Woof";
    }

    public boolean canWalkOnLand() {
        return true;
    }

    public boolean canSwim() {
        return true;
    }

    public String toString() {
        return "Dog";
    }
}