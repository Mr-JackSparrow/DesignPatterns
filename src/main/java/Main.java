import CreationalPatterns.factoryDesignPattern.creator.AnimalFactory;
import CreationalPatterns.factoryDesignPattern.product.Animal;
import CreationalPatterns.factoryMethodDesignPattern.creator.AnimalFactoryInterface;
import CreationalPatterns.factoryMethodDesignPattern.creator.CatFactoryInterface;
import CreationalPatterns.factoryMethodDesignPattern.creator.DogFactoryInterface;
import CreationalPatterns.factoryMethodDesignPattern.product.AnimalInterface;

public class Main {
    public static void main(String[] args){

        AnimalFactory factory = new AnimalFactory();
        AnimalFactoryInterface factory1 = new DogFactoryInterface();
        AnimalFactoryInterface factory2 = new CatFactoryInterface();

        AnimalInterface dog1 = factory1.createAnimal();
        AnimalInterface cat = factory2.createAnimal();

        dog1.displayName();
        cat.displayName();

        Animal dog = factory.createAnimal("Dog");

        dog.displayName();

        System.out.println(dog.getClass().getName());
        System.out.println(dog instanceof Animal);
    }
}
