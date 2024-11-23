package CreationalPatterns.factoryMethodDesignPattern.product;

public class Cat implements AnimalInterface {

    public Cat(){}

    @Override
    public void displayName(){
        System.out.println("This is Cat");
    }
}
