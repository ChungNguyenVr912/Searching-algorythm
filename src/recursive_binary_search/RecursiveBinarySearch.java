package recursive_binary_search;


public class RecursiveBinarySearch {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
    static int ReBinarySearch(int[] list, int key, int left, int right){
        if (left > right){
            return -1;
        }
        int mid = (right - left)/2 + left;
        if (list[mid] < key){
            return ReBinarySearch(list, key,mid+1,right);
        } else if (list[mid] > key) {
            return ReBinarySearch(list, key, left, mid -1);
        }else {
            return mid;
        }
    }

    public static void main(String[] args) {
        System.out.println(ReBinarySearch(list, 60,0, list.length-1));
    }
}
