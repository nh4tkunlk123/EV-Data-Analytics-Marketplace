# EV Data Analytics Marketplace
## (Chợ dữ liệu phân tích xe điện)

### 1️⃣ Giới thiệu
EV Data Analytics Marketplace là một nền tảng web được phát triển hoàn toàn bằng **ngôn ngữ Java**, cho phép **trao đổi, mua bán và phân tích dữ liệu xe điện (EV)** giữa các bên như hãng xe, trạm sạc, startup, nhà nghiên cứu hoặc cơ quan quản lý.

Hệ thống hoạt động như một **chợ dữ liệu trực tuyến**, giúp kết nối bên cung cấp và bên sử dụng dữ liệu EV, đồng thời cung cấp các công cụ thống kê và trực quan hóa thông tin.

---

### 2️⃣ Mục tiêu dự án
- Tạo một **nền tảng Java web** cho phép chia sẻ và thương mại hóa dữ liệu xe điện.
- Giúp **người dùng dễ dàng truy cập, tìm kiếm, phân tích dữ liệu** EV.
- Đảm bảo **bảo mật, phân quyền và quản lý dữ liệu minh bạch**.
- Xây dựng kiến trúc mô hình MVC rõ ràng, có khả năng mở rộng trong tương lai.

---

### 3️⃣ Phạm vi hệ thống
Hệ thống gồm ba nhóm người dùng chính:
1. **Data Consumers** – Người dùng dữ liệu (hãng xe, startup, nhà nghiên cứu, tổ chức,...)
2. **Data Providers** – Nhà cung cấp dữ liệu (hãng xe, trạm sạc, công ty quản lý đội xe,...)
3. **Admin** – Quản trị viên của hệ thống Marketplace.

---

### 4️⃣ Chức năng chính

#### 🔹 Data Consumer
- Tìm kiếm & khám phá các bộ dữ liệu EV.
- Mua hoặc thuê gói dữ liệu raw hoặc đã phân tích.
- Xem dashboard phân tích (hiệu suất pin, hành vi lái xe, mức phát thải...).
- Gọi API nội bộ để lấy dữ liệu hoặc xem qua giao diện web.

#### 🔹 Data Provider
- Đăng ký và quản lý nguồn dữ liệu.
- Thiết lập chính sách chia sẻ, giá bán, quyền sử dụng.
- Theo dõi lượt tải xuống, doanh thu và phản hồi người dùng.
- Đảm bảo dữ liệu được ẩn danh, tuân thủ quyền riêng tư.

#### 🔹 Admin
- Quản lý tài khoản người dùng (provider, consumer).
- Kiểm duyệt dữ liệu trước khi công bố.
- Theo dõi giao dịch, xử lý thanh toán.
- Báo cáo, thống kê và bảo mật toàn hệ thống.

---

### 5️⃣ Công nghệ sử dụng

| Thành phần | Công nghệ |
|-------------|------------|
| **Ngôn ngữ chính** | Java |
| **Framework / Kiến trúc** | Java Servlet + JSP + MVC |
| **Frontend** | HTML5, CSS3, JavaScript |
| **Cơ sở dữ liệu** | MySQL (kết nối qua JDBC) |
| **Máy chủ chạy web** | Apache Tomcat |
| **Quản lý dự án** | Maven |
| **Công cụ phát triển** | Visual Studio Code / IntelliJ IDEA / Eclipse |
| **Quản lý phiên bản** | Git + GitHub |

---

### 6️⃣ Cấu trúc tổng quan dự án
