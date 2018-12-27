class NumArray {
    int[] tree;
    int n;
    int[] nums;
    public NumArray(int[] nums) {
        this.nums = nums;
        n = nums.length;
        tree = new int[2*n];
        buildTree(nums);
    }
    
    public void update(int i, int val) {
        int pos = i+n;
        tree[pos]=val;
        
        while(pos>0){
            int left = pos;
            int right = pos;
            if(pos%2==0)
                right++;
            else
                left--;
            
            tree[pos/2] = tree[left] + tree[right];
            pos/=2;
        }
        return;
    }
    
    public int sumRange(int i, int j) {
    int l = i+n;
    int r = j+n;
    int sum = 0;
    while (l <= r) {
        if ((l % 2) == 1) {
           sum += tree[l];
           l++;
        }
        if ((r % 2) == 0) {
           sum += tree[r];
           r--;
        }
        l /= 2;
        r /= 2;
    }
    return sum;
    }
    
    public void buildTree(int[] nums){
        int start = n;
        // First fille the leafs!
        for(int i=start,j=0;i<2*n;i++,j++){
            tree[i]=nums[j];
        }
        // Fill the internal nodes and root bottom up approach!
        for(int i=n-1;i>0;i--){
            tree[i] = tree[2*i] + tree[2*i +1];
        }
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(i,val);
 * int param_2 = obj.sumRange(i,j);
 */
