package classes;

import java.util.ArrayList;
import java.util.List;

public class StudentList implements Cloneable
{
    private String className;
    List<Student> students = new ArrayList<>();

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
    public void loadData()
    {
        for(int i=1;i<=5;i++)
        {
            Student s = new Student(i,"Student"+i);
            getStudents().add(s);
        }
    }
    @Override
    public String toString() {
        return "StudentList{" +
                "className='" + className + '\'' +
                ", students=" + students +
                '}';
    }

    //@Override--Swallow Cloning
    // protected Object clone() throws CloneNotSupportedException {
    //    return super.clone();
    //}

    @Override
    protected StudentList clone() throws CloneNotSupportedException {//--Deep Cloning
        StudentList syr = new StudentList();
        for (Student s : this.getStudents())
        {
            syr.getStudents().add(new Student(s.getSid(),s.getSname()));
        }
        return syr;
    }
}
