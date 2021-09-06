package entities;

import java.util.Scanner;

public class Passenger {
    private String hoTen;
    private Boolean gioiTinh;
    private int tuoi;
    private Ticket[] danhSachVe;

    public Passenger(String hoTen, Boolean gioiTinh, int tuoi, Ticket[] danhSachVe) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
        this.danhSachVe = danhSachVe;
    }

    public Passenger() {
        this.hoTen ="Nguyễn Văn A";
        this.gioiTinh = true;
        this.tuoi = 20;
        this.danhSachVe = null;

    }

    public Passenger inputPassengerInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào Họ Tên: ");
        this.hoTen = sc.nextLine();
        System.out.println("Nhập vào Giới tính: ");
        this.gioiTinh = sc.hasNextBoolean();
        System.out.println("Nhập vào tuổi:");
        this.tuoi = sc.nextInt();
        int n;
        do {
            System.out.println("Nhập vào số vé: ");
            n = sc.nextInt();
        } while (n < 0);
        System.out.println("Danh sách vé:");
        danhSachVe = new Ticket[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập vào ticket thứ  " + i + ": ");
            danhSachVe[i] = new Ticket();
  
        }
        return this;
    }
}
