package mirea.java.java_30.user_interface;

import mirea.java.java_30.manage.InternetOrdersManager;
import mirea.java.java_30.manage.TableOrdersManager;

import java.io.*;

public class Serializater {
    public void serialization(TableOrdersManager tom, InternetOrdersManager iom){
        File file1 = new File("tom.data");
        File file2 = new File("iom.data");

        ObjectOutputStream oos = null;

        try {
            FileOutputStream fos1 = new FileOutputStream(file1);
            FileOutputStream fos2 = new FileOutputStream(file2);
            if(fos1 != null){
                oos = new ObjectOutputStream(fos1);
                oos.writeObject(tom);
            }
            if(fos2 != null){
                oos = new ObjectOutputStream(fos2);
                oos.writeObject(iom);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(oos != null){
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public TableOrdersManager deserializationT(){
        TableOrdersManager tom = null;
        File file = new File("tom.data");
        ObjectInputStream ois = null;

        try {
            FileInputStream fis = new FileInputStream(file);
            if(fis != null){
                ois = new ObjectInputStream(fis);
                tom = (TableOrdersManager) ois.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally{
            if(ois != null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        if (tom == null){
            tom = new TableOrdersManager();
        }
        return tom;
    }

    public InternetOrdersManager deserializationI(){
        InternetOrdersManager iom = null;
        File file = new File("iom.data");
        ObjectInputStream ois = null;

        try {
            FileInputStream fis = new FileInputStream(file);
            if(fis != null){
                ois = new ObjectInputStream(fis);
                iom = (InternetOrdersManager) ois.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally{
            if(ois != null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        if (iom == null){
            iom = new InternetOrdersManager();
        }
        return iom;
    }
}
