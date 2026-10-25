package com.example.myapplication

// 1. DATA CLASS: Tạo lớp dữ liệu trong 1 dòng (Tự động tạo getter/setter/toString)
data class Student(val name: String, var score: Double)

fun main() {
    // 2. BIẾN: val = hằng số (không đổi), var = biến (thay đổi)
    val name = "An"          // Tự nhận kiểu String
    var age = 20             // Tự nhận kiểu Int
    age += 1                 // Hợp lệ (var đổi được)

    // 3. STRING TEMPLATE: Ghép biến vào chuỗi bằng $
    println("Tên: $name, Tuổi: $age, Năm sau: ${age + 1}")

    // 4. IF / WHEN: Trực quan và có thể trả về giá trị
    val status = if (checkAdult(age)) "Trưởng thành" else "Trẻ em"
    println("Trạng thái: $status")

    val day = (1..7).random()
    when (day) {
        1 -> println("Hôm nay là Chủ Nhật")
        in 2..6 -> println("Hôm nay là ngày trong tuần (Thứ $day)")
        else -> println("Hôm nay là Thứ Bảy")
    }

    // 5. VÒNG LẬP & LIST
    val list = mutableListOf("Táo", "Cam")
    list.add("Chuối")
    print("Danh sách: ")
    for (item in list) {
        print("$item ")
    }
    println()

    // 6. NULL SAFETY: ? cho phép null, ?: gán giá trị mặc định nếu null (chống crash)
    val text: String? = null
    println("Độ dài chuỗi: ${text?.length ?: 0}") // In ra 0 thay vì crash app

    // 7. TẠO ĐỐI TƯỢNG (Không cần 'new') & GỌI HÀM
    val student = Student("Bình", 8.5)
    println("Học sinh: $student")
    println("Tổng 5 + 10 = ${add(5, 10)}")
}

// 8. HÀM: Viết rút gọn trên 1 dòng
fun checkAdult(age: Int): Boolean = age >= 18
fun add(a: Int, b: Int): Int = a + b
