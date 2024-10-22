import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.Calendar;
import java.util.Scanner;

public class Ticket{
    private int ID;
    private String loaive;
    private Date giovao;
    private Date giora;
    private double gia;
    private Date thoihanvethang;

    public Ticket (int ID, String loaive, Date giovao, Date giora){
        this.ID = ID;
        this.loaive = loaive;
        this.giovao = giovao;
        this.giora = giora;
        //this.gia = gia;
    }

    //Get va Set
    public int getID(){
        return ID;
    }
    public void setID(int ID){
        this.ID = ID;
    }
    public String getLoaive(){
        return loaive;
    }
    public void setLoaive(String loaive){
        this.loaive = loaive;
    }
    public Date getGiovao(){
        return giovao;
    }
    public void setGiovao(Date giovao){
        this.giovao = giovao;
    }
    public Date getGiora(){
        return giora;
    }
    public void getGiora(Date giora){
        this.giora = giora;
    }
    public double getGia(){
        return gia;
    }
    public void setGia(double gia){
        this.gia = gia;
    }

    public Date getThoihanvethang(){
        return thoihanvethang;
    }
    public void setThoihanvethang(Date thoihanvethang){
        this.thoihanvethang = thoihanvethang;
    }

    public void phanloaive(){
        if ("Ngay".equals(loaive)){
            gia = tinhgiave();
        }
        else if ("Thang".equals(loaive)) {
            gia = 300000;
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(giovao);
            calendar.add(Calendar.MONTH, 1);
            this.thoihanvethang = calendar.getTime();
        }
    }
    // Tinh gia ve
    public double tinhgiave(){
        long thoiluong = giovao.getTime() - giora.getTime();
        long ngay = TimeUnit.MILLISECONDS.toDays(thoiluong);

        double gia = 0;

        /* Bang gia gui xe
        07h00 -> 18h00: 3.000
        18h00 -> 22h00: 5.000
        18h00 -> 07h00 (ngay hom sau): 11.000
        Ke tu 07h00: tinh gia theo ngay la 11.000
         */
        if (ngay >= 1){
            gia += (ngay - 1) * 11000;
        }

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(giora);
        int checkout = calendar.get(Calendar.HOUR_OF_DAY);
        int checkoutngay = calendar.get(Calendar.DAY_OF_YEAR);

        // Gia gui trong ngay
        if (checkout < 18){
            gia += 3000;
        }
        else if (checkout >= 18 && checkout <= 22){
            gia += 5000;
        }
        else {
            gia += 11000;
        }

        // Gia gui qua 1 ngay
        Calendar ngayvao = Calendar.getInstance();
        ngayvao.setTime(giovao);
        int checkinngay = ngayvao.get(Calendar.DAY_OF_YEAR);

        if (checkinngay > checkoutngay){
            gia += (checkoutngay - checkinngay) * 11000;
        }
        return gia;
    }
    @Override
    public String toString() {
        return "Ticket{" +
                "customerId=" + ID +
                ", ticketType='" + loaive + '\'' +
                ", checkInTime=" + giovao +
                ", checkOutTime=" + giora +
                ", ticketPrice=" + gia +
                (thoihanvethang != null ? ", expiryDate=" + thoihanvethang : "") +
                '}';
    }
    /*
    // Hàm main để chạy thử class Ticket
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin từ người dùng
        System.out.print("Nhập ID khách hàng: ");
        int ID = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Nhập loại vé (Day/Month): ");
        String loaive = scanner.nextLine();

        System.out.print("Nhập giờ vào (năm tháng ngày giờ phút): ");
        int yearIn = scanner.nextInt() - 1900;
        int monthIn = scanner.nextInt() - 1;
        int dayIn = scanner.nextInt();
        int hourIn = scanner.nextInt();
        int minuteIn = scanner.nextInt();
        Date giovao = new Date(yearIn, monthIn, dayIn, hourIn, minuteIn);

        Date giora = null;
        if ("Day".equals(loaive)) {
            System.out.print("Nhập giờ ra (năm tháng ngày giờ phút): ");
            int yearOut = scanner.nextInt() - 1900;
            int monthOut = scanner.nextInt() - 1;
            int dayOut = scanner.nextInt();
            int hourOut = scanner.nextInt();
            int minuteOut = scanner.nextInt();
            giora = new Date(yearOut, monthOut, dayOut, hourOut, minuteOut);
        }

        // Tạo đối tượng Ticket và thử nghiệm
        Ticket ticket = new Ticket(ID, loaive, giovao, giora);
        ticket.phanloaive();

        System.out.println(ticket);
    }
    */
}

