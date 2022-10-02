public class Main {
    public static void main(String[] args) {
        Chicken chicken = new Chicken();
        AnimalToy chickenToy =new  ChickenToy();

        AnimalToy animalAdapter = new ChickenAdapter(chicken);
        System.out.print("chicken : " );
        chicken.fly();
        chicken.makeSound();

        System.out.print("Animal Toy : ");
        chickenToy.squeak();

        System.out.println("chicken adapter");
        animalAdapter.squeak();
    }
}
