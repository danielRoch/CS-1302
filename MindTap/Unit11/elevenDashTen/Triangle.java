package MindTap.Unit11.elevenDashTen;

public class Triangle extends GeometricFigure
{
    private double area;
    public Triangle(int w, int h, String f)
    {
        super(w, h, f);
        this.width=w;
        this.height=h;
        this.figure=f;
    }

    public double figureArea(int w, int h)
    {
        area = (double)(w * h * 0.5);
        return area;
    }
}
