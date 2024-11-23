package CreationalPatterns.factoryMethodDesignPattern.creator;

import CreationalPatterns.factoryMethodDesignPattern.product.Dog;
import CreationalPatterns.factoryMethodDesignPattern.product.AnimalInterface;

public class DogFactoryInterface implements AnimalFactoryInterface {

    @Override
    public AnimalInterface createAnimal() {
        return new Dog();
    }
}
