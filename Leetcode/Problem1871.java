class Problem1871 {
    public boolean canReach(String s, int minJump, int maxJump) {

        int n = s.length(); //Storing the length of string

        Queue<Integer> q = new LinkedList<>(); //Create a queue
        q.offer(0); //Start from index 0

        // farthest index already processed
        int farthest = 0; //Helps to keep track which index have we already checked.
        //This helps avoid checking same places again and again

        while (!q.isEmpty()) {

            int i = q.poll(); //Takes one index from queue

            // If reached last index
            if (i == n - 1) { //n-1 is last position if yes return true
                return true; 
            }

            // Start checking from max(farthest+1, i+minJump)
            int start = Math.max(farthest + 1, i + minJump);

            // End of jump range
            int end = Math.min(n - 1, i + maxJump);

            for (int j = start; j <= end; j++) {

                if (s.charAt(j) == '0') { //check if the position is safe
                    q.offer(j); //if safe add this into queue
                }
            }

            // Update farthest processed range
            farthest = end;
        }

        return false;
    }
}