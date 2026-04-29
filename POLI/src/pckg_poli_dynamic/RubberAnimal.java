package pckg_poli_dynamic;

public class RubberAnimal extends Animal {
    @Override
    public void makeSomeSound() {
        System.out.println(this.getClass().getSimpleName() + " can't make sounds.");
    }
}
