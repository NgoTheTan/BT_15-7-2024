public abstract class Animal {
    protected int age;
    protected String id;
    protected int cage;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCage() {
        return cage;
    }

    public void setCage(int cage) {
        this.cage = cage;
    }

    public Animal(int age, String id, int cage) {
        this.age = age;
        this.id = id;
        this.cage = cage;
    }

    public abstract String toString();
}