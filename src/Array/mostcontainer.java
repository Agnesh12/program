package Array;

public class mostcontainer {
    static void container(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int maxcontainer = 0;
        while (left < right) {
            int areacontainer = Math.min(arr[left], arr[right]) *(right - left);
            maxcontainer = Math.max(maxcontainer, areacontainer);
            if (arr[left] < arr[right]) {
                left++;
            }
            else {
                right--;
            }
        }
        System.out.println(maxcontainer);
    }
    public static void main(String[] args) {
        int[] arr = {5, 7, 8, 2, 3, 7};
        container(arr);
    }
}
