public class Main {
    public static void main(String[] args) {
        Rate_Display rd = new Rate_Display();
        Rate_Cal rc = new BOC(15);
        Rate_Cal com = new Com_Bank(12);

        rd.Display(com);









        //System.out.println("Hello world!");
    }
}