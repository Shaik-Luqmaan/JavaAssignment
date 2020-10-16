package JavaAssignments.Assignment6;

public class ConstructorArrayObjects {
    private String stringField;

    public ConstructorArrayObjects(String stringField){
        this.stringField = stringField;
        System.out.println(stringField);
    }

    public static void main(String[] args) {
        ConstructorArrayObjects[] arrayOfObjects=new ConstructorArrayObjects[4];

        /*ArrayOfObjects creates a references to  ConstructorArrayObjects class objects
         but does not creates the objects*/

        for(int i=0;i<4;i++){
            arrayOfObjects[i]=new ConstructorArrayObjects("Object " + (i+1));
        }

    }
}