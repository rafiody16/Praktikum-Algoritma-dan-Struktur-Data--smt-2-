public class DoubleLinkedListMain {

    public static void main(String[] args) {
        DoubleLinkedList dll = new DoubleLinkedList();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("==========================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("==========================");
        try {
            dll.add(40, 1);        
        } catch (Exception e) {
            System.out.println(e);
        }
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("==========================");
        dll.clear();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("==========================");
    }
    
}
