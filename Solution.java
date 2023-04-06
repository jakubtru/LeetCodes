class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double[] merged = merge(nums1, nums2);
        //System.out.println(merged[0] + " " +  merged[1] + " " + merged[2]);
        if (merged.length % 2 == 0) {
            return (merged[merged.length / 2 - 1] + merged[merged.length / 2]) / 2;
        } else {
            return merged[(merged.length - 1) / 2];
        }
    }

    public double[] merge(int[] nums1, int[] nums2) {
        double[] merged = new double[nums1.length + nums2.length];
        int x = 0, y = 0, i = 0;
        while (x < nums1.length && y < nums2.length) {
            if (nums1[x] <= nums2[y]) {
                merged[i] = nums1[x];
                x++;
            } else {
                merged[i] = nums2[y];
                y++;
            }
            i++;
        }

        while (x < nums1.length) {
            merged[i] = nums1[x];
            x++;
            i++;
        }

        while (y < nums2.length) {
            merged[i] = nums2[y];
            y++;
            i++;
        }

        return merged;
    }
}
