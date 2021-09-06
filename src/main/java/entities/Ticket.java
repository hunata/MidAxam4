package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ticket {
    private String tenChuyen;
    private LocalDateTime ngayBay;
    private int giaVe;


    public int getGiaVe() {
        return giaVe;
    }

    public Ticket() {
        this.tenChuyen="A";
        this.ngayBay = LocalDateTime.now();
        this.giaVe= 0;
    }

    public Ticket(String tenChuyen, LocalDateTime ngayBay, int giave) {
        this.tenChuyen = tenChuyen;
        this.ngayBay = ngayBay;
        this.giaVe = giaVe;
    }
    public Ticket inputTicketInfo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tên chuyến: ");
        this.tenChuyen = sc.nextLine();
        System.out.println("Nhập vào ngày bay: ");
        String dateTime = sc.nextLine();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        this.ngayBay = LocalDateTime.parse(dateTime,df);
        System.out.println("Nhập vào giá vé:");
        this.giaVe = sc.nextInt();
        return this;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Thông tin vé:\n");
        sb.append("Tên chuyến: ").append(tenChuyen);
        sb.append("\nNgày bay: ").append("  "+ngayBay);
        sb.append("\nGiá vé: ").append("    "+giaVe);
        return sb.toString();
    }
}
