package CreationalPatterns.factoryDesignPattern.creator;

import CreationalPatterns.factoryDesignPattern.product.Animal;
import CreationalPatterns.factoryDesignPattern.product.Cat;
import CreationalPatterns.factoryDesignPattern.product.Dog;

public class AnimalFactory {

    public Animal createAnimal(String name){
        return switch(name){
            case "Dog" -> new Dog();
            case "Cat" -> new Cat();
            default -> null;
        };
    }
}
