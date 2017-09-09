package easy_level;

import java.util.Arrays;
import java.util.*;

public class first_missing_positive_41 {
    public int firstMissingPositive(int[] nums) {
        if(nums.length==0) return 1;
		Arrays.sort(nums);
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0 && !list.contains(nums[i])) {
				list.add(nums[i]);

			}
		}
		if(list.size()==0) return 1;
		for(int v=0;v<list.size();v++){
			if(list.get(v)!= v+1){
				return v+1;
			}
		}
		return (list.get(list.size()-1))+1;
    }
}
