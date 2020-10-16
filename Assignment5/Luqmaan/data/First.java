package JavaAssignments.Assignment5.Luqmaan.data;

public class First {
    int intVariable;
    char charVariable;
    public void displayMethod() {
        System.out.println(intVariable);
        System.out.println(charVariable);
    }
    public void anotherMethod() {
        int localIntValue;
        char localCharValue;
        //System.out.println(localIntValue+localCharValue);

        /* Local variables must be initialized before because you would know
         what to expect from the values.
         It will be a compile time error if not initialized.*/
    }

}
