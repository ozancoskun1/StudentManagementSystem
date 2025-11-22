package StudentManagementSystem;

public class Student {

    // Öğrenciye ait alanlar (field'lar)
    private final int studentId;       
    private final String studentName;  
    private final String studentSurname; 
    private int point;                 

    // Yapıcı (constructor) metod
    public Student(int studentId, String studentName, String studentSurname, int point) {
        this.studentId = studentId;           // Parametreyi class içindeki alana atıyoruz
        this.studentName = studentName;
        this.studentSurname = studentSurname;
        this.point = point;
    }

    // Sadece getter'lar.immutable yaptık
    public int getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentSurname() {
        return studentSurname;
    }

    public int getPoint() {
        return point;
    }

    // Öğrencinin puanına ekleme yapan metot
    public void addPoint(int amount) {
        this.point += amount; // Mevcut puana amount kadar ekler
    }

    // Öğrenci bilgilerini ekrana yazdıran metot
    public void studentInfoShow() {
        System.out.println("Student ID     : " + studentId);
        System.out.println("Student Name   : " + studentName);
        System.out.println("Student Surname: " + studentSurname);
        System.out.println("Student Point  : " + point);
        System.out.println();
    }
}
