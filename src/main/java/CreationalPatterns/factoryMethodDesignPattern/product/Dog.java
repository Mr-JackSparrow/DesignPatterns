package CreationalPatterns.factoryMethodDesignPattern.product;

public class Dog implements AnimalInterface {

    public Dog(){}

    @Override
    public void displayName(){
        System.out.println("This is Dog");
    }
}
