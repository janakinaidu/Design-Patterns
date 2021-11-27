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
