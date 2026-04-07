// Given an array of integers citations where citations[i] is the number of citations a researcher received for their ith paper, return the researcher's h-index.

// According to the definition of h-index on Wikipedia: The h-index is defined as the maximum value of h such that the given researcher has published at least h papers that have each been cited at least h times.

 class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int h =0;
        int ans = 0;
        int n=citations.length;
        int end = citations.length-1;
        while(end>=0){
            h = citations[end];
            if(h>=(n-end)){
                ans= (n-end);
            }
            end--;
        }
        return ans;
    }
}