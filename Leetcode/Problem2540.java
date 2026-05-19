import java.util.*;

public class Problem2540 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int[] nums1 = new int[n1];
        int[] nums2 = new int[n2];
        for (int i = 0; i < n1; i++) {
            nums1[i] = sc.nextInt();
        }
        for (int i = 0; i < n2; i++) {
            nums2[i] = sc.nextInt();
        }
        int i = 0;
        int j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                System.out.println(nums1[i]);
                return;
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        System.out.println(-1);
    }
}
