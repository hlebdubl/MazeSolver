import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MazeSolver {

    private String[][] gameMaze = getMaze("src/maze");

    public String[][] getGameMaze() {
        return gameMaze;
    }

    public static String[][] getMaze(String fileName) {
        File f = new File(fileName);
        Scanner s = null;
        try {
            s = new Scanner(f);
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
            System.exit(1);
        }

        ArrayList<String> fileData = new ArrayList<String>();
        while (s.hasNextLine())
            fileData.add(s.nextLine());

        int rows = fileData.size();
        int cols = fileData.get(0).length();

        String[][] maze = new String[rows][cols];

        for (int i = 0; i < fileData.size(); i++) {
            String d = fileData.get(i);
            for (int j = 0; j < d.length(); j++) {
                maze[i][j] = d.charAt(j) + "";
            }
        }
        return maze;
    }

    public static boolean solveMaze(String[][] maze, int r, int c, boolean[][] visited, ArrayList<String> path) {
        int rows = maze.length;
        int cols = maze[0].length;

        if (r < 0 || c < 0 || r >= rows || c >= cols || maze[r][c].equals("#") || visited[r][c]) {
            return false;
        }

        visited[r][c] = true;
        path.add("(" + r + ", " + c + ")");

        if (r == rows - 1 && c == cols - 1) {
            return true;
        }
        if (solveMaze(maze, r - 1, c, visited, path) || solveMaze(maze, r + 1, c, visited, path) || solveMaze(maze, r, c - 1, visited, path) || solveMaze(maze, r, c + 1, visited, path)) {
            return true;
        }
        path.remove(path.size() - 1);
        return false;
    }
}
