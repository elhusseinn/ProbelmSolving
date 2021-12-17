public class MaximumSumOfArray {


    public static int maxSum(int[] arr) {
      if (arr.length == 1) {
        return arr[0];
      }
      boolean positiveExists = false; // changes if 1 element in the array is positive
      for(int i = 0; i < arr.length; i++){
        if (arr[i] > 0){
          positiveExists = true;
          break;
        }
      }
      if(!positiveExists){ // all array is negative
        return 0;
      }

      int excluding  = 0;
      int including   = arr[0];
      int upToPrevious   = arr[1];

      for (int i = 2; i < arr.length; i++) {
        int value = arr[i];
        int maximumCurrentElementSum = Math.max(excluding , including  ) + value;
        excluding  = Math.max(excluding , including  );
        including   = upToPrevious  ;
        upToPrevious   = maximumCurrentElementSum;
      }

      return Math.max(including  , upToPrevious  );
    }










public static void main(String [] args){


int [] arr = {-2,1,3,-4,5};


  System.out.println(maxSum(arr));


}
}
