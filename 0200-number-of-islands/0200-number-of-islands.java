class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length; // total rows
        int n = grid[0].length; // total columns
        boolean[][] visited = new boolean[m][n]; //array to check if the element is visited or not 
        int totalIslands = 0; //island counter

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(grid[i][j]=='1' && !visited[i][j]){  // if there is land and not visited call its neighbours
                    island(grid, i, j, visited); // DFS approachs to call neighbours
                    totalIslands++;  // after getting 1 island increment
                }
            }
        }
        return totalIslands;
    }

    public void island(char[][] grid,int i, int j, boolean[][] visited){
        visited[i][j] = true;  // not visited now make visited 
        
            // check upwards
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