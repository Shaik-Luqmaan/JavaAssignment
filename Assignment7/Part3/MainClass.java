package JavaAssignments.Assignment7.Part3;

interface IPrintable {
    void print();
    void preview();
}
interface IShowable {
    void display();
    void show();
}
interface IDrawable {
    void drawType();
    void draw();
}
interface InterfaceCombine extends IPrintable, IShowable, IDrawable {
    void setMessage();
}

public class MainClass extends Rectangle implements InterfaceCombine {
    @Override
    public void print() {
        System.out.println("Print method");
    }
    @Override
    public void preview() {
        System.out.println("Preview method");
    }
    @Override
    public void display() {
        System.out.println("Display method");
    }
    @Override
    public void show() {
        System.out.println("Show method");
    }
    @Override
    public void drawType() {
        System.out.println("Draw type method");
    }
    @Override
    public void draw() {
        System.out.println("Draw method");
    }
    @Override
    public void setMessage() {
        System.out.println("Set message method");
    }

    @Override
    void drawRectangle() {
        super.drawRectangle();
    }

    void printableMethod(IPrintable printable){
        printable.print();
        System.out.println(printable.toString());
    }
    void drawableMethod(IDrawable drawable){
        drawable.draw();
        System.out.println(drawable.toString());
    }

    void showableMethod(IShowable showable){
        showable.show();
        System.out.println(showable.toString());
    }

    void interfaceCombineMethod(InterfaceCombine interfaceCombine){
        interfaceCombine.setMessage();
        System.out.println(interfaceCombine.toString());
    }

    public static void main(String[] args) {
        MainClass mainClass=new MainClass();

        mainClass.printableMethod(mainClass);
        mainClass.drawableMethod(mainClass);
        mainClass.showableMethod(mainClass);
        mainClass.interfaceCombineMethod(mainClass);
        mainClass.drawRectangle();

    }
}
