import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MazeSolver {

    private String[][] gameMaze = getMaze("src/maze");
    private ArrayList<String> currentPath = new ArrayList<String>();


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

    String end = "(" + (gameMaze.length - 1) + "," + gameMaze[gameMaze.length -1].length + ")";

    Move moving = new Move();

    public ArrayList<String> mazeSolve(){
        for(int i = 0 ; i < gameMaze.length; i ++){

        }






        return currentPath;
    }




}
