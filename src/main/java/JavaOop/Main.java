package JavaOop;

public class Main {
    public static void main(String[] args) {
        Human personInfo = new Human("Linh", 26);
        System.out.println(personInfo.getName());

        //hw01: viết hàm showInfo ở class human
        personInfo.showInfo();
        Student studentInfo = new Student("Phạm Khánh Linh", 26);
        studentInfo.setSchoolName("Uni of Transportation and Technology");


        //hw02: Dùng hàm showFullStudentInfo
        //Dùng getter
        System.out.println( "Full Student Information: " + studentInfo.getName() + studentInfo.getAge() + studentInfo.getSchoolName());
        //Dùng show info
        studentInfo.showFullStudentInfo();


        //hw03: gọi và dùng showName và showAge
        studentInfo.showName();
        studentInfo.showAge();


        //hw04:  học sinh 1 thì sử dụng hàm showAgePlus1, học sinh 2 thì sử dụng hàm showAgePlus2, học sinh 3 thì sử dụng hàm showAgePlus3
        Student student1 = new Student("HS1", 20);
        student1.showAgePlus(10);

        Student student2 = new Student("HS2", 20);
        student2.showAgePlus(20,30);

        Student student3 = new Student("HS3", 20);
        student3.showAgePlus(15,50,88);




    }


}
