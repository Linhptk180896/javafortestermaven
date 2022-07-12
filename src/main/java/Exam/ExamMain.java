package Exam;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExamMain {
    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream file = new FileInputStream("Data.xlxs");
        XSSFWorkbook wb = new XSSFWorkbook();



    }
}
