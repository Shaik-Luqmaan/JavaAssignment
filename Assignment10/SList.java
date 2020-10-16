package JavaAssignments.Assignment10;

public class SList<T>
{
    SListIterator<T> sListIterator;
    public String toString() {
        Node<T> tempNode = sListIterator.getHead();
        String s = "";
        while(tempNode!=null) {
            s += tempNode.data +" ";
            tempNode=tempNode.next;
        }
        return s;
    }

    public SListIterator<T> iterator() {
        sListIterator = new SListIterator<T>();
        return sListIterator;
    }

}
