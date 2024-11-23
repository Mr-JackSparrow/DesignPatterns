# Factory Method Design Pattern

A creational design pattern that relies on inheritance and polymorphism to delegate the responsibility of object instantiation to subclasses. It provides a way to encapsulate the creation logic within factory subclasses instead of a single factory class.

## Definition:

- A creational design pattern that defines an interface or abstract class for creating an object but lets the subclasses decide which class to instantiate. It allows the instantiation logic to vary independently of the client code.

## Key Features:

1. **Abstraction**: The client uses an interface or abstract type (e.g., `Animal`) without depending on concrete implementations.
2. **Polymorphism**: The creation of objects is handled by subclasses (e.g., `DogFactory`, `CatFactory`) that override the factory method.
3. **Encapsulation**: The instantiation logic is encapsulated in specific subclasses, promoting separation of concerns.

## Methodology:

The Factory Method Design Pattern consists of the following components:

1. **Product (Abstract or Interface)**: The common interface or abstract class defining the behavior of the objects being created (e.g., `Animal`).
2. **Concrete Products**: The classes that implement the `Product` interface or extend the abstract class (e.g., `Dog`, `Cat`).
3. **Creator (Abstract)**: An abstract class or interface that declares the factory method (e.g., `AnimalFactory`).
4. **Concrete Creators**: Subclasses of the `Creator` that implement the factory method to instantiate specific `Concrete Products` (e.g., `DogFactory`, `CatFactory`).

## Example:

### Client Code:

```java
AbstractAnimalFactory factory = new DogFactory(); // Factory object for Dog
AbstractAnimal dog = factory.createAnimal(); // Declared Type = AbstractAnimal, Runtime Type = Dog

dog.displayName();

System.out.println(dog.getClass().getName()); // Outputs the runtime class of the object
System.out.println(dog instanceof Animal);   // Outputs true
