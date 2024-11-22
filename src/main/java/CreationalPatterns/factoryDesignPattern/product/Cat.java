package CreationalPatterns.factoryDesignPattern.product;

public class Cat implements Animal{

    public Cat(){}

    @Override
    public void displayName(){
        System.out.println("This is Cat");
    }
}
