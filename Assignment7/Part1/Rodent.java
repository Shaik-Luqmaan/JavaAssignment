package JavaAssignments.Assignment7.Part1;

public class Rodent {
    public void hasTail(){
        System.out.println("All Rodents have tails");
    }
}
class Mouse extends Rodent{
    Mouse(){
        System.out.println("Default Constructor of a Mouse class");
    }
    @Override
    public void hasTail() {
        //super.hasTail();
        System.out.println("Mouse has quite long tail");
    }
}
class Gerbil extends Rodent{

    Gerbil(){
        System.out.println("Default Constructor of Gerbill Class");
    }

    @Override
    public void hasTail() {
        System.out.println("Gerbill has longest tail");
    }
}
class Hamster extends Rodent{
    Hamster(){
        System.out.println("Default constructor of Hamster Class");
    }
    @Override
    public void hasTail() {
        System.out.println("Hamster has small tail");
    }
}
