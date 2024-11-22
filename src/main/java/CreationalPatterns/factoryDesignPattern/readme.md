# Factory Design Pattern

A simple creational design pattern, main aim is to apply abstraction, polymorphism and encapsulation, client doesn't need to know the actual implementation of the class for instantiation 

## Definition :

- A simple creational design pattern whose main goal is to provide abstraction, polymorphism, and encapsulation. It hides the instantiation logic of objects from the client, so the client does not need to know the exact implementation of the class it is instantiating.

## Key Features :

1. Abstraction: The client interacts with a general interface or abstract class (e.g., Animal), not concrete implementations (e.g., Dog, Cat).
2. Encapsulation: The object creation logic is encapsulated in a separate factory class.
3. Polymorphism: The factory returns an object whose type is determined at runtime based on the input, but the client always uses the parent interface or abstract type.

## Methodology :

The Factory Design Pattern consists of the following components:

1. Product (Abstract or Interface): The parent type that defines the common behavior of the objects being created (e.g., Animal).
2. Concrete Products: The actual classes that implement or extend the Product (e.g., Dog, Cat). These are the objects the client wants to instantiate.
3. Creator (Factory): A separate class responsible for creating instances of the Concrete Products. The factory encapsulates the creation logic.


## example :-

client code : 

    AnimalFactory factory = new AnimalFactory(); // factory 
    Animal animal = new factory.get("DOG"); // Declared Type = Animal, Runtime Type = Dog
