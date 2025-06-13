public class Main {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(11);
        myLinkedList.append(3);
        myLinkedList.append(23);
        myLinkedList.append(7);

        myLinkedList.printList();

        myLinkedList.remove(2);

        myLinkedList.printList();

//        System.out.println(myLinkedList.removeLast());
//        System.out.println(myLinkedList.removeLast());
//        System.out.println(myLinkedList.removeLast());

    }
}