import java.util.*;

class Solution {

    static class State {
        int row;
        int col;
        int energy;
        int mask;
        int moves;

        State(int row, int col, int energy, int mask, int moves) {
            this.row = row;
            this.col = col;
            this.energy = energy;
            this.mask = mask;
            this.moves = moves;
        }
    }

    public int minMoves(String[] classroom, int energy) {

        int m = classroom.length;
        int n = classroom[0].length();

        int startRow = 0;
        int startCol = 0;

        
        int[][] litterIndex = new int[m][n];

        for (int i = 0; i < m; i++) {
            Arrays.fill(litterIndex[i], -1);
        }

        int litterCount = 0;

      
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                char cell = classroom[i].charAt(j);

                if (cell == 'S') {
                    startRow = i;
                    startCol = j;
                }

                if (cell == 'L') {
                    litterIndex[i][j] = litterCount;
                    litterCount++;
                }
            }
        }

    
        if (litterCount == 0) {
            return 0;
        }

        int targetMask = (1 << litterCount) - 1;

     
        boolean[][][][] visited =
            new boolean[m][n][1 << litterCount][energy + 1];

        Queue<State> queue = new LinkedList<>();

    
        queue.offer(
            new State(
                startRow,
                startCol,
                energy,
                0,
                0
            )
        );

        visited[startRow][startCol][0][energy] = true;

        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};

        while (!queue.isEmpty()) {

            State current = queue.poll();

   
            if (current.mask == targetMask) {
                return current.moves;
            }

            if (current.energy == 0) {
                continue;
            }

            for (int d = 0; d < 4; d++) {

                int newRow = current.row + dr[d];
                int newCol = current.col + dc[d];

                if (newRow < 0 || newRow >= m ||
                    newCol < 0 || newCol >= n) {
                    continue;
                }

                if (classroom[newRow].charAt(newCol) == 'X') {
                    continue;
                }

                int newEnergy = current.energy - 1;

                int newMask = current.mask;

                char cell = classroom[newRow].charAt(newCol);

                if (cell == 'L') {

                    int index = litterIndex[newRow][newCol];

                    newMask = newMask | (1 << index);
                }

                if (cell == 'R') {
                    newEnergy = energy;
                }

                if (!visited[newRow][newCol][newMask][newEnergy]) {

                    visited[newRow][newCol][newMask][newEnergy] = true;

                    queue.offer(
                        new State(
                            newRow,
                            newCol,
                            newEnergy,
                            newMask,
                            current.moves + 1
                        )
                    );
                }
            }
        }

     
        return -1;
    }
}