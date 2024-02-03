class Grandparent {
    void grandparentMethod() {
        System.out.println("This is a grandparent.");
    }
}

class Parent extends Grandparent {
    void parentMethod() {
        System.out.println("This is a parent.");
    }
}

class Child extends Parent {
    void childMethod() {
        System.out.println("This is a child.");
    }
}

public class  MultilevelInheritance{
    public static void main(String[] args) {
        Child obj = new Child();

        obj.childMethod();
        obj.parentMethod();
        obj.grandparentMethod();
    }
}
