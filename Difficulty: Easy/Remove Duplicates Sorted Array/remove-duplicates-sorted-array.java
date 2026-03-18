class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        int n = arr.length;
        ArrayList<Integer> Result = new ArrayList<>();
        if(n==0){
            return Result;
        }
         Result.add(arr[0]);
         for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                Result.add(arr[i]);
            }
         }
         
         return Result;
    }
}
