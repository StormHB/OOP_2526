package pckg_poli_dynamic;

public class Dog extends Animal {
    @Override
    public void makeSomeSound() {
        super.makeSomeSound();
        System.out.println(this.getClass().getSimpleName() + " can bark.");
    }
}
