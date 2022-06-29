# Design-Patterns


**What is Singleton Class in Java :
**
A class of which only one object can be created. In java we can create a class in such a way of which only one object can be created. Follow the steps:

1. Create constructor private. This will stop outer class to create object directly.
2. Provide a static method to get instance so that a class can get the instance of that class.
3. Inside static method create the object of the class surrounded by synchronized block.
4. If class implements Cloneable, then we need to override clone method to throw exception.
5. If class implements Serializable, we need to implement readResolve method.
**Use of readResolve in Singleton
**
If we are creating a complete Singleton class, we need to take care the serialization of singleton class. readResolve is the method which returns the instance of the class when a serialized class is de serialized. So implement the readResolve method to return the same object.

**FACTORY Design Pattern**
->It is a creational design pattern which talks about the creation of an object
->The factory design pattern says that define an interface  and let the subclasses decide which object to instantiate

Since this design patterns talk about instantiation of an object and so it comes under the category of creational design pattern

Implementation: 
1. Define a factory method inside an interface. 
2. Let the subclass implements the above factory method and decide which object to create.


In Java constructors are not polymorphic, but by allowing subclass to create an object, we are adding polymorphic behavior to the instantiation. In short, we are trying to achieve Pseudo polymorphism by letting the subclass to decide what to create, and so this Factory method is also called as

Virtual constructor.
