# Bài tập thực hành kiểm thử với JUnit

Bài tập này tập trung vào việc viết kiểm thử đơn vị cho chức năng phân tích điểm số học sinh.

## Nội dung bài tập

- Chủ đề: Phân tích dữ liệu điểm số học sinh.
- Mục tiêu: Thực hành jUnit và áp dụng AI trong lập trình.
- Chức năng: Đếm học sinh giỏi và tính điểm trung bình hợp lệ.

## Cấu trúc thư mục

- /src : Chứa mã nguồn chương trình (`StudentAnalyzer.java`)
- /test : Chứa mã kiểm thử đơn vị (`StudentAnalyzerTest.java`)

## Hướng dẫn chạy kiểm thử

Yêu cầu máy tính đã cài đặt Java SDK 8+ và Maven. Truy cập thư mục gốc của repository và chạy lệnh:

```powershell
mvn test
```

## Kết quả

- Toàn bộ các test case vượt qua (SUCCESS).
- Mã nguồn được tối ưu và xử lý các trường hợp ngoại lệ (điểm < 0 hoặc > 10).
