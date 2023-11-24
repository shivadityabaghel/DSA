package searchalgos;

public class findmin {
    public static void main(String[] args) {
        int[] arr= {69, 89, 99, 100, 120, 210, 192,189};
    System.out.println(min(arr));
    System.out.println(max(arr));

}
static int min(int[] arr){
    int ans= arr[0];
    for(int i= 1; i< arr.length; i++){
        if(arr[i]<ans){
            ans= arr[i];
        }
    }
    return ans;

}
static int max(int[] arr){
    int ans= arr[0];
    for(int i= 1; i< arr.length; i++){
        if(arr[i]>ans){
            ans= arr[i];
        }
    }
    return ans;
}
}