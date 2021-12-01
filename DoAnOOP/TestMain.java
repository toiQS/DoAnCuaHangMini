package DoAnOOP;

import java.util.Scanner;

public class TestMain {
    public static void DanhSachNhanVien(){

    }
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        QuanLy NVien = new QuanLy();
//        String arrNhanVien[];
//        String Ten,Ma = null;
//        // String TiepTuc = null;
//        do{
            System.out.println("Ten Nhan Vien: ");
            String Ten = a.nextLine();
            System.out.println("Ma Nhan Vien: ");
            String Ma = a.nextLine();
            System.out.println("Gioi Tinh: ");
            String GioiTinh = a.nextLine();
            System.out.println("CCCD: ");
            int CCCD = a.nextInt();
            System.out.println("Dia Chi: ");
            String DiaChi = a.nextLine();
            System.out.println("Ngay Vao Lam: ");
            String NgayVaoLam = a.nextLine();
            System.out.println("SDT: ");
            String SDT = a.nextLine();
            // System.out.println("Tiep tuc?: ");
            Nhanvien nhanvien = new Nhanvien(Ten, Ma, GioiTinh, CCCD, DiaChi, NgayVaoLam, SDT);

            NVien.addNhanVien(nhanvien);
            
//        // }while(!TiepTuc.isEmpty());
//        }while(!Ten.isEmpty());
    }
}
