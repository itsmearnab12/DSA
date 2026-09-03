class Solution {
public:
    bool uniformArray(vector<int>& nums1) {
        int m =*min_element(nums1.begin(),nums1.end());
        for(int x : nums1) if((x&1)&&!(m&1)) return false;

        return true;
        
    }
};