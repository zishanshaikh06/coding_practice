package coding;

public class BinarySearchIterative {

    public static void main(String[] args) {

        int[] arr = {1, 4, 6, 8, 9, 11, 24, 45};

        int num = 45;

        int found = binarySearch(arr, num);

        if (found > -1) {
            System.out.println("Found the number " + num + " at " + found);
        } else {
            System.out.println("Number not found");
        }

    }

    public static int binarySearch(int[] arr, int num) {

        int low = 0;
        int high = arr.length;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (num == arr[mid]) {
                return mid;
            } else if (num > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1;
    }
}
