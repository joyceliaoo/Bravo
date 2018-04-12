/**
  Determine the boolean value of the statement 
  "it is possible to get from the starting position to the treasure"
  using recursive backtracking.
 */

public class MazeSolver {
	private Maze maze;
	private boolean solution;
	private Displayer displayer;

	public MazeSolver(Maze mazeToBeSolved, int windowHeight) {

		displayer = new Displayer(windowHeight);

		maze = mazeToBeSolved;
		displayer.atTopOfWindow("solving maze:" + System.lineSeparator() + maze.toString());
		solution = SolveMaze();
	}

	private boolean SolveMaze() {

	    int[] directions = {Maze.EAST, Maze.SOUTH, Maze.WEST, Maze.NORTH};
	 
	    if (maze.explorerIsOnA() == Maze.TREASURE)
		return true;
	    else if (maze.explorerIsOnA() == Maze.WALL)
		return false;
	    else {
		
			   
		for (int direction : directions) {

		    Maze snapshot = new Maze(maze);
		    maze.dropA(Maze.WALL);
		    maze.go(direction); 
		    displayer.atTopOfWindow(maze.toString());
		    if (SolveMaze())
			return true;
		    maze = snapshot;
		    displayer.atTopOfWindow(maze.toString());
		}

		return false;
	    }
	}

	public String toString() {
		if (solution)
			return "A solution exists";
		else 
			return "no solution";
	}
}
