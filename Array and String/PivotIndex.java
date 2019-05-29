class PivotIndex {
	public int pivotIndex(int[] nums) {
			int ans = -1;

			if (nums.length == 1) {
					return 0;
			}

			int sum = 0;
			for (int i = 1; i < nums.length; i ++) {
					sum += nums[i];
			}


			int reverseSum = 0;

			for (int i = 0; i < nums.length; i ++) {

					if (sum == reverseSum) {
							ans = i;
							break;
					}
					
					if (i < nums.length - 1) {
							sum -= nums[i + 1];                
					}
					reverseSum += nums[i];
			}

			return ans;
	}
}