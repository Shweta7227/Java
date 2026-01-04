public class FourDivision {
    public int sumFourDivisors(int[] nums) {
        int totalSum = 0;

        for (int num : nums) {
            int sum = 0;
            int count = 0;

            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    int d1 = i;
                    int d2 = num / i;

                    if (d1 == d2) {
                        count += 1;
                        sum += d1;
                    } else {
                        count += 2;
                        sum += d1 + d2;
                    }

                    if (count > 2) break;
                }
            }

            if (count == 2) {
                totalSum += (1 + sum + num);
            }
        }

        return totalSum;
    }
}
