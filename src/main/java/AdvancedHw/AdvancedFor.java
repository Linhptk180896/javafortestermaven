package AdvancedHw;

import java.util.*;

public class AdvancedFor {


    public static void main(String[] args) {
//        hw2(); //trả lãi sau 5 năm
//        hw1(); //số cách trả tiền : CHƯA LÀM XONG
//        hw3(); //thêm sửa xóa phần tử trong mảng
//        hw4(); //In ra phần tử thứ n của dãy fibonaci
//        hw5(); // In ra tên thành viên có 4 chữ, edit tên đệm
//        hw6(); //Xâu chuỗi s1 s2, bỏ ký tự số và kiểm tra đẳo ngược
hw7();
//        getRandomLetter(); // Hàm get random String
    }

    private static void hw1() {
        int a = 1; // 500k amount
        int b = 0; //200k amount
        int c = 0; // 100k amount
        int d = 0; //50k amount
        int totalAmount = 500000 * a + 200000 * b + 100000 * c + 50000 * d;
        int borrowingMoney = 2000000;
        //Số cách lấy tiền có chứa tờ 500k
        a = borrowingMoney / 500000;
        System.out.println(a);


    }

// ví dụ cần rút 80k thì lấy 80/50 (Lấy ra số tờ 50k vì 50k có mệnh giá lớn nhất và nhỏ hơn số tiền cần rút)
    //80/50 =1 dư 30
    // lấy 30/20 = 1 dư 10 ( lấy ra só tờ 20k vì 20k có mệnh giá < 30
    // lấy 10/10 = 1 dư 0
    // dư 0 nghĩa là lấy ra đc 1 tờ 50 -20 -10


    private static void hw2() {

        double firstBorrowingMoney = 600000000.0; //số tiền vay = 600tr

        double monthlyMoney = 10000000.0;  //  gốc phải trả hàng tháng 10tr

        double monthlyInterestRate = 0.06; //Lãi suất 1 năm

        double nextBorrowingMoney = firstBorrowingMoney;

        int year = 5;

        int month = 12;

        double needToPayMoney = 0.0; //Khởi tạo số tiền cần phải trả lần đầu tiên
        //Số tiền phải trả trong 5 năm
        for (int i = 0; i < (year * month); i++) {
            double monthlyInterestMoney = (nextBorrowingMoney * monthlyInterestRate) / 12; //Số tiền lãi hàng tháng:  0.06*600/12

            needToPayMoney = needToPayMoney + monthlyMoney + monthlyInterestMoney; //Số tiền gốc + lãi  phải trả hàng tháng
            nextBorrowingMoney -= monthlyMoney;
        }
        System.out.println("Số tiền phải trả sau 5 năm: " + (long) needToPayMoney);

    }

    private static void hw3() {
        Scanner scan = new Scanner(System.in);
        //Thêm phần từ vào mảng
        List<Integer> listNumbers = new ArrayList<Integer>();
        for (int i = 0; i < 4; i++) {
            System.out.println("Nhập phần tử thứ " + (i + 1));
            int number = scan.nextInt();
            listNumbers.add(number);
        }
        System.out.println("Các phần tử trong mảng là: " + listNumbers);
        //Xóa  phần tử trong mảng
        System.out.println("Cần xóa phần tử thứ:  ");
        int deleteIndex = scan.nextInt();
        if (deleteIndex > listNumbers.size()) {
            System.out.println("Invalid index");
        } else {
            listNumbers.remove(deleteIndex - 1);
            System.out.println("Các phần tử còn lại trong mảng sau khi xóa phần tử thứ " + (deleteIndex) + " là: " + listNumbers);

        }
        //Sửa phần tử trong mảng
        System.out.println("Cần sửa phần tử thứ:  ");
        int editIndex = scan.nextInt();
        if (editIndex > listNumbers.size()) {
            System.out.println("Invalid index");
        } else {
            listNumbers.remove(editIndex - 1);
            System.out.println("Sửa thành giá trị:  ");
            int newIndex = scan.nextInt();
            listNumbers.add(newIndex);
            System.out.println("Các phần tử  trong mảng sau khi thêm phần tử thứ " + (deleteIndex - 1) + " là: " + listNumbers);

        }

    }


