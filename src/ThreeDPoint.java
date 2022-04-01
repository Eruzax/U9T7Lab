public class ThreeDPoint extends Point
{
    private int z;

    public ThreeDPoint(String l, int x, int y, int z)
    {
        super(l, x, y);
        this.z = z;
    }

    @Override
    public String toString()
    {
        return super.toString() + ", z = " + z;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj == null || !(obj instanceof Point))
        {
            return false;
        }
        ThreeDPoint otherPoint = (ThreeDPoint) obj;
        return super.equals(obj) && (this.z == otherPoint.z);
    }
}
