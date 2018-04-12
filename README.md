# Maze Problem

## personnel 
Jason Cheung and Joyce Liao

## statement of problem
what is the boolean value of the statement "it is possible to get from the starting position to the treasure"?

## recursive abstraction

<!--
When I am asked to 

	determine if it is possible to get 
	from the _starting position_ 
	to the _treasure_
	in a maze with _n_ intersections

The recursive abstraction can

	determine the boolean to the statement 
	for a maze with _n-1_ intersections
	-->

when I am asked to

     determine the boolean value of the statement
     "it is possible to get from the current position to the treasure"
     
the recursive abstraction can

    determine the boolean value of the statement
    "it is possible to get to the treasure from a position exactly one step away from current position"
    
## base case
- the explorer is at the treasure
- the explorer is in a wall

## English or pseudocode description of algorithm
<!--
	if no possible next step
	if treasure discovered
		return true
	for each step forward (direction that the mazeSolver is facing) on the maze, check if a potential path exists 
		for each of the directions 
			- 90 degrees to the left
			- forward
			- 90 degrees to the right
	if a path exists
		face the path
		advance forward one step
		execute the recursive abstraction
		walk back to previous intersection`
		
	if there is no treasure

		return false
		
		-->

<!--use a pair routine to check if there is no treasure-->


recursive solution:

	if the explorer is at the treasure
		return true
	
	if the explorer is in a wall
		return false

else the explorer can move in 4 directions:

	north
	east
	south
	west
	
	for each direction
		
		take a snapshot
		drop a wall
		move 1 space in that direction
		if (answer to the recursive abstraction) // there is a way to get to treasure from new position
			return true
		backtrack to snapshot

	return false

## class(es), with fields and methods

#### Maze Class
##### methods
- toString()
- go()
- explorerIsOnA()

##### fields
- TREASURE, WALL, STEPPING_STONE
- EAST, NORTH, WEST, SOUTH
- maze, MAX_RANKS, rankCount, explorerPosition

#### Vector Class
private class in Maze
##### methods
- add()
- equals ()

##### fields
- rank, file

## version *n* wish list
- all solutions
- shortest path

## Known bugs


