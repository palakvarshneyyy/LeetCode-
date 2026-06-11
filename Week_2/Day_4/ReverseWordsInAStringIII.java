lass Solution {
    public String reverseWords(String s) {
        char[] arr = s.toCharArray();
        int i=0;
        for(int j=0; j<=arr.length; j++){
            if(j == arr.length || arr[j] == ' '){
                reverse(arr, i, j-1);
                i = j + 1;
            }
        }
        return new String(arr);
    }
    private void reverse(char[] arr, int left, int right){
        while(left < right){
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
        }
    }
}