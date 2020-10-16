package JavaAssignments.Assignment6;

public class OverloadingExample {
    int rollNo;
    int phoneNumber;
    String name;

    /* In Java another constructor of the same class can be called from a constructor via this()*/

    OverloadingExample(String name){
        this(51,950549);
        this.name = name;
    }
    OverloadingExample(int rollNo,int phoneNumber){
        this.rollNo = rollNo;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "OverloadingExample: " +
                "rollNo=" + rollNo +
                ", phoneNumber=" + phoneNumber +
                ", name=" + name ;
    }
}
class Driver{
    public static void main(String[] args) {
        OverloadingExample oe = new OverloadingExample("Luqmaan");
        System.out.println(oe);
    }
}