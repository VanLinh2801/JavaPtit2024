# Quản lý bãi đỗ xe

---

Báo cáo: https://docs.google.com/document/d/1I_KthIkkYzksk3W6GJOJou9JO26tVRqQ/edit?usp=sharing&ouid=103665712743104293226&rtpof=true&sd=true

---

# I. Yêu cầu dự án

- Tài liệu này nhằm mục đích thiết kế chi tiết phần mềm **Quản lý bãi đỗ xe**. Phần mềm đáp ứng nhu cầu quản lý vé xe, xe cộ và nhân viên bảo vệ trong bãi đỗ. Bằng việc tự động hóa các thao tác, phần mềm giúp cho việc quản lý thông tin xe và vé trở nên dễ dàng, hiệu quả hơn.
- Tài liệu này được dùng làm đầu vào cho quá trình lập trình của việc xây dựng chương trình.
- Các đối tượng sử dụng tài liệu: thành viên lập trình và thành viên thiết kế dự án.
- Phạm vi quản lý:
  - Hiện tại, bãi đỗ xe có khả năng quản lý nhiều xe vào ra hàng ngày.
  - Phân loại vé theo vé ngày và vé tháng.
  - Quản lý thông tin nhân viên bảo vệ và ca làm việc của họ.
- Tài liệu sẽ liệt kê chi tiết các nội dung về các chức năng phần mềm thiết kế:
  - **Quản lý vé gửi xe**:
    - Phân loại vé thành vé ngày và vé tháng.
    - Tính toán giá vé dựa trên thời gian đỗ xe.
    - Lưu trữ và cập nhật thông tin vé.
  - **Quản lý thông tin xe cộ**:
    - Ghi nhận thông tin xe khi vào bãi, bao gồm biển số xe, loại xe, và thời gian vào bãi.
    - Theo dõi và cập nhật thông tin xe.
  - **Quản lý nhân viên bảo vệ**:
    - Lưu trữ thông tin cá nhân của bảo vệ như tên, số điện thoại, ca làm việc.
    - Cập nhật và hiển thị thông tin chi tiết của từng bảo vệ.

---

# II. Phân tích thiết kế ra lớp

Các thực thể cần quản lý: Vé, Xe cộ, Bảo vệ

---

## 1. Thông tin về vé được lưu lại như sau:

### - Thuộc tính:
  - **Mã vé (ID)**: Được gán tự động.
  - **Loại vé (loaive)**: Vé ngày hoặc vé tháng.
  - **Giờ vào (giovao)**: Thời gian xe vào bãi.
  - **Giờ ra (giora)**: Thời gian xe rời bãi.
  - **Giá vé (gia)**: Giá vé được tính toán dựa trên thời gian đỗ xe hoặc giá cố định với vé tháng.
  - **Thời hạn vé tháng (thoihanvethang)**: Ngày hết hạn của vé tháng (nếu là vé tháng).

### - Chức năng:
  - Hiển thị thông tin vé.
  - Thêm, sửa, xóa thông tin vé.
  - Tính toán giá vé dựa trên thời gian xe ở bãi.

---

## 2. Thông tin về xe cộ được lưu lại như sau:

### - Thuộc tính:
  - **Biển số xe (plateNumber)**: Biển số của xe.
  - **Loại xe (type)**: Loại xe, ví dụ: xe máy, ô tô.
  - **Thời gian vào (entryTime)**: Thời gian xe vào bãi.

### - Chức năng:
  - Hiển thị thông tin xe cộ.
  - Thêm, sửa, xóa thông tin xe cộ.
  - Tìm kiếm xe theo biển số.

---

## 3. Thông tin về nhân viên bảo vệ được lưu lại như sau:

### - Thuộc tính:
  - **Tên (ten)**: Tên của nhân viên bảo vệ.
  - **Giới tính (gioiTinh)**: Giới tính của bảo vệ.
  - **Mã nhân viên (id)**: Mã định danh duy nhất cho bảo vệ.
  - **Số điện thoại (sodienthoai)**: Số điện thoại của bảo vệ.
  - **Ca làm việc (calamviec)**: Số ca làm việc của bảo vệ.

### - Chức năng:
  - Hiển thị thông tin bảo vệ.
  - Thêm, sửa, xóa thông tin bảo vệ.
  - Tìm kiếm bảo vệ theo ca làm việc.

