import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        MazeSolver wow = new MazeSolver();
        String[][] maze = wow.getGameMaze();
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        ArrayList<String> path = new ArrayList<>();

        boolean done = MazeSolver.solveMaze(maze, 0, 0, visited, path);

        for(int i = 0; i < path.size(); i ++){
            if(i == path.size() - 1){
                System.out.print(path.get(i));
            }
            else{
                System.out.print(path.get(i) + "--->");
            }

            if(i % 8 == 0 && i != 0){
                System.out.println();
            }
        }
    }
}


