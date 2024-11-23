package CreationalPatterns.factoryMethodDesignPattern.creator;

import CreationalPatterns.factoryMethodDesignPattern.product.AnimalInterface;
import CreationalPatterns.factoryMethodDesignPattern.product.Cat;

public class CatFactoryInterface implements AnimalFactoryInterface {
    @Override
    public AnimalInterface createAnimal() {
        return new Cat();
    }
}
