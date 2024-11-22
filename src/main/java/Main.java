import CreationalPatterns.factoryDesignPattern.creator.AnimalFactory;
import CreationalPatterns.factoryDesignPattern.product.Animal;

public class Main {
    public static void main(String[] args){

        AnimalFactory factory = new AnimalFactory();

        Animal dog = factory.createAnimal("Dog");

        dog.displayName();

        System.out.println(dog.getClass().getName());
        System.out.println(dog instanceof Animal);
    }
}