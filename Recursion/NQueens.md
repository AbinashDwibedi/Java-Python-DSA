# 
```java
class Solution {
    List<List<String>> res = new ArrayList<>();
    Set<Integer> cols = new HashSet<>();
    Set<Integer> diag1 = new HashSet<>();
    Set<Integer> diag2 = new HashSet<>();
    char[][] board;
    public List<List<String>> solveNQueens(int n) {
        board = new char[n][n];
        for(int i = 0;i<n;i++){
            Arrays.fill(board[i], '.');
        }
        helper(0,n);
        return res;
    }
    private void helper(int row, int n){
        if(row == n){
            res.add(construct(board));
            return;
        }
        for(int col = 0;col<n;col++){
            if(cols.contains(col) || diag1.contains(row-col) || diag2.contains(row+col)){
                continue;
            }
            cols.add(col);
            diag1.add(row - col);
            diag2.add(row + col);
            board[row][col] = 'Q';
            helper(row+1, n);
            board[row][col] = '.';
            diag2.remove(row + col);
            diag1.remove(row - col);
            cols.remove(col);
        }
    }
    private List<String> construct(char[][] board){
        List<String> res = new ArrayList<>();
        for(char[] row: board){
            res.add(new String(row));
        }
        return res;
    }
}
```