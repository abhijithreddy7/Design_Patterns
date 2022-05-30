package classes;

public class Main {
    public static void main(String [] args) throws CloneNotSupportedException
    {
        StudentList syr1 = new StudentList();
        syr1.setClassName("YR1_ECE");
        syr1.loadData();

        //StudentList syr2 = (StudentList) syr1.clone();--swallow Cloning
        //syr2.setClassName("YR2_ECE");
        //System.out.println(syr2);

        StudentList syr2 = syr1.clone();//--Deep Cloning
        syr2.setClassName("YR2_ECE");
        syr2.getStudents().remove(1);
        syr2.getStudents().get(1).setSname("Abhi");

        System.out.println(syr1);
        System.out.println(syr2);

    }
}
