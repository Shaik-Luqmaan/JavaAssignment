package JavaAssignments.Assignment5.Luqmaan.Main;

import JavaAssignments.Assignment5.Luqmaan.Singleton.Singleton;
import JavaAssignments.Assignment5.Luqmaan.data.First;

public class Main {
    public static void main(String[] args) {
        First first = new First();
        first.displayMethod();
        first.anotherMethod();
        Singleton second = new Singleton();
        second.nonStaticMethod("Non-static method");
        second.staticMethod("Static method");
    }
}
