class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int newadding = 0;
       for(int j=m;j<m+n;j++){
        nums1[j]=nums2[newadding];
        newadding++;
       }
       Arrays.sort(nums1);
    }
}