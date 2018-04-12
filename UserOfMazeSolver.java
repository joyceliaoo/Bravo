/**
  Test MazeSolver class

  Requires command line arguments:
  o  the name of a file containing a maze.
  o  the rank and file where an explorer is starting
  o  the height of your shell window

  Same as in class UserOfMaze
 */

public class UserOfMazeSolver {

	public static void main(String[] commandLine) 
		throws java.io.FileNotFoundException {
        	System.out.println();

        	Maze maze = new Maze( commandLine[0]
                            , Integer.parseInt( commandLine[1])
                            , Integer.parseInt( commandLine[2])
                            );

        	MazeSolver mazeSolver = new MazeSolver(maze, Integer.parseInt( commandLine[3]));
        	System.out.println(mazeSolver);
	}
}
