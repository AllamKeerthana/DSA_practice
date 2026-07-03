class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length, m=nums2.length;
        int[] arr = new int[n+m];
        int i=0,j=0,k=0;
        while(i<n && j<m){
            if(nums1[i]<=nums2[j]){
                arr[k] = nums1[i];
                i++;
                k++;
            }
            else{
                arr[k]=nums2[j];
                k++;
                j++;
            }
            
        }
        while(i<n){
            arr[k]=nums1[i];
            i++;
            k++;
        }

        while(j<m){
            arr[k]=nums2[j];
            j++;
            k++;
        }
        double mid =0;
        int val = (m+n)/2;
        if((m+n) % 2 ==1){
            mid = arr[val];
        }
        else{
            mid = arr[val-1] + arr[val];
            mid/=2.0;
        }
        return mid;
    }
}