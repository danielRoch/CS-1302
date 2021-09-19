package Lab3;

//Lab3 9am
//Daniel Rochefort

public class Rectangle {

    private int height;
    private int width;
    private int x;
    private int y;

    public void setFields(int newx, int newy, int newwitdth, int newheight){
        this.x = newx;
        this.y = newy;
        this.width = newwitdth;
        this.height = newheight;

    }

    public int getHeight(){
        return height;
    }

    public int getWidth() {
        return width;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    @Override
    public String toString(){
        return "Rectangle [x=" + getX() + ", y=" + getY() + ", height=" + getHeight() + ". width=" + getWidth() + "]" + " Area is " + getWidth()*getHeight() + ".";
    }
}
