public class maxInArray {
    public static void main(String[] args) {
       int[] arr = {45,3,9,34,0,23}; 

       int ans = maxium(arr, 0);

       System.out.println(ans);
    }

    public static int maxium(int[] arr , int idx){

        if(idx == arr.length){
            return -1;
        }

        int remMax = maxium(arr,idx+1);

        int max = Math.max(remMax,arr[idx]);

        return max;
    }

    
}
