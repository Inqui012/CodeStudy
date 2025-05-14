class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int compare = 0;
        if(arr1.length == arr2.length){
            for(int i = 0; i <= arr1.length -1; i++){
                compare += arr1[i];
            }
            for(int j = 0; j <= arr2.length -1; j++){
                compare -= arr2[j];
            }
            
            if (compare < 0) {
                return -1;
            } else if (compare > 0) {
                return 1;
            } else {
                return 0;
            }
            
        } else {
            if(arr1.length < arr2.length){
                return -1;
            } else {
                return 1;
            }
        }
    }
}