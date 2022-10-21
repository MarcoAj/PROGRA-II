package Particula;

import java.awt.Color;

class Particula{
    private Color color;
    private int x,y;
    public Particula(int x,int y){
    this.x = x;
    this.y = y;
    color= Color.RED;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public Color getColor(){
        return color;
    }
}