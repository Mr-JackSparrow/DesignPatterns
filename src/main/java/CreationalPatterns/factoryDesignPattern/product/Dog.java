package CreationalPatterns.factoryDesignPattern.product;

public class Dog implements Animal{

    public Dog(){}

    @Override
    public void displayName(){
        System.out.println("this is Dog");
    }
}
