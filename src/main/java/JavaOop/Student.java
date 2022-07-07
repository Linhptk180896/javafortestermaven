package JavaOop;

public class Student extends Human {
    //Phải khai báo private vì tính đóng gói
     private String schoolName;
    // Khi class student extends class human thì phải tạo constructor của class student
    public Student(String name, int age) {
        super(name, age);
    }

    //Tạo phương thức getter/setter

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }
    // Tạo phương thức get full thông tin học sinh, mới chỉ return thông tin
    public  String getFullStudentInfo(){
        return "Full Student Information: " + name +" : " + age + " years old " + " and graduated from the " + schoolName ;

    }
    // Tạo phương thức in ra full thông tin học sinh
    public  void showFullStudentInfo(){
        System.out.println(this.getFullStudentInfo());
    }

    @Override  //dùng để phân biệt hàm này đã tồn tại ở class cha (human).Nếu viết 1 hàm showName ở đây cũng đc
    public void showName() {
//        super.showName();  // --> Gọi hàm showName của class cha = human.showName()
        System.out.println("Show name " + name + " School: "+ this.schoolName);

    }


}
