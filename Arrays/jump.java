public class jump {
    public static void main(String[] args) {
        int[] nums = {2, 3, 1, 1, 4};

        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {

            // If current index is beyond reachable range
            if (i > maxReach) {
                System.out.println("Not Reached");
                return;
            }

            // Update farthest reachable index
            maxReach = Math.max(maxReach, i + nums[i]);
        }

        System.out.println("Reached");
    }
}