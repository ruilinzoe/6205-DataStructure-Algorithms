package finalexam;

public class obstacleGrid {
    public int obstacleGrid(int[][] grid){
        int row=grid.length;
        int col=grid[0].length;
        if (grid[0][0]==1) return 0;
        grid[0][0]=1;
        for (int i=1; i<row; i++){
            grid[i][0]=(grid[i][0]==0 && grid[i-1][0]==1)? 1:0;
        }for (int j=1; j<col; j++){
            grid[0][j]=(grid[0][j]==0 && grid[0][j-1]==1)? 1:0;
        }
        for (int i=1; i<row; i++){
            for (int j=1; j<col; j++){
                if (grid[i][j]==0){
                    grid[i][j]=grid[i-1][j]+grid[i][j-1];
                }else {
                    grid[i][j]=0;
                }
            }
        }
        return grid[row-1][col-1];
    }
    //Time: O(M*N), M is the row, N is the column
    //Space: O(1), no extra structure used
}
