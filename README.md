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
     "it is possible to get from the starting position to the treasure"
     
the recursive abstraction can

    determine the boolean value of the statement
    "it is possible to get from a position with one less stepping stone to the treasure"
    
## base case
- the explorer is at the treasure
- No possible new next step exists

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

recursive solution:

	if the explorer is at the treasure

		return true

the explorer can move in 4 directions:

	0 north
	1 east
	2 south
	3 west

	for each direction
	
		mark the current stepping stone
		if there is an available stepping stone in that direction 
			move to that space
			invoke the recursive abstraction
	
	return false

## class(es), with fields and methods
null

## version *n* wish list
shortest path


