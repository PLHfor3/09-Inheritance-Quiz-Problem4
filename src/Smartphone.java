public class Smartphone extends Computer
{
    private double screenWidth, screenHeight;

    public Smartphone(double w, double h)
    {
        super("flash");
        screenWidth = w;
        screenHeight = h;
    }

    public double getScreenWidth()
    {
        return screenWidth;
    }

    public double getScreenHeight()
    {
        return screenHeight;
    }
}
