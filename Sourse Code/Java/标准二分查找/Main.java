public int search (int[] nums, int target) {
        if (nums.length == 0)
            return -1;
        if (nums.length == 1) { //当数组中只有一个元素
            if (nums[0] == target) //如果是目标值则返回位置0
                return 0;
            return -1;
        }
        int left = 0;
        int right = nums.length;
        while (left <=right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) { //是否等于目标值
                return mid;
            }
            if (nums[mid] < target)
                left = mid+1;
            else
                right = mid-1;
        }
        return -1;
    }