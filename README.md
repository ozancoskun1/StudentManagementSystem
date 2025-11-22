# 🎓 Student Management System (Java)

Bu proje, Java ile geliştirilmiş basit bir **Öğrenci Yönetim Sistemi** uygulamasıdır. Konsol tabanlı çalışan bu sistem sayesinde:

- Öğrenci ekleme  
- Tüm öğrencileri listeleme  
- ID ile belirli bir öğrencinin bilgilerini görüntüleme  
- Öğrenciye puan ekleme  

işlemleri yapılabilir.

---

## 📁 Proje Yapısı

Proje üç sınıftan oluşur:

StudentManagementSystem/
│
├── StudentMain.java → Programın main metodu ve menü akışı
├── School.java → Öğrencilerin saklandığı ve yönetildiği sınıf
└── Student.java → Tek bir öğrenciyi temsil eden model sınıf
---

## 🧩 Sınıfların Görevleri

### 🟥 Student.java  
Bir öğrencinin verilerini tutar:

- `studentId`
- `studentName`
- `studentSurname`
- `point`

Fonksiyonları:
- `addPoint(int amount)` → Öğrencinin puanını artırır.
- `studentInfoShow()` → Öğrenci bilgilerini ekrana yazdırır.

---

### 🟦 School.java  
Bütün öğrencilerin tutulduğu ve yönetildiği sınıftır.

İçinde:
- `Student[] students` → Öğrenci dizisi
- `int index` → Şu ana kadar kaç öğrenci eklendiği

Fonksiyonları:
- `addStudent(Student s)` → Yeni öğrenci ekler  
- `showAllStudent()` → Tüm öğrencileri listeler  
- `showStudentInfo(int id)` → ID ile öğrenciyi bulur ve gösterir  
- `addPointToStudent(int id, int point)` → ID ile bulunan öğrenciye puan ekler  
- `findStudentById(int id)` → ID’ye göre öğrenci arar (private)

---

### 🟩 StudentMain.java  
Programın çalıştığı yerdir (main metodu).

Görevleri:
- Konsol menüsünü gösterir
- Kullanıcıdan seçim alır
- School içerisindeki ilgili metotları çağırır
- Kullanıcı çıkış yapana kadar menüyü döndürür

---

## 🔧 Programın İşleyişi

1. Program başlar.
2. `School ufukUniversity = new School(5);` ile okul oluşturulur.
3. Menü ekrana yazdırılır.
4. Kullanıcıdan seçim alınır.
5. Seçime göre işlem yapılır:
   - **1 → Add Student**  
   Kullanıcıdan id, isim, soyisim, puan alınır → yeni Student oluşturulur → School’a eklenir.
   - **2 → Show All Student**  
   Okuldaki tüm öğrenciler listelenir.
   - **3 → Show Student Info**  
   Kullanıcı ID girer → öğrenci bulunursa bilgileri yazılır.
   - **4 → Add point**  
   ID alınır → puan eklenir → güncel bilgi gösterilir.
   - **5 → Leave the menu**  
   Program sonlandırılır.

---

## 🧠 Örnek Konsol Çıktısı

Welcome to Student Management System

1- Add Student
2- Show All Student
3- Show Student Info
4- Add point
5- Leave this menu

Please select process: 1

Student ID : 101
Student Name : Ahmet
Student SurName : Yılmaz
Student Point : 50

Student added to school.
---

## 🚀 Kullanılan Teknolojiler

- Java  
- OOP – Object Oriented Programming  
- Console I/O (Scanner)  
- Array veri yapısı  

---

## 📄 Lisans

Bu proje eğitim amaçlı hazırlanmıştır. Dilediğiniz gibi kullanabilir, düzenleyebilir ve paylaşabilirsiniz.

---

## ✉️ İletişim

Her türlü soru veya öneri için benimle iletişime geçebilirsiniz.
mail 1ozancoskun@gmail.com
