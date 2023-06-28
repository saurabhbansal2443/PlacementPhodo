public class arrayOccurence {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 4, 4, 4, 5, 6 };

        int k = 4;

        // int ans1 = firstOccurence(arr, k, 0);

        // int ans2 = LastOccurence(arr, k, arr.length-1);

        allOccurence(arr, k, 0);

        // System.out.println(ans2);
    }

    public static int firstOccurence(int[] arr, int k, int idx) {
        if (idx == arr.length) {
            return -1;
        } else if (arr[idx] == k) {
            return idx;
        }

        int ans = firstOccurence(arr, k, idx + 1);

        return ans;

    }

    public static int LastOccurence(int[] arr, int k, int idx) {
        if (idx == -1) {
            return -1;
        } else if (arr[idx] == k) {
            return idx;
        }

        int ans = LastOccurence(arr, k, idx - 1);

        return ans;

    }

    public static void allOccurence(int[] arr, int k, int idx) {
        if (idx == arr.length) {
            return;
        } else if (arr[idx] == k) {
            System.out.println(idx);
        }

        allOccurence(arr, k, idx + 1);

    }

}
