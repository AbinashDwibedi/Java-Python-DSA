class Solution {
    void pushZerosToEnd(int[] arr) {
        // code here
        int left = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[left] != 0) left ++;
            else{
                if(arr[i] != 0){
                    int temp = arr[i];
                    arr[i] = arr[left];
                    arr[left] = temp;
                    left++;
                }
            }
        }
    }
}