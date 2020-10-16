package JavaAssignments.Assignment7.Part5;

public class FirstOuterClass {
    public FirstOuterClass() {
        System.out.println("This is the First Outer Class");
    }

// Static inner class does not have access to members of the Outer Class

    public static class FirstInnerClass{
        public FirstInnerClass(String string) {
            System.out.println(string);
        }
    }
}
