package Lab8;
//Lab8 9am
//Daniel Rochefort

public class Rectangle implements Comparable<Rectangle>{
    private int height;
    private int width;
    private Point topCorner;

    public Rectangle(int h, int w, Point tCorner){
        this.height = h;
        this.width = w;
        this.topCorner = tCorner;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public Point getTopCorner() {
        return topCorner;
    }

    public void setHeight(int h) {
        this.height = h;
    }

    public void setWidth(int w) {
        this.width = w;
    }

    public void setTopCorner(Point tCorner) {
        this.topCorner = tCorner;
    }

    @Override
    public String toString(){
        return "Height: " + height + " Width: " + width + " Top Corner: " + topCorner;
    }

    @Override
    public int compareTo(Rectangle other) {
        if(this.height == other.height){
            if(this.width == other.width){
                return this.topCorner.compareTo(other.topCorner);
            } else {
                return this.width - other.width;
            }
        } else {
            return this.height - other.height;
        }
    }

}
