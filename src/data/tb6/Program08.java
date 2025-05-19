package data.tb6;
//Ví dụ sử dụng Parameter
public class Program08 {
    public static void main(String[] args) {
        Student student = new Student();
        student.showFullName1("Ngoc");

        student.showInfo(15, "Ha Noi", "Viet Nam");

        student.showInfo(58, "Tokyo", "Japan");

        student.showDetail("Jake", "Paul");

        student.showFullName2("Bui", "Thanh");

    }
}
