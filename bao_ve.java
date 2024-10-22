public class bao_ve {

    private String ten;
    private String gioiTinh;
    private String id;
    private String sodienthoai;
    private int calamviec;

    public bao_ve(String ten, String gioiTinh, String id, String sodienthoai, int calamviec) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.id = id;
        this.sodienthoai = sodienthoai;
        this.calamviec = calamviec;
    }
    public String getTen() {
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public String getGioiTinh() {
        return gioiTinh;
    }
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getSodienthoai() {
        return sodienthoai;
    }
    public void setSodienthoai(String sodienthoai){
        this.sodienthoai = sodienthoai;
    }
    public int getCalamviec() {
        return calamviec;
    }
    public void setCalamviec(int calamviec){
        this.calamviec = calamviec;
    }

    public void hienThiThongTin() {
        System.out.println("Tên: " + this.ten);
        System.out.println("Giới tính: " + this.gioiTinh);
        System.out.println("ID: " + this.id);
        System.out.println("Số Điện Thoại: " + this.sodienthoai);
        System.out.println("Ca làm việc: " + this.calamviec);
    }
    public static void main(String[] args) {
        bao_ve baoVe1 = new bao_ve("Nguyễn Văn A", "Nam", "BV001", "0367505366", "sáng");
        System.out.println("Thông tin ban đầu của bảo vệ:");
        baoVe1.hienThiThongTin();
        baoVe1.setTen("Trần Văn B");
        baoVe1.setGioiTinh("Nam");
        baoVe1.setId("BV002");
        baoVe1.setSodienthoai("0794172227");
        baoVe1.setCalamviec("chiều");
        System.out.println("\nThông tin sau khi cập nhật:");
        baoVe1.hienThiThongTin();
    }
}
