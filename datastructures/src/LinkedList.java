public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    class Node{
        int value;
        Node node;
        Node next;

        Node(int value){
            this.value = value;
        }
    }

    // Construtor: cria a lista com o primeiro nó
    public LinkedList(int value){
        Node newNode = new Node(value);

        head = newNode;
        tail = newNode;
        length = 1;
    }

    // Imprime todos os valores da lista
    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    // Adiciona um novo nó ao final da lista
    public void append(int value){
        Node newNode = new Node(value);

        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    // Remove o último nó da lista e o retorna
    public Node removeLast(){
        if(length == 0) return null;

        Node temp = head;
        Node pre = head;

        // Percorre até o penúltimo nó
        while(temp.next != null){
            pre = temp;
            temp = temp.next;
        }

        tail = pre;
        tail.next = null; // Remove a referência ao último nó
        length--;

        // Se a lista ficar vazia, zera head e tail
        if(length == 0){
            head = null;
            tail = null;
        }

        return temp;
    }

    // Adiciona um novo nó no início da lista
    public void prepend(int value){
        Node newNode = new Node(value);

        if(length == 0){
            this.tail = newNode;
            this.head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }

        length++;
    }

    // Remove o primeiro nó da lista e o retorna
    public Node removeFirst(){
        if(length == 0) return null;
        Node temp = head;

        head = head.next;
        temp.next = null;
        length--;
        if(length == 0){
            tail = null;
        }

        return temp;
    }

    // Retorna o nó na posição especificada (índice)
    public Node get(int index){
        int i = 0;
        Node temp = head;

        if(index < 0 || index >= length){
            return null;
        }

        while (i != index){
            temp = temp.next;
            i++;
        }

        return temp;
    }

    //Muda o valor em um indice
    public boolean set(int index, int value){
        Node temp = get(index);

        if(temp != null){
            temp.value = value;

            return true;
        }

        return false;
    }

    //Insere um novo no
    public boolean insert(int index, int value){
        if(index < 0 || index > length){
            return false;
        }

        if(index == 0){
            prepend(value);
            return true;
        }

        if(index == length){
            append(value);
            return true;
        }
        Node newNode = new Node(value);

        Node temp = get(index - 1);
        newNode.next = get(index);
        temp.next = newNode;
        length++;
        return true;

    }

    public void getHead(){
        System.out.println("Head: " + head.value);
    }

    public void getTail(){
        System.out.println("Tail: " + tail.value);
    }

    public void getLength(){
        System.out.println("Lenght: " + length);
    }
}
