package com.mani.Recursion;

public class MazeObstacle {
    public static void main(String[] args) {

        boolean[][] maze ={
                {true,true,true},
                {true,false,true},
                {true,true,true},
        };

        allPath(maze,0,0,"");

        System.out.println(countallPath(maze,0,0,""));
    }

    private static void allPath(boolean[][] maze, int row, int col,String p) {
        if(row == maze.length-1 && col == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if(maze[row][col] == false){
            return;
        }

        if(row < maze.length - 1){
            allPath(maze,row+1,col,p+"D");
        }

        if(col < maze[0].length - 1){
            allPath(maze,row,col+1,p+"R");
        }

    }

    private static int countallPath(boolean[][] maze, int row, int col,String p) {
        if(row == maze.length-1 && col == maze[0].length-1){
            return 1;
        }

        if(maze[row][col] == false){
            return 0;
        }

        int left=0,right=0;
        if(row < maze.length - 1){
            left = countallPath(maze,row+1,col,p+"D");
        }

        if(col < maze[0].length - 1){
            right = countallPath(maze,row,col+1,p+"R");
        }

        return left+right;
    }
}
