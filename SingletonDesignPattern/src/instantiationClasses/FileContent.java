package instantiationClasses;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class FileContent {
    //static FileContent classInstance;
    private static FileContent classInstance = new FileContent();//--eager Instantiation
    private FileContent()
    {
        System.out.println("The instance is created");
    }
    public static FileContent getInstance()//Lazy instantiation
    {
        if (classInstance == null)
        {
            classInstance = new FileContent();
        }
        return classInstance;
    }
    public void fileReading() throws Exception
    {
        File file = new File("/home/abhirm/SingletonDesignPattern/src/greetings.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        int ch=0;
        while((ch=br.read())!=-1)
        {
            char temp=(char) ch;
            System.out.print(temp);
        }
        br.close();
    }
    public void showMessage()
    {
        System.out.println("This is a method inside the Singleton Class");
    }
}
