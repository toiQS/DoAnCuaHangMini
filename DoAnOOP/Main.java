package DoAnOOP;

import java.util.Scanner;

public class Main {
    // public String NhapThongTin(String Ten, String Ma, String )
    public static void main(String[] args) {
        
        // // Hien thi lua chon nguoi dung
        // System.out.println("1. Them");
        // System.out.println("2. Xoa");
        // System.out.println("3. Tim Kiem");
        // System.out.println("4. Sua");
        // System.out.println("5. Xuat");
        // System.out.println("6. Thoat");
        // System.out.println();

        // // nhan su lua chon cua nguoi dung
        // Scanner userInput = new Scanner(System.in);
        // int choose = userInput.nextInt();
        // userInput.close();

        // // ap dun sua lua chon cua nguoi dung
        // switch(choose) {
        //     case 1:
        //         System.out.println("Chon Them");
        //         break;
        //     case 2:
        //         System.out.println("Chon Xoa");
        //         break;
        //     case 3:
        //         System.out.println("Chon Tim Kiem");
        //         break;
        //     case 4:
        //         System.out.println("Chon Sua");
        //         break;
        //     case 5:
        //         System.out.println("Chon Xuat");
        //         break;
        //     case 6:
        //         System.out.println("Chon Thoat");
        //         break;
        //     default:
        //         System.out.println("Lua chon kh ton tai");
        // }
        Scanner a = new Scanner(System.in);
        String arrNhanVien[];
        String Ten,Ma = null;
        // String TiepTuc = null;
        do{
            System.out.println("Ten Nhan Vien: ");
            Ten = a.nextLine();
            System.out.println("Ma Nhan Vien: ");
            Ma = a.nextLine();
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
            
        // }while(!TiepTuc.isEmpty());
        }while(!Ten.isEmpty());
    }
    
}
