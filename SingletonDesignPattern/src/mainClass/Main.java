package mainClass;

import instantiationClasses.FileContent;

public class Main {
    public static void main(String args[]) {
        FileContent f1 = FileContent.getInstance();
        f1.showMessage();
        FileContent f2 = FileContent.getInstance();
        f2.showMessage();
        try
        {
            f1.fileReading();
        }
        catch(Exception ex)
        {
            System.out.println(ex);
        }
    }
}
