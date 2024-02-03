class Human {
    void ishuman() {
        System.out.println("I am a Human");
    }
}

class Murad extends Human {
    void name() {
        System.out.println("Name: Mohiuddin Murad");
    }
}

class Study extends Human {
    void university() {
        System.out.println("BSc in CSE");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Murad obj1 = new Murad();
        obj1.ishuman();
        obj1.name();
   

        Study obj2 = new Study();
        obj2.ishuman();   
        obj2.university(); 
    }
}
