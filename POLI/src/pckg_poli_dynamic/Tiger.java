package pckg_poli_dynamic;

public class Tiger extends Animal {
    @Override
    public void makeSomeSound() {
        super.makeSomeSound();
        System.out.println(this.getClass().getSimpleName() + " can roar.");
    }
}
