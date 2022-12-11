package finalexam;

public class numberIsland {
    public int numberIsland(int[][] grid){
        int row= grid.length;
        int col=grid[0].length;
        int count=0;
        for (int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                if(grid[i][j]==1){
                    count++;
                    helper(grid, i ,j);
                }
            }
        }
        return count;
    }

    private void helper(int[][] grid, int row, int col) {
        while (row>=0 && row< grid.length && col>=0 && col<grid[0].length && grid[row][col]==1){
            grid[row][col]=0;
            helper(grid, row+1, col);
            helper(grid, row-1, col);
            helper(grid, row, col+1);
            helper(grid, row, col-1);
        }
    }

    //Time: O(M*N), M is the row, N is the column
    //Space: O(1), no extra structure used
}
