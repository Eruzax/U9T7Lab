public class Point
{
    private int x;
    private int y;
    private String label;

    public Point(String l, int x, int y)
    {
        label = l;
        this.x = x;
        this.y =y;
    }

    @Override
    public String toString()
    {
        return "Point " + label + " is at x = " + x + ", y = "  + y;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null || !(obj instanceof Point))
        {
            return false;
        }
        Point otherPoint = (Point)obj;
        return (this.x == otherPoint.x) && (this.y == otherPoint.y);
    }
}
