public class displayAnArray {
   public static void main(String[] args) {
    int[] arr = {1,2,3,4,5,6,7};
      display(arr, 0);
   } 
   
   public static void display(int[] arr , int idx){
      if(idx == arr.length){
        return;
      }

      System.out.println(arr[idx]);

      display(arr,idx+1);
   }

}
