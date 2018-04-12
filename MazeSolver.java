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
		solution = SolveMaze();
	}

	private boolean SolveMaze() {
		if (maze.explorerIsOnA() == Maze.TREASURE)
			return true;
		else if (maze.explorerIsOnA() == Maze.WALL)
			return false;
		else {
			// solve maze in a straight line in one direction
			maze.go(Maze.EAST); 
			displayer.atTopOfWindow(maze.toString());
			return SolveMaze();
		}
	}

	public String toString() {
		if (solution)
			return "A solution exists";
		else 
			return "no solution";
	}
}
