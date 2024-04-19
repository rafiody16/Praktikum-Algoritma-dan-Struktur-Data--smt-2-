public class StackKonversi21 {

    int size, top;
    int[] tumpukanBarang;

    public StackKonversi21() {
        this.size = 32;
        tumpukanBarang = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Gagal! Tumpukan barang sudah penuh");
        } else {
            tumpukanBarang[++top] = data;
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Gagal! Tumpukan barang kosong");
            return -1;
        } else {
            return tumpukanBarang[top--];
        }
    }
    
}
