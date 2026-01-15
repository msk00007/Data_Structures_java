
        
        class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;          // last valid element in nums1
        int j = n - 1;          // last element in nums2
        int k = m + n - 1;      // merge position

        // Merge from the back
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // Copy remaining elements of nums2 (if any)
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}

