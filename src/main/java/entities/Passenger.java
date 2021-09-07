package entities;

import java.util.Arrays;
import java.util.Scanner;

public class Passenger {
    private String hoTen;
    private String gioiTinh;
    private int tuoi;
    private Ticket[] danhSachVe;

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Thông tin hành khách:\n");
        sb.append("Họ tên: ").append(hoTen).append('\n');
        sb.append("Gioi tính: ").append(gioiTinh).append('\n');
        sb.append("Tuổi:").append(tuoi);
        sb.append("\nDanh sách vé: \n").append(danhSachVe == null ? "null" : Arrays.asList(danhSachVe).toString());
//        sb.append('}');
        return sb.toString();
    }

    public Passenger(String hoTen, String gioiTinh, int tuoi, Ticket[] danhSachVe) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.tuoi = tuoi;
        this.danhSachVe = danhSachVe;
    }

    public Passenger() {
    }

    public void inputPassengerInfo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào Họ Tên: ");
        this.hoTen = sc.nextLine();
        System.out.println("Nhập vào Giới tính: ");
        this.gioiTinh = sc.nextLine();
        System.out.println("Nhập vào tuổi:");
        this.tuoi = sc.nextInt();
        System.out.println("Nhập vào số vé: ");
        int n = sc.nextInt();
        danhSachVe = new Ticket[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Vé " + (i+1) + ": \n");
            danhSachVe[i] = new Ticket().inputTicketInfo();
        }
    }
}
