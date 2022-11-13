package assignment3;

public class wordSearch {
    public static boolean exist(char[][] board, String word) {
        int m=board.length;
        int n=board[0].length;

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(board[i][j]==word.charAt(0)){
                    if(bfs(board, word, 0, i, j, new boolean[m][n])){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private static boolean bfs(char[][] board, String word, int index, int row, int col, boolean[][] visited){
        if(index>=word.length()){
            return true;
        }
        if(row<0 || row>=board.length || col<0|| col>=board[0].length|| board[row][col]!=word.charAt(index) || visited[row][col]){
            return false;
        }

        visited[row][col]=true;
        if(bfs(board, word, index+1, row+1, col, visited)||bfs(board, word, index+1, row-1, col, visited)||bfs(board, word, index+1, row, col-1, visited)||bfs(board, word, index+1, row, col+1, visited)){
            return true;
        }
        visited[row][col]=false;
        return false;
    }

    public static void main(String[] args) {
        char[][] board ={{'A','B', 'C', 'E'},{'S', 'F', 'C', 'S'},{'A', 'D', 'E', 'E'}};
        String str="ABCCED";
        System.out.println(exist(board, str));
    }
}
