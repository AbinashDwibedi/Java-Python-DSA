class Solution {
    void nextPermutation(int[] arr) {
        int n = arr.length;
        int i = n-2;
        while(i>=0 && arr[i]>=arr[i+1]){
            i--;
        }
        if(i != -1){
            int j = n-1;
            while(arr[i] >= arr[j]){
                j--;
            }
            this.swap(arr,i,j);
        }
        this.reverse(arr,i+1,n-1);
    }
    void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    void reverse(int[] arr, int start, int end){
        while(start < end){
            this.swap(arr, start++,end--);
        }
    }
}