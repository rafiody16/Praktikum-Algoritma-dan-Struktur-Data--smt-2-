package LatihanPraktikum;

public class Queue21 {

    Pembeli21[] antrian;
    int front, rear, size, max;

    public Queue21 (int n) {
        max = n;
        antrian = new Pembeli21[max];
        size = 0;
        front = rear = -1;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Elemen terdepan: "+ antrian[front].nama +" "+ antrian[front].noHp);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void peekRear() {
        if (!isEmpty()) {
            System.out.println("Elemen terbelakang: "+ antrian[rear].nama +" "+ antrian[rear].noHp);
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama +" "+ antrian[i].noHp);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama +" "+ antrian[i].noHp);
            System.out.println("Jumlah elemen: "+ size);
        }
    }

    public void clear() {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void Enqueue(Pembeli21 antri) {
        if (isFull()) {
            System.out.println("Queue sudah penuh!! Program akan berhenti...");
            System.exit(0);
        } else {
            if (isEmpty()) {
                front = rear = 0;
            } else {
                if (rear == max - 1) {
                    rear = 0;
                } else {
                    rear++;
                }
            }
            antrian[rear] = antri;
            size++;
        }
    }

    public Pembeli21 Dequeue() {
        Pembeli21 antri = new Pembeli21();
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            antri = antrian[front];
            size--;
            if (isEmpty()) {
                front = rear = -1;
            } else {
                if (front ==  max - 1) {
                    front = 0;
                } else {
                    front++;
                }
            }
        }
        return antri;
    }

    public void daftarPembeli() {
        if (isEmpty()) {
            System.out.println("Queue masih kosong");
        } else {
            int i = front;
            while (i != rear) {
                System.out.println(antrian[i].nama +" "+ antrian[i].noHp);
                i = (i + 1) % max;
            }
            System.out.println(antrian[i].nama +" "+ antrian[i].noHp);
            System.out.println("Jumlah elemen: "+ size);
        }
    }

    public void peekPosition(String namaCari) {
        int i = front;
        boolean stop = false;
        while (i != rear) {
            if (antrian[i].nama.equalsIgnoreCase(namaCari)) {
                System.out.println(antrian[i].nama +" berada di antrian ke- "+ (i - front + 1));
                stop = false;
                break;
            }
            i = (i + 1) % max;
        }
        if (stop) {
            System.out.println("Tidak ada dalam antrian");
        }
    }
    
}
