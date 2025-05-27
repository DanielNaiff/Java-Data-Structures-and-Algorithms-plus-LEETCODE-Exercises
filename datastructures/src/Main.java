public class Main {
    public static void main(String[] args) {

        LinkedList myLinkedList = new LinkedList(11);
        myLinkedList.append(4);
        myLinkedList.append(23);
        myLinkedList.append(7);
        myLinkedList.set(1,3);

//        System.out.println(myLinkedList.removeLast());
//        System.out.println(myLinkedList.removeLast());
//        System.out.println(myLinkedList.removeLast());


        myLinkedList.printList();
    }
}