// import java.util.Scanner;

public class BestStock {
    // public class Stock {

    public static void main(String[] args) {
        // Scanner s = new Scanner(System.in);
        int st[] = {7, 1, 5, 3, 6, 4};
        System.out.println(best(st));
    }

    public static int best(int st[]) {
        int profit;
        int mxprofit = 0;
        int buy = st[0];
        for (int i = 1; i < st.length; i++) {
            if (st[i] <= buy) {
                buy = st[i];
            } else {
                int sell = st[i];
                profit = sell - buy;
                mxprofit = Math.max(profit, mxprofit);
            }
        }
        return mxprofit;
    }
}

