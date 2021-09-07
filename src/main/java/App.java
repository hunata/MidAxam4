import entities.Passenger;

public class App {
    public static void main(String[] args) {
        // Nhập vào thông tin hành khách và thông tin vé
        Passenger[] passengers = Passenger.inputPassengerList();

        // In ra thông tin hành khách số lượng vé và tổng tiền
        Passenger.outputPassengerList(passengers);

        //Sắp xếp danh sách hành khách theo chiều giảm dần của Tổng tiền.
        // In ra danh sách
        Passenger.sortPassenger(passengers);

    }
}
