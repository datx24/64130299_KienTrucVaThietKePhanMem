package creational.singleton.BTA6;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class DataAccess {
    private static DataAccess instance;
    private static Hashtable<String, DataAccess> mapDA = new Hashtable<>();
    List<SanPham> listSanPham = new ArrayList<>();
    public static DataAccess getInstance(String key){
        if( !mapDA.containsKey(key)){
            mapDA.put(key, new DataAccess());
        }
        return mapDA.get(key);
    }
    public void themSanPham(SanPham sp){
        listSanPham.add(sp);
    }


}
