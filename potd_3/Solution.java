class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int n3 = nums3.length;
        List<Integer> out = new ArrayList<>();
        for (int i = 0; i < n1; i++) {
            int count = 1;
            for (int j = 0; j < n2; j++) {
                if (nums1[i] == nums2[j]) {
                    count++;
                    break;
                }
            }
            for (int k = 0; k < n3; k++) {
                if (nums1[i] == nums3[k]) {
                    count++;
                    break;
                }
            }
            if (count >= 2) {
                if (!out.contains(nums1[i]))
                    out.add(nums1[i]);
            }
        }

        for (int i = 0; i < n2; i++) {
            int count = 1;
            for (int j = 0; j < n3; j++) {
                if (nums2[i] == nums3[j]) {
                    count++;
                    break;
                }
            }
            if (count >= 2) {
                if (!out.contains(nums2[i]))
                    out.add(nums2[i]);
            }
        }

        return out;
    }
}