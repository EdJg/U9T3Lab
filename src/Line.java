import java.awt.Graphics;

public class Line extends Shape
{
    public Line()
    {
        super();
    }

    @Override
    public void draw(Graphics given)
    {
        given.setColor(getColor());
        given.drawLine(getPoint1().x, getPoint1().y, getPoint2().x, getPoint2().y);
    }
}
