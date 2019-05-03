public class CarPolymorphism
    {
        int cylinder,wheels;
        String engine;
        CarPolymorphism(int c,int w,String engine)
        {
            cylinder=c;
            wheels=w;
            engine=engine;

            System.out.println("No. of cylinder="+c);
            System.out.println("No. of wheels="+w);
            System.out.println("Engine="+engine);
        }
    }
    class VehiclePolymorphism
    {
        public static void main(String args[])
        {
            CarPolymorphism car=new CarPolymorphism(5,4,"true");

        }}

