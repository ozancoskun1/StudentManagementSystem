package StudentManagementSystem;

import java.util.Scanner;

public class StudentMain {

    public static void main(String[] args) {

        
        Scanner scan = new Scanner(System.in);

        // 5 kapasiteli bir School oluşturma
        //öğrenciler burada tutulacak
        School ufukUniversity = new School(5);

        int secim; 

        
        do {
            menuShow();
            System.out.println();
            System.out.print("Please select process 1 - 5  ");
            secim = scan.nextInt();

         
            if (secim == 1) {
                
                System.out.println("Student ID : ");
                int id = scan.nextInt(); // Öğrenci ID
                System.out.println("Student Name : ");
                String name = scan.next(); // Öğrenci adı
                System.out.println("Student SurName : ");
                String surname = scan.next(); // Öğrenci soyadı
                System.out.println("Student Point : ");
                int point = scan.nextInt(); // Öğrenci puanı

                // kullanıcı seçimine göre student oluşturoyurz
                Student s1 = new Student(id, name, surname, point);

                // nesneyi okulumuza ekliyoruz
                ufukUniversity.addStudent(s1);

            } else if (secim == 2) {
 
                ufukUniversity.showAllStudent();//okul sınıfında metot oluşturmuştuk onu çağırıyoruz

            } else if (secim == 3) {
        
                System.out.print("Enter Student ID to show info: ");
                int id = scan.nextInt();
                ufukUniversity.showStudentInfo(id);

            } else if (secim == 4) {
           
                System.out.print("Enter Student ID to add point: ");
                int id = scan.nextInt();
                System.out.print("How many points you want to add: ");
                int extraPoint = scan.nextInt();
                ufukUniversity.addPointToStudent(id, extraPoint);

            } else if (secim == 5) {
            
                System.out.println("Exiting from Student Management System...");
            } else {
                // yanlış seçim bildirimi veriyoruz
                System.out.println("Wrong choice, please try again!");
            }

        } while (secim != 5); 

        
        scan.close();
    }

    
    public static void menuShow() {
        System.out.println("Welcome to Student Management System");
        System.out.println("");
        System.out.println("1- Add Student");
        System.out.println("2- Show All Student");
        System.out.println("3- Show Student Info");
        System.out.println("4- Add point");
        System.out.println("5- Leave this menu");
    }
}
