package Lab6;

//Lab6 9am
//Daniel Rochefort

public class ColoringPoint extends Point implements Coloring{

    private String color;

    public ColoringPoint(int x, int y, String color){
        super(x,y);
        this.color = color;
    }

    public void setColor(String color){
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public boolean equals(Object o){
        if(super.equals(o) && o instanceof Coloring){
            Coloring other = (Coloring) o;
            return color.equals(other.getColor());
        } else {
            return false;
        }
    }


    @Override
    public String toString(){
        return super.toString() + " and the color is " + color;
    }
}
