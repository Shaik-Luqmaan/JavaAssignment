package JavaAssignments.Assignment7.Part1;

public class Driver {
    public static void main(String[] args) {
        Rodent[] rodents=new Rodent[3];
        rodents[0]=new Mouse();
        rodents[0].hasTail();

        rodents[1]=new Gerbil();
        rodents[1].hasTail();

        rodents[2]=new Hamster();
        rodents[2].hasTail();
    }
}
