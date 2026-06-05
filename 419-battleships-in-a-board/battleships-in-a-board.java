class Solution {

    int count = 0;

    public int countBattleships(char[][] board) {

        int rows = board.length;
        int cols = board[0].length;

        int[][] vis = new int[rows][cols];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                if (board[i][j] == 'X' &&
                    vis[i][j] == 0) {

                    count++;

                    dfs(board, vis, i, j);
                }
            }
        }

        return count;
    }

    public void dfs(char[][] board,
                    int[][] vis,
                    int row,
                    int col) {

        int rows = board.length;
        int cols = board[0].length;

        // Boundary check
        if (row < 0 ||
            col < 0 ||
            row >= rows ||
            col >= cols) {

            return;
        }

        // Water check
        if (board[row][col] != 'X') {
            return;
        }

        // Visited check
        if (vis[row][col] == 1) {
            return;
        }

        vis[row][col] = 1;

        // Up
        dfs(board, vis, row - 1, col);

        // Right
        dfs(board, vis, row, col + 1);

        // Down
        dfs(board, vis, row + 1, col);

        // Left
        dfs(board, vis, row, col - 1);
    }
}