package JavaAssignments.Assignment7.Part2;

public class Cycle {
    Cycle(){
        System.out.println("Default constructor of Cycle class");
    }
}
class Unicycle extends Cycle{
    Unicycle(){
        System.out.println("Default constructor of Unicycle class");
    }
    void balance(){
        System.out.println("Balance method in unicycle");
    }
}
class Bicycle extends Cycle{
    Bicycle(){
        System.out.println("Default constructor of Bicycle");
    }
    void balance(){
        System.out.println("Balance method of Tricycle");
    }
}
class Tricycle extends Cycle{
    Tricycle(){
        System.out.println("Default constructor of Tricycle");
    }
}
