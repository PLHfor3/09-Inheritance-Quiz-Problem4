public class Main
{
    public static void main(String[] args)
    {
        Computer myPhone = new Smartphone(2.55, 4.53);
        System.out.println("Device has memory: " + myPhone.getMemory() + ", screen area: " +
                ((Smartphone) myPhone).getScreenWidth() * ((Smartphone) myPhone).getScreenHeight() + " square inches.");
    }
}
