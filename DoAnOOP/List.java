package DoAnOOP;

import java.util.ArrayList;

public class List {
    private ArrayList<Nhanvien>nhanvien;
    public List(){
        this.nhanvien = new ArrayList<Nhanvien>();
    }
    public void add(Nhanvien nhanvien){
        this.nhanvien.add(nhanvien);
    }
}
