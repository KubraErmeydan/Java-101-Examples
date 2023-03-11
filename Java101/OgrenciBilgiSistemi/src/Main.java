public class Main {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Fatih Hoca","5553336699","TRH");
        Teacher t2 = new Teacher("Melek hoca ","5554447788","FZK");
        Teacher t3 = new Teacher("Ramazan hoca ","5554447788","BIO");

        Course tarih = new Course("Tarih","101","TRH");
        tarih.addTeacher(t1);
        Course fizik = new Course("Fizik","102","FZK");
        fizik.addTeacher(t2);
        Course biyo = new Course("Biyoloji","103","BIO");
        biyo.addTeacher(t3);

        Student s1 =new Student("Şaban","123", "4",tarih,fizik,biyo);
        s1.addBulkExamNote(100,65,50);
        s1.isPass();
    }
}