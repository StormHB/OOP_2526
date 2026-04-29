package pckg_poli_dynamic;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Animal[] arrAnimals = {new Animal(), new Tiger(), new Tiger(), new Dog(), new RubberAnimal()};
        List<Animal> animals = Arrays.asList(arrAnimals);
        for (Animal animal : animals) {
            animal.makeSomeSound();
        }
    }
}
