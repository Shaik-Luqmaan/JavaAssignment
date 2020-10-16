package JavaAssignments.Assignment5.Luqmaan.Singleton;

public class Singleton {
    //String memberVariable;
    private static String stringVariable;

    public static Singleton staticMethod(String string) {
        //memberVariable = string;
        // In static methods we cannot use non-static variables
        return new Singleton();
    }

    public void nonStaticMethod(String string) {
        stringVariable = string;
        System.out.println(stringVariable);
    }

}