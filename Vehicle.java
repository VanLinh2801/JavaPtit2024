import java.util.ArrayList;
import java.util.List;

public class Vehicle {

    // Enum đại diện cho loại phương tiện
    private enum VehicleType {
        CAR, MOTOR_BIKE, BIKE, ELECTRIC_BIKE
    }

    // Thuộc tính của lớp Vehicle
    private int id; // Mã định danh của xe
    private VehicleType type; // Loại xe (CAR, MOTOR_BIKE, ...)
    private String numberPlate; // Biển số xe
    private static int slot[][] = new int[10][10]; // Mảng 2 chiều đại diện cho các chỗ đỗ xe

    // Phương thức lấy id của xe
    public int getId() {
        return id;
    }

    // Phương thức lấy loại xe
    public VehicleType getType() {
        return type;
    }

    // Phương thức lấy biển số xe
    public String getNumberPlate() {
        return numberPlate;
    }

    // Phương thức thiết lập id cho xe
    public void setId(int id) {
        this.id = id;
    }

    // Phương thức thiết lập loại xe từ chuỗi (CAR, MOTOR_BIKE, ...)
    public void setType(String type) {
        try {
            this.type = VehicleType.valueOf(type.toUpperCase()); // Chuyển chuỗi thành enum
        } catch (IllegalArgumentException e) {
            System.out.println("Loại xe không hợp lệ: " + type); // Báo lỗi nếu loại xe không tồn tại
        }
    }

    // Phương thức thiết lập biển số xe
    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    // Phương thức tìm các chỗ đỗ xe trống
    public static List<String> findEmptyParkingSlot() {
        List<String> result = new ArrayList<>();
        // Duyệt qua các vị trí trong mảng slot
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (slot[i][j] == 0) { // Kiểm tra xem chỗ đỗ có trống không
                    String temp = i + "-" + j; // Tạo chuỗi đại diện cho vị trí
                    result.add(temp); // Thêm vị trí trống vào danh sách
                }
            }
        }
        return result; // Trả về danh sách các vị trí trống
    }

    // Phương thức đỗ xe vào chỗ trống
    public static void parkVehicle(String inputSlot, Vehicle vehicle) {
        String[] temp = inputSlot.split("-"); // Tách chuỗi vị trí thành tọa độ x và y
        int x = Integer.parseInt(temp[0]); // Lấy tọa độ x
        int y = Integer.parseInt(temp[1]); // Lấy tọa độ y
        if (slot[x][y] != 0) { // Kiểm tra xem chỗ này đã có xe chưa
            System.out.println("Chỗ đỗ không trống");
            return;
        }
        slot[x][y] = vehicle.getId(); // Đỗ xe bằng cách đặt id xe vào chỗ đỗ
        System.out.println("Đỗ xe thành công");
    }

    // Phương thức loại bỏ xe khỏi chỗ đỗ
    public static void removeVehicle(String inputSlot) {
        String[] temp = inputSlot.split("-"); // Tách chuỗi vị trí thành tọa độ x và y
        int x = Integer.parseInt(temp[0]); // Lấy tọa độ x
        int y = Integer.parseInt(temp[1]); // Lấy tọa độ y
        if (slot[x][y] == 0) { // Kiểm tra xem chỗ này có xe không
            System.out.println("Chỗ đỗ trống");
            return;
        }
        slot[x][y] = 0; // Loại bỏ xe bằng cách đặt giá trị chỗ đỗ về 0
        System.out.println("Xóa bỏ xe thành công");
    }

    // Phương thức tìm kiếm xe theo id
    public static void searchVehicle(int id) {
        boolean found = false;
        // Duyệt qua tất cả các chỗ đỗ để tìm xe theo id
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (slot[i][j] == id) { // Nếu tìm thấy id xe trùng
                    System.out.println("Xe ở vị trí: " + i + "-" + j); // In vị trí chỗ đỗ
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy xe"); // Báo không tìm thấy nếu id không tồn tại
        }
    }
}
