package javaclasses;
class Animal{
    void eat(){
        System.out.println("Eating...");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("barking!");
    }
}

class Cat extends Animal{
    void meow(){
        System.out.println("meowing!");
    }
}

class Demo{
    public static void main(String[] args){
        Dog A = new Dog();
        A.eat();
        A.bark();
    }

}