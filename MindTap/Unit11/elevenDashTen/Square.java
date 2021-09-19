package MindTap.Unit11.elevenDashTen;

public class Square extends GeometricFigure
{
    private double area;
    public Square(int w, int h, String f)
    {
        super(h, w, f);
        // write your code here
        this.width=w;
        this.height=h;
        this.figure=f;
    }

    public double figureArea(int w, int h)
    {
        // write your code here
        area=(w*h);
        return area;
    }
}
