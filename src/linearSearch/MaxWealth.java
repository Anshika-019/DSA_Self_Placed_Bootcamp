package linearSearch;

public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {2, 8, 7},
                {7, 1, 3},
                {1, 9, 5}
        };
        System.out.println(maximumWealth(accounts));

    }
    static int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }
            maxWealth = Math.max(maxWealth, sum);
        }
        return maxWealth;
    }
}
