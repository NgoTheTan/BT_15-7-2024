import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animalList = new ArrayList<>();
    private int canSwimAnimal;
    private int canWalkOnLandAnimal;

    public int getCanSwimAnimal() {
        return canSwimAnimal;
    }

    public int getCanWalkOnLandAnimal() {
        return canWalkOnLandAnimal;
    }

    public void addAnimal(Animal animal) {
        for (Animal a : animalList) {
            if (animal.getId().equals(a.getId())) {
                return;
            }
        }
        animalList.add(animal);
        if (animal.canSwim()){
            canSwimAnimal++;
        }
        if (animal.canWalkOnLand()) {
            canWalkOnLandAnimal++;
        }
    }

    public int getAnimalNumber() {
        return animalList.size();
    }

    public String getAnimalByCage() {
        String res = "";
        boolean[] seen = new boolean[animalList.size()];
        for (int i = 0; i < animalList.size(); i++) {
            if (!seen[i]) {
                res = res + "Chuồng số " + String.valueOf(animalList.get(i).getCage()) + "có:\n";
                for (int j = 0; j<animalList.size(); j++) {
                    if (animalList.get(j).getCage() == animalList.get(i).getCage()) {
                        seen[j] = true;
                        res = res + animalList.get(j).toString() + "\n";
                    }
                }
            }
        }
        return res;
    }
}