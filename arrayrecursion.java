public class arrayrecursion {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 7, 5, 6, 4, 4, 4, 4 };
        int k = 4;

        // display(arr , 0 );
        // displayreverse(arr,arr.length-1)
        findAllk(arr, 0, k);

        // System.out.println(findMax(arr,0));

    }

    public static void display(int[] arr, int idx) {

        if (arr.length == idx) {

            return;
        }

        System.out.print(arr[idx] + "   ");

        display(arr, idx + 1);

    }

    public static void displayreverse(int[] arr, int idx) {
        if (idx == -1) {
            return;
        }

        System.out.print(arr[idx] + "   ");
        displayreverse(arr, idx - 1);
    }

    public static int findk(int[] arr, int idx, int k) {
        if (idx == arr.length) {
            return -1;
        } else if (arr[idx] == k) {
            return idx;
        }

        return findk(arr, idx + 1, k);
    }

    public static void findAllk(int[] arr, int idx, int k) {
        if (idx == arr.length) {
            return;
        } else if (arr[idx] == k) {
            System.out.println(idx);
        }

        findAllk(arr, idx + 1, k);
    }

    public static int findMax(int[] arr, int idx) {
        if (idx == arr.length) {
            return Integer.MIN_VALUE;
        }
        int ele = arr[idx];

        int rem = findMax(arr, idx + 1);

        return Math.max(ele, rem);

    }

     public static int findMin(int[] arr, int idx) {
        if (idx == arr.length) {
            return Integer.MAX_VALUE;
        }
        int ele = arr[idx];

        int rem = findMin(arr, idx + 1);

        return Math.min(ele, rem);

    }

}
