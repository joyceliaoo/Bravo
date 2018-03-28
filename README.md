# Maze Problem

## personnel 
Jason Cheung and Joyce Liao

## statement of problem
what is the boolean value of the statement "it is possible to get from the starting position to the treasure"?

## recursive abstraction

When I am asked to 

	determine if it is possible to get 
	from the _starting position_ 
	to the _treasure_
	in a maze with _n_ intersections

The recursive abstraction can

	determine the boolean to the statement 
	for a maze with _n-1_ intersections

=======
when I am asked to

     determine the boolean value of the statement
     "it is possible to get from the starting position to the treasure"
     
the recursive abstraction can

    determine the boolean value of the statement
    "it is possible to get from a position with one less choice to the treasure"

note: a "choice" as illustrated in [Piazza@446](https://piazza.com/class/j7oyiev6r7x576?cid=446) is made when the explorer is at a position with multiple options for the next stepping stone 

## base case
- the explorer is at the treasure
- No possible new next step exists

## English or pseudocode description of algorithm

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

recursive solution:

if the explorer is at the treasure

	record the solution 
	
if the explorer is at a dead end (when there is no available next stepping stone)

	backtrack - go back to the position where a choice was made

if the explorer is at a position and can choose only one next stepping stone ,

       move to that stepping stone
       turn if necessary

if the explorer is at a position and can choose multiple next stepping stones,

       for each path
       	   invoke the recursive abstraction

## class(es), with fields and methods
null

## version *n* wish list
<<<<<<< HEAD
=======
shortest path