    private static void hw4() {
        // số Fibonacci thứ n được tính theo công thức sau
        //- nếu n = 1 hoặc n = 2 thì F(n) = 1
        //- nếu n>2 thì F(n) = F(n-1) + F(n-2)
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] fibonaci = new int[n + 1];
        fibonaci[0] = 0;
        fibonaci[1] = 1;
        if (n == 0) {
            System.out.println("Phần tử thứ " + n + " là: " + n);
        } else if (n == 1) {
            System.out.println("Phần tử thứ " + n + " là: " + n);
        } else if (n < 0) {
            System.out.println("invalid");
        } else {
            for (int i = 2; i <= n; i++) {

                fibonaci[i] = fibonaci[i - 1] + fibonaci[i - 2];
            }

            System.out.println(fibonaci[n]);
        }
    }



    private static void hw5() {
        Scanner scan = new Scanner(System.in);
        String[] digitalNames = {"Cù Huy Thắng", "Lê Phương Thảo","Phùng Khắc Toàn", "Phạm Thị Khánh Linh","Đỗ Công Tuấn Anh", "Vương Anh"};
        //In ra tên thành viên có 4 chữ
        for (int i = 0; i <digitalNames.length ; i++) {
            String nameSplit[] = digitalNames[i].split(" ");
            int length = nameSplit.length;
            if (length == 4){
                System.out.println("Tên thành viên có 4 chữ là: " + digitalNames[i]);
                nameSplit[1] = getRandomLetter();
                nameSplit[2] = getRandomLetter();
                digitalNames[i] = nameSplit[0] + " "+  nameSplit[1] + " " + nameSplit[2] + " " + nameSplit[3];
                System.out.println("Tên sau khi thay thế: " + digitalNames[i] );
            }
            else if (length ==3){

                    nameSplit[1] = getRandomLetter();
                    digitalNames[i] = nameSplit[0] + " "+  nameSplit[1] + " " + nameSplit[2];
                    System.out.println("Tên sau khi thay thế: " + digitalNames[i] );



            }
            else if (length ==2){
                System.out.println(digitalNames[i] + " has no middle name!");
            }
            }

        }

    //Hàm random letter
    private static String getRandomLetter(){
        String characters = "ABCDEFGHIKLMNOPQRSTVXYZ";
        Random rand = new Random();
        String randomString = "";
        char[] randomText =  new char[3];
        for (int i = 0; i <randomText.length ; i++) {
            randomText[i] = characters.charAt(rand.nextInt(characters.length()));
        }

        for (int i = 0; i <randomText.length ; i++) {
            randomString += randomText[i];

        }

        return randomString;


    }

    private static void hw6() {
        String s1 = "chuỗi ký tự thứ 1";
        String s2 = "chuỗi  ký tự thứ 2";
        //Nối chuỗi 1 vào chuỗi 2
        String joinString = s1.concat(s2);
        System.out.println("Nối chuỗi 1 vào chuối 2 được chuỗi sau: " + joinString);

        //Bỏ số trong chuỗi
        String[] splitJoinString = joinString.split("");

        ArrayList<String> listSplitJoinString = new ArrayList<String>();
        for (int y = 0; y < splitJoinString.length; y++) {
                listSplitJoinString.add(splitJoinString[y]);

                for (int j = 0; j < listSplitJoinString.size(); j++) {
                    String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
                    for (int k = 0; k < numbers.length; k++) {
                        if (splitJoinString[y].equals(numbers[k])) {
                            listSplitJoinString.remove(splitJoinString[y]);
                        }
                    }

                }

            }
        System.out.println("Chuỗi sau khi bỏ số là: " + String.join("",listSplitJoinString));

        //Reverse String
        String s3 = "OK";
        String s4 = "KO";

        //Check chuỗi đảo ngược
        StringBuilder sbThirdString = new StringBuilder(s3);
        sbThirdString.reverse();
        String reversedThird = sbThirdString.toString();
        System.out.println("Reversed String 3 " + reversedThird);
        StringBuilder sbFourthString = new StringBuilder(s4);
        sbFourthString.reverse();
        String reversedFourth = sbFourthString.toString();
        System.out.println("Reversed String 4 " + reversedFourth);
        if (reversedFourth.equals(s3) || reversedThird.equals(s4)){
            System.out.println("2 chuỗi là đảo ngược của nhau");

        }

        else{
            System.out.println("2 chuỗi không là đảo ngược của nhau");

        }


//        for (int y = 0; y < joinString.length(); y++) {
//            char cNumberInJoinString = joinString.charAt(y);
//            String numberInJoinString = Character.toString(cNumberInJoinString);
//                    String[] numbers = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
//                for (int k = 0; k < numbers.length; k++) {
//                    if (numberInJoinString.equals(numbers[k])) {
//                        numberInJoinString = "";
//                    }
//                }
//            System.out.println("numberInJoinString" + );
//
//
//            }



 }


    private static void hw7() {
        String text = "I miss your tan skin, your sweet smile So good to me, so right And how you held me in your arms that September night The first time you ever saw me cry";

        String vowelSoundFrequency  = "";
        String [] splitText = text.split("");
        List<String> vowelSoundInText = new ArrayList<String>();
        System.out.println("splitText = " + Arrays.toString(splitText));
        for (int i = 0; i <splitText.length ; i++) {
            String[] vowelSounds = {"a","o","i","u","e","A","O","I","U","E"};
            for (int j = 0; j <vowelSounds.length ; j++) {
                if (splitText[i].equals(vowelSounds[j])){
                    vowelSoundInText.add(vowelSounds[j]);
                }
            }
        }
        // Count số nguyên âm xuất hiện trong chuỗi
        System.out.println("vowelSoundFrequency = " + vowelSoundInText);
        String[] vowelSounds = {"a","o","i","u","e","A","O","I","U","E"};
        for (int i = 0; i <vowelSounds.length ; i++) {
            int sum = 0;
            for (int j = 0; j <vowelSoundInText.size() ; j++) {
                if (vowelSoundInText.get(j).equals(vowelSounds[i])){
                    sum = sum +1;
                }

            }
            System.out.println(vowelSounds[i] + ": " + sum);

        }

        //Xóa ký tự giống nhau
        String duplicateText = "banana coconut bee test";
        String[] splitDuplicate = duplicateText.split("");
        int index = 0; //index của chuỗi đã bỏ duplicate
        System.out.println("splitDuplicate" + Arrays.toString(splitDuplicate));
        for (int i = 0; i < splitDuplicate.length; i++) {
            //Check xem trước đó text này đã tồn tại chưa
            for (int j = 0; j <i ; j++) {
                if (splitDuplicate[i] == splitDuplicate[j]){
                    break;
                    //Nếu có tồn tại, thoát khỏi  vòng lặp
                }

            if (j==i){


                splitDuplicate[index++] = splitDuplicate[i];
            }

            }
            System.out.println(splitDuplicate[index++]);


        }

    }
}



