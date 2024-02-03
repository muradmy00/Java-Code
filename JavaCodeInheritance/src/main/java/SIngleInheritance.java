
class Animal {
   void eat() {
       System.out.println("Eating");
   }
}

class Dog extends Animal {
   void bark() {
       System.out.println("Barking");
   }
}



public class SIngleInheritance {
    
    
    public static void main(String[] args)
    {
       Dog obj1 = new Dog();
       obj1.eat();  
       obj1.bark();
    }
}
