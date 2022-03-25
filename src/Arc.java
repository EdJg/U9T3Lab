import java.awt.Graphics;

public class Arc extends Shape
{
    private int startAngle;
    private int arcAngle;

    public Arc()
    {
        super();
        startAngle = 30;
        arcAngle = 70;
    }

    @Override
    public void draw(Graphics given)
    {
        given.setColor(getColor());
        given.drawArc(getMinX(), getMinY(), getWidth(), getHeight(), startAngle, arcAngle);
    }
}
