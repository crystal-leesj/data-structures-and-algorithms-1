public class BinarySearch {
    public static void main (String[] args){
        int[] nums = new int[3];
        nums[0]= 1;
        nums[1]= 2;
        nums[2]= 3;
        System.out.println(binarySearch(nums, 4));

    }

    public static int binarySearch(int[] arr, int key){
        int r = arr.length-1;
        int l = 0;
        while(l<=r){
            int mid = (int) Math.floor((l+r)/2);
            if(arr[mid] <key){
                l = mid+1;
            }
            else if(arr[mid]>key){
                r = mid-1;
            }
            else{
                return mid;
            }

        }
        return -1;

    }
}
