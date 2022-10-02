public class ChickenAdapter implements AnimalToy{
    Animal animal;

    public ChickenAdapter(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void squeak() {
        animal.makeSound();
    }
}
