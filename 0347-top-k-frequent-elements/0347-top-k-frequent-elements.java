class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> countMap = new HashMap<>();

        // Count frequency
        for (int i = 0; i < nums.length; i++) {
            countMap.put(nums[i], countMap.getOrDefault(nums[i], 0) + 1);
        }

        // Reverse map: frequency -> list of numbers
        Map<Integer, List<Integer>> reverseCountMap = new HashMap<>();

        for (int num : countMap.keySet()) {
            int count = countMap.get(num);

            if (!reverseCountMap.containsKey(count)) {
                reverseCountMap.put(count, new ArrayList<>());
            }

            reverseCountMap.get(count).add(num);
        }

        // Result array
        int[] result = new int[k];
        int index = 0;

        // Traverse from max frequency to min
        for (int i = nums.length; i >= 1; i--) {

            if (reverseCountMap.containsKey(i)) {

                for (int n : reverseCountMap.get(i)) {

                    if (index < k) {
                        result[index++] = n;
                    } else {
                        break;
                    }
                }
            }

            if (index >= k) {
                break;
            }
        }

        return result;
    }
}