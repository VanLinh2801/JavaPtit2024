
# Phần Mềm Quản Lý Bãi Đỗ Xe

## 1. Mục Tiêu Của Phần Mềm

Phần mềm quản lý bãi đỗ xe có mục tiêu chính là:
- Quản lý thông tin xe cộ và vé đỗ xe một cách tự động và chính xác.
- Giúp việc phát hành và phân loại vé diễn ra nhanh chóng, chính xác.
- Tối ưu hóa quy trình kiểm tra và quản lý nhân viên bảo vệ.
- Đảm bảo tính minh bạch và dễ dàng theo dõi trong quản lý bãi đỗ xe.

## 2. Quy Trình Nghiệp Vụ Chính

### 2.1 Quy Trình Phát Hành Vé

**Bước 1: Xe vào bãi đỗ**
- Khi một xe vào bãi, nhân viên bảo vệ hoặc hệ thống tự động cấp phát một vé cho xe đó.
- Thông tin thời gian vào (giờ và ngày) được ghi nhận.

**Bước 2: Phân loại vé**
- Hệ thống phân loại vé thành vé ngày hoặc vé tháng tùy theo yêu cầu của khách hàng.
    - **Vé ngày**: Được tính toán dựa trên thời gian thực tế mà xe đỗ trong bãi.
    - **Vé tháng**: Được áp dụng một mức phí cố định và có thời hạn một tháng.

**Bước 3: Lưu thông tin vé**
- Hệ thống lưu trữ thông tin vé vào cơ sở dữ liệu, bao gồm: mã vé, loại vé, thời gian vào, và thời gian dự kiến ra bãi (nếu có).

### 2.2 Quy Trình Tính Giá Vé

**Bước 1: Khi xe rời bãi**
- Nhân viên bảo vệ hoặc hệ thống tự động kiểm tra mã vé của xe và xác nhận thời gian rời bãi.

**Bước 2: Tính toán giá vé**
- Đối với vé ngày, hệ thống tính toán thời gian xe đỗ và áp dụng mức phí tương ứng.
    - Giá vé dựa trên khung thời gian cụ thể (giờ hoặc ngày).
- Đối với vé tháng, không cần tính toán giá bổ sung nếu thời hạn vé còn hiệu lực.

**Bước 3: Thanh toán**
- Sau khi giá vé được xác định, hệ thống cung cấp thông tin thanh toán cho khách hàng, có thể bằng tiền mặt hoặc qua phương thức thanh toán trực tuyến.

### 2.3 Quy Trình Quản Lý Nhân Viên Bảo Vệ

**Bước 1: Thêm thông tin nhân viên bảo vệ**
- Quản lý có thể nhập thông tin cá nhân và ca làm việc của từng nhân viên bảo vệ vào hệ thống, bao gồm: tên, giới tính, số điện thoại, và mã nhân viên.

**Bước 2: Phân ca làm việc**
- Mỗi nhân viên bảo vệ được phân ca làm việc theo lịch biểu được thiết lập trước. Hệ thống hỗ trợ theo dõi lịch làm việc để tránh trùng lặp hoặc thiếu hụt nhân sự.

**Bước 3: Cập nhật và kiểm tra thông tin**
- Thông tin của nhân viên bảo vệ có thể được cập nhật bất kỳ lúc nào, bao gồm việc thay đổi ca làm việc, cập nhật số điện thoại, hoặc thay đổi nhân sự.

### 2.4 Quy Trình Quản Lý Xe Cộ

**Bước 1: Ghi nhận thông tin xe cộ**
- Khi xe vào bãi, thông tin về loại xe, biển số xe được ghi nhận (nếu có).
- Hệ thống có thể sử dụng thông tin này để theo dõi xe cộ trong bãi, đồng thời liên kết với thông tin vé.

**Bước 2: Theo dõi xe trong bãi**
- Hệ thống cho phép theo dõi số lượng xe hiện tại trong bãi, vị trí đỗ của xe (nếu có quản lý vị trí), và thời gian vào bãi của mỗi xe.

**Bước 3: Xử lý xe ra bãi**
- Khi xe ra bãi, thông tin thời gian rời bãi và giá vé được tính toán. Thông tin xe được lưu trữ cho các báo cáo sau này hoặc xóa khỏi hệ thống sau khi hoàn tất giao dịch.

## 3. Các Yêu Cầu Kỹ Thuật

- **Giao diện người dùng:** Hỗ trợ giao diện đơn giản để nhân viên bảo vệ và quản lý dễ sử dụng.
- **Tính bảo mật:** Đảm bảo thông tin vé và nhân viên bảo vệ được bảo mật.
- **Cơ sở dữ liệu:** Hệ thống cần có cơ sở dữ liệu để lưu trữ thông tin về vé, xe cộ và nhân viên bảo vệ.
- **Khả năng mở rộng:** Phần mềm cần có khả năng mở rộng để tích hợp thêm các tính năng như thanh toán trực tuyến, nhận diện biển số xe, và quản lý vị trí đỗ.

