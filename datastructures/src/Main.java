public class Main {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(11);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);

        myLinkedList.printList();

        myLinkedList.reverse();
        myLinkedList.printList();

//        System.out.println(myLinkedList.removeLast());
//        System.out.println(myLinkedList.removeLast());
//        System.out.println(myLinkedList.removeLast());

    }
}