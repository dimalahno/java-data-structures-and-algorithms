package kz.example.data_structures;

public class LinkedListExamples {

    private final static class MyLinkedList<E> {
        private final class Node<E> {
            private Node<E> previous, next;
            private E e;

            public Node(E e) {
                this.e = e;
            }
        }

        private Node<E> head;
        private Node<E> tail;

        public void add(E e) {
            if (head == null) {
                head = tail = new Node<>(e);
            } else {
                Node<E> node = new Node<>(e);
                node.previous = tail;
                tail.next = node;
                tail = node;
            }
        }
    }



    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.add("Dima");
        myLinkedList.add("Razida");
    }
}
