class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length = (nums1.length+nums2.length);
        int[] nums3 = new int[length];

        for(int i = 0 ; i<nums1.length;i++){
            nums3[i] = nums1[i];
        }
        for(int i = 0 ; i<nums2.length;i++){
            nums3[i+nums1.length] = nums2[i];
        }
        Arrays.sort(nums3);
        if(nums3.length%2==0){
            int index1 = length/2-1;
            double result = (nums3[index1]+nums3[index1+1])/2.0;
            return result;
        }
        else{
            
            return (nums3[length/2]);

        }
    }
}