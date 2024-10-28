package creational.prototype.BTA8_gk;

import java.io.*;

public class PrototypeHelper_64130299 {
    public static <T extends Serializable> T copy(T t) {
            try {
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(bos);
                oos.writeObject(t);
                oos.flush();
                oos.close();
                bos.close();
                byte[] byteData = bos.toByteArray();
                ByteArrayInputStream bais = new ByteArrayInputStream(byteData);
                return (T) new ObjectInputStream(bais).readObject();
            }catch (Exception e){
                System.out.println(e.toString());
                return null;
            }
    }
}
