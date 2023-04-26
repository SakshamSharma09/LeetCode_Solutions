class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int totalIslands = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j]=='1' && !visited[i][j]){
                    island(grid, i, j, visited);
                    totalIslands++;
                }
            }
        }
        return totalIslands;
    }

    public void island(char[][] grid,int i, int j, boolean[][] visited){
        visited[i][j] = true;
            
        if(i>0 && grid[i-1][j]=='1'&& !visited[i-1][j]){
            island(grid,i-1, j, visited);
        }
            // check downwards
        if(i< grid.length-1 && grid[i+1][j]=='1'&& !visited[i+1][j]){
            island(grid,i+1, j, visited);
        }
            //check leftwards
        if(j>0 && grid[i][j-1]=='1'&& !visited[i][j-1]){
            island(grid, i, j-1, visited);
        }
            // check rightwards
        if(j< grid[i].length-1 && grid[i][j+1]=='1'&& !visited[i][j+1]){
            island(grid, i, j+1, visited);
        }
    }
}