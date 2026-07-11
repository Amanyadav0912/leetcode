class Solution {
    public int[] replaceElements(int[] arr) {
        
        int Max = arr[arr.length-1];
        for(int i = arr.length-2;i>0;i--){
            int temp = arr[i];
            arr[i] = Max;
            if(temp>Max){
                Max=temp;
            }
        }
        arr[0]=Max;
        arr[arr.length-1] = -1;//Time complexity is O(n)
        return arr;             //space complexity is o(1)
    }
}