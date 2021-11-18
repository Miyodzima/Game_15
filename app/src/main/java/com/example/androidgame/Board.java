package com.example.androidgame;

public class Board {
    public Board(int width, int height){

    }

    public void shuffle(){

    }

    boolean isUserWin(){
        return false;
    }

    public boolean isMoveAvalaible(int x, int y){
        return true;
    }

    public void draw(Draw draw){
        draw.onDraw(this);
    }

}
