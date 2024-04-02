class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] temp = new int[nums.length + 1];

        for (int n : nums) {
            temp[n]++;
        }

        for (int x = 1; x <= nums.length; x++) {
            if (temp[x] == 0) ans.add(x);
        }

        return ans;
    }
}
