package CreationalPatterns.factoryMethodDesignPattern.creator;

import CreationalPatterns.factoryMethodDesignPattern.product.AnimalInterface;

public interface AnimalFactoryInterface {
    AnimalInterface createAnimal();
}
