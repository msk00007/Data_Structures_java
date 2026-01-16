
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length -1;
        int maxAmount = 0;
        while (left<right){
            int cArea = Math.min(height[left],height[right]) * (right-left);
        maxAmount = Math.max(maxAmount,cArea);
        if(height[left]>height[right]){
            right --;
        }
        else{
            left++;
        }
        }
        return maxAmount;
    }
}
