public class Showroom21 {

    public int low, max;

    public int upTopAcc(int arrAcc[], int l, int r)
    {
        if(l == r)
        {
            return arrAcc[l];
        }
        else if (r == l - 1) 
        {
            if (arrAcc[r] > arrAcc[l]) 
            {
                return arrAcc[r];
            }
            else
            {
                return arrAcc[l];
            }
        }
        else{
            int mid = (l + r) / 2;
            int lsum = upTopAcc(arrAcc, l, mid - 1);
            int rsum = upTopAcc(arrAcc, mid + 1, r);

            if (lsum > rsum) 
            {
                return lsum;
            }
            else
            {
                return rsum;
            }
        }
    }

    public int minTopAcc(int arrAcc[], int l, int r)
    {
        if(l == r)
        {
            return arrAcc[l];
        }
        else if (r == l - 1) 
        {
            if (arrAcc[r] < arrAcc[l]) 
            {
                return arrAcc[r];
            }
            else
            {
                return arrAcc[l];
            }
        }
        else{
            int mid = (l + r) / 2;
            int lsum = minTopAcc(arrAcc, l, mid);
            int rsum = minTopAcc(arrAcc, mid + 1, r);

            if (lsum < rsum) 
            {
                return lsum;
            }
            else
            {
                return rsum;
            }
        }
    }

    public double avgPower (int arrPwr[])
    {
        int sum = 0;
        int n = arrPwr.length;

        for (int i = 0; i < n; i++) {
            sum += arrPwr[i];
        }

        return (double) sum / n;
    }
}
