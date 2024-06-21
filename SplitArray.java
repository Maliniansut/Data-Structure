public int splitarray(int[] nums, int m) {
    int start = 0;
    int end = 0;

    for (int i = 0; i < nums.length; i++) {
        start = Math.max(start, nums[i]); // find the maximum element for start
        end += nums[i]; // sum of all elements for end
    }

    while (start < end) {
        int mid = start + (end - start) / 2;
        int sum = 0;
        int pieces = 1;

        for (int num : nums) {
            if (sum + num > mid) {
                // need a new subarray
                sum = num;
                pieces++;
            } else {
                // continue adding to current subarray
                sum += num;
            }
        }

        if (pieces > m) {
            start = mid + 1;
        } else {
            end = mid;
        }
    }

    return end; // return the minimum possible largest sum of any of the m subarrays
}
