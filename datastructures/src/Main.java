public class Main {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(2);

        myLinkedList.append(1);

        System.out.println(myLinkedList.removeFirst());
        System.out.println(myLinkedList.removeFirst());
        System.out.println(myLinkedList.removeFirst());

//        System.out.println(myLinkedList.removeLast());
//        System.out.println(myLinkedList.removeLast());
//        System.out.println(myLinkedList.removeLast());

        myLinkedList.printList();
    }
}