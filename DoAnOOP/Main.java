package DoAnOOP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        
        // Hien thi lua chon nguoi dung
        System.out.println("1. Them");
        System.out.println("2. Xoa");
        System.out.println("3. Tim Kiem");
        System.out.println("4. Sua");
        System.out.println("5. Xuat");
        System.out.println("6. Thoat");
        System.out.println();

        // nhan su lua chon cua nguoi dung
        Scanner userInput = new Scanner(System.in);
        int choose = userInput.nextInt();
        userInput.close();

        // ap dun sua lua chon cua nguoi dung
        switch(choose) {
            case 1:
                System.out.println("Chon Them");
                break;
            case 2:
                System.out.println("Chon Xoa");
                break;
            case 3:
                System.out.println("Chon Tim Kiem");
                break;
            case 4:
                System.out.println("Chon Sua");
                break;
            case 5:
                System.out.println("Chon Xuat");
                break;
            case 6:
                System.out.println("Chon Thoat");
                break;
            default:
                System.out.println("Lua chon kh ton tai");
        }
    }
}
