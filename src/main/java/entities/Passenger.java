package entities;

import java.util.Arrays;
import java.util.Scanner;

public class Passenger {
    private String hoTen;
    private String gioiTinh;
    private int tuoi;
    private Ticket[] danhSachVe;

    @Override
    public String toString( ) {
        final StringBuffer sb = new StringBuffer("Thông tin hành khách:\n");
        sb.append("Họ tên: ").append(hoTen).append('\n');
        sb.append("Gioi tính: ").append(gioiTinh).append('\n');
        sb.append("Tuổi:").append(tuoi).append('\n');
        for (Ticket ticket: danhSachVe) {
            sb.append(ticket.toString());
        }
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

    public Passenger inputPassengerInfo() {
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
        return this;
    }

    public static Passenger[] inputPassengerList(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số lượng hành khách: ");
        int n = sc.nextInt();
        Passenger[] ps = new Passenger[n];
        for (int i = 0; i<n;i++){
            System.out.println("Hành khách " + (i+1)+ ":\n");
            ps[i] = new Passenger().inputPassengerInfo();
        }
        return ps;
    }

    public static void outputPassengerList(Passenger[] passengers) {
//        for (Passenger passenger : passengers) {
//            System.out.println(passenger.toString());
//        }
        for (int i = 0; i < passengers.length; i++){
            System.out.println(passengers[i].toString());
        System.out.println("Tổng tiền: "+ passengers[i].totalPrice());
        }
    }

    public int totalPrice(){
        int total=0;
        Passenger ps = new Passenger();
        for (int i=0; i<this.danhSachVe.length; i++){
            total += danhSachVe[i].getGiaVe();
        }
        return total;
    }
    public static void sortPassenger(Passenger[] psList) {
        for (int i = 0; i < psList.length - 1; i++) {
            for (int j = i + 1; j < psList.length; j++) {
                if (psList[j].totalPrice() > psList[i].totalPrice()) {
                    Passenger tmp = psList[i];
                    psList[i] = psList[j];
                    psList[j] = tmp;
                }
            }
        }

        for (int i = 0; i < psList.length; i++) {
            System.out.println("Hành khách sau khi sắp xếp " + (i + 1));
            System.out.println(psList[i].toString());
        }
    }
}

