package StudentManagementSystem;

public class School {

    private Student[] students; // Öğrencileri tutacağımız dizi
    private int index = 0;      // Şu ana kadar kaç öğrenci eklendiğini tutan sayaç

  
    public School(int capacity) {
        students = new Student[capacity];
    }

   
    public void addStudent(Student s) {
        
        if (index < students.length) {
            students[index] = s; 
            index++;            
            System.out.println("Student added to school.\n");
        } else {
           
            System.out.println("Capacity is full, cannot add more students.");
        }
    }

  
    public void showAllStudent() {
       
        if (index == 0) {
            System.out.println("There is no student yet.\n");
            return; 
        }

        System.out.println("----- All Students -----");
       
        for (int i = 0; i < index; i++) {
           
            students[i].studentInfoShow();
        }
    }

    // Yardımcı metot: ID'ye göre öğrenci bul
    // Sadece bu class içinde kullanacağımız için private
    private Student findStudentById(int id) {
        // Sadece eklenmiş öğrenciler arasında ara
        for (int i = 0; i < index; i++) {
            if (students[i].getStudentId() == id) { // ID'ler eşitse
                return students[i];                 // O öğrenciyi döndür
            }
        }
        return null; 
    }

 
    public void showStudentInfo(int id) {
        Student s = findStudentById(id); // Önce ID ile öğrenciyi bul
        if (s == null) {
            System.out.println("Student not found.\n");
        } else {
            s.studentInfoShow(); 
        }
    }

    // ID'si verilen öğrenciye puan ekle
    public void addPointToStudent(int id, int point) {
        Student s = findStudentById(id); // Öğrenciyi bul
        if (s == null) {
            System.out.println("Student not found.\n");
        } else {
            s.addPoint(point); // Öğrencinin puanına ekleme yap
            System.out.println("Point added. New student info:");
            s.studentInfoShow();
        }
    }
}
