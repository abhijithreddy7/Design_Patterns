public class Main {
    public static void main(String args[])
    {
        //Phone p = new Phone("Android","Qualcomm",5.5,3000,6);
        Phone p=new PhoneBuilder().setOs("Android").setBattery(3000).setRam(6).getPhone();
        System.out.println(p);
    }

}
