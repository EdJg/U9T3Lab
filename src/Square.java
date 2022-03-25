import java.awt.Graphics;

public class Square extends Shape
{
    public Square()
    {
        super();
    }

    @Override
    public void draw(Graphics given)
    {
        given.setColor(getColor());
        given.drawRect(getMinX(), getMinY(), getWidth(), getWidth());
    }
}
