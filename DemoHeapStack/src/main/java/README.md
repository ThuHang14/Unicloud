![image](https://user-images.githubusercontent.com/96046778/192674813-569746ea-22d5-48fc-9987-3b139899d466.png)
- Ngay khi chúng ta chạy chương trình, nó sẽ tải tất cả các lớp Runtime vào không gian Heap. Khi tìm thấy phương thức main () ở dòng 1, Java Runtime tạo bộ nhớ ngăn xếp được sử dụng bởi luồng phương thức main ().

- Chúng tôi đang tạo biến cục bộ nguyên thủy ở dòng 2, do đó, nó được tạo và lưu trữ trong bộ nhớ ngăn xếp của phương thức main ().

- Vì chúng ta đang tạo một Object ở dòng thứ 3, nên nó được tạo trong bộ nhớ heap và bộ nhớ stack chứa tham chiếu cho nó. Một quá trình tương tự xảy ra khi chúng ta tạo đối tượng Bộ nhớ trong dòng thứ 4.

- Bây giờ khi chúng ta gọi phương thức foo () trong dòng thứ 5, một khối ở đầu ngăn xếp được tạo để được sử dụng bởi phương thức foo (). Do Java là giá trị truyền qua, nên một tham chiếu mới đến Object được tạo trong khối ngăn xếp foo () trong dòng thứ 6.

- Một chuỗi được tạo trong dòng thứ 7, nó đi vào Chuỗi Pool trong không gian heap và một tham chiếu được tạo trong không gian ngăn xếp foo () cho nó.

- Phương thức foo () được kết thúc ở dòng thứ 8, tại thời điểm này, khối bộ nhớ được phân bổ cho foo () trong ngăn xếp trở nên miễn phí.

- Trong dòng 9, phương thức main () chấm dứt và bộ nhớ ngăn xếp được tạo cho phương thức main () bị hủy. Ngoài ra, chương trình kết thúc tại dòng này, do đó Java Runtime giải phóng tất cả bộ nhớ và kết thúc việc thực hiện chương trình.
