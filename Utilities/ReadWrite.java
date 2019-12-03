package Utilities;

import Objects.Member;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * File: ReadWrite.java Description: "Read/Write to file" class
 *
 * @author Thomas Or - 100613590
 */
public class ReadWrite {

    /**
     * Description:Function saves the specified 'ArrayList' to the specified
     * 'File'
     *
     * @param list
     * @throws FileNotFoundException
     * @throws IOException
     * @throws NotSerializableException
     */
    public static void saveData(ArrayList<Member> list) throws FileNotFoundException, IOException,
            NotSerializableException {

        FileOutputStream fos = new FileOutputStream("BackupFile.bin");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        //save data to file
        oos.writeObject(list);
        oos.close();
        JOptionPane.showMessageDialog(null, "Database successfully saved to 'BackupFile.bin'");
    }

    /**
     * Description: Function Reads objects from the specified File and returns
     * an Student ArrayList
     *
     * @return Student ArrayList
     * @throws FileNotFoundException
     * @throws IOException
     * @throws NotSerializableException
     * @throws ClassNotFoundException
     */
    public static ArrayList<Member> readData()
            throws FileNotFoundException, IOException,
            NotSerializableException, ClassNotFoundException {

        FileInputStream fis = new FileInputStream("BackupFile.bin");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ArrayList<Member> list = new ArrayList<>();

        //read data from file
        list = (ArrayList<Member>) ois.readObject();

        ois.close();
        return list;
    }
}
