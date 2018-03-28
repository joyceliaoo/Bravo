# Maze Problem

## personnel 
Jason Cheung and Joyce Liao

## statement of problem
what is the boolean value of the statement "it is possible to get from the starting position to the treasure"?

## recursive abstraction
when I am asked to

     determine the boolean value of the statement
     "it is possible to get from the starting position to the treasure"
     
the recursive abstraction can

    determine the boolean value of the statement
    "it is possible to get from a position with one less choice to the treasure"

note: a "choice" as illustrated in [Piazza@446](https://piazza.com/class/j7oyiev6r7x576?cid=446) is made when the explorer is at a position with multiple options for the next stepping stone 

## base case
the explorer is at the treasure

## English or pseudocode description of algorithm

recursive solution:

if the explorer is at a position and can choose only one next stepping stone ,

       follow the path
       turn if necessary

if the explorer is at a position and can choose multiple next stepping stones,

       for each path
       	   invoke the recursive abstraction
       	   if you reach a dead end
       	      backtrack - go back to the position where a choice was made	

a dead end is when there is no available next stepping stone

## class(es), with fields and methods
null

## version *n* wish list
shortest path
