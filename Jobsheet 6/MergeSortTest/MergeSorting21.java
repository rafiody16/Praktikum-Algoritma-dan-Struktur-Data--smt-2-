public class MergeSorting21 {

    public int[] mergeSort(int[] data)
    {
        return sort(data, 0, data.length - 1);
    }

    public int[] merge(int data[], int left, int middle,int right)
    {
        int[] temp = new int[data.length];
        for (int i = left; i <= right; i++) {
            temp[i] = data[i];
        }
        int a = left;
        int b = middle + 1;
        int c = left;

        while (a <= middle && b <= right) {
            if (temp[a] <= temp[b]) {
                data[c] = temp[a];
                a++;
            } else {
                data[c] = temp[b];
                b++;
            }
            c++;
        }
        int s = middle - a;
        for (int i = 0; i <= s; i++) {
            data[c + i] = temp[a + i];
        }
        return data;
    }

    public int[] sort(int data[], int left, int right)
    {
        if (left < right) {
            int middle = (left + right) / 2;
            sort(data, left, middle);
            sort(data, middle + 1, right);
            return merge(data, left, middle, right);
        }
        return data;
    }

    public void printArray(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    
}