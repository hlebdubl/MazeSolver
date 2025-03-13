public class Move {

    public boolean moveRight(String[][] maze, int row, int col){
        return maze[row][col + 1].equals(".");
    }
    public boolean moveLeft(String[][] maze, int row, int col){
        return maze[row][col - 1].equals(".");
    }
    public boolean moveUp(String[][] maze, int row, int col){
        return maze[row+1][col].equals(".");
    }
    public boolean moveDown(String[][] maze, int row, int col){
        return maze[row-1][col].equals(".");
    }
    private boolean fork(String[][] maze, int row, int col){
        int count = 0;

        if(moveDown(maze, row, col)){
            count++;
        }
        if(moveUp(maze, row, col)){
            count++;
        }
        if(moveLeft(maze, row, col)){
            count++;
        }
        if(moveRight(maze, row, col)){
            count++;
        }
        return count >= 2;
    }
}
