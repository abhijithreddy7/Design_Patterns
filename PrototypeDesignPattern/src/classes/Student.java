package classes;

public class Student {
    public Student(int sid, String sname) {
        this.sid = sid;
        this.sname = sname;
    }

    private int sid;
    private String sname;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
    public String toString()
    {
        return "Student [sid=" + sid + "sname=" + sname + "]";
    }
}
