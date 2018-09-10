class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set = new HashSet<Integer>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        
        if(nums1.length==0 || nums2.length==0) return new int[0];
        int i = 0,j=0;
        while(i< nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]){
                set.add(nums1[i]);
                i++; j++; }
            else if(nums1[i] > nums2[j]) j++;
            else i++;
        }
        int n = set.size();
        int[] result = new int[n];
        i=0;
        for(int x : set) 
            result[i++] = x;
        return result;
    }
}
