package arrays;
// Find Pair of Integers in an array that sums up to a target
//Input:  arrays = [2,7,11,15,-2], target: 9
//Output: {2,7} & {11,-2}


public class SumArrayPairs {

    public static void sumOfPairs(int [] arr, int target){
        for(int i=0;i<arr.length-1;i++){
             for(int j=1;j<arr.length;j++){
                 if(arr[i]+arr[j]==target){
                     System.out.println("{" + arr[i] + "," + arr[j]+"}");
                 }
             }
        }
    }

    public static void main(String[] args) {
        int [] arr = {2,7,11,15,-2};
        int target = 9;
        sumOfPairs(arr, target);

    }

}
