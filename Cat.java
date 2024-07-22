public class Cat extends Animal implements CanWalkOnLand, CanSwim {
    private double height;
    private double weight;
    private String sound = "Meo";

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

    public Cat(int age, String id, int cage, double height, double weight) {
        super(age, id, cage);
        this.height = height;
        this.weight = weight;
    }

    public boolean canWalkOnLand() {
        return true;
    }

    public boolean canSwim() {
        return false;
    }

    public String toString() {
        return "Cat";
    }
}