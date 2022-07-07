package JavaOop;

public class Human {
    String name;
    int age;


    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void showInfo(){
        //Viết như này
        System.out.println(name + " và " + age);
        //Hoặc viết như dưới sử dụng hàm getter
//        System.out.println(getName() + " và " + getAge());
    }



    //-----------hw3
    public  void showAge(){
        System.out.println("Show age " + age);

    }

    public  void showName(){
        System.out.println("Show nane " + name);
    }



    //-----hw4
    public void showAgePlus(int a){
        age +=  a;
        System.out.println("Tuổi 1 = " + age);

    }


    public void showAgePlus(int a, int b){
        age = age + a + b;
        System.out.println("Tuổi 2 = " + age);

    }


    public void showAgePlus(int a, int b, int c){
        age = age + a + b + c;
        System.out.println("Tuổi 3 = " + age);

    }



}
