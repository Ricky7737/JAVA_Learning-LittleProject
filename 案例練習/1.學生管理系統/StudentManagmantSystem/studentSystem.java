package RealCase.StudentManagmantSystem;

import java.util.ArrayList;
import java.util.Scanner;

// 建立系統選單
public class studentSystem {
    public static void main(String[] args) {

        // 須提前創建學生 ArrayList，這個主要存放學生資料
        ArrayList<student> list = new ArrayList<>();

        // 建立 Scanner 物件
        Scanner scanner = new Scanner(System.in);
        // 第 一 部分 : 功能選單
        // 4.建立迴圈，一直進入功能選單
        // loop:while 的 loop: 代表這個迴圈，可以任意命名，但最好使用有意義的名稱
        loop:while (true) {
            // 歡迎資訊
            System.out.println("*----------Welcome to Student System!---------*");

            // 選擇功能
            System.out.println("功能選單 :");
            System.out.println("1.添加學生");
            System.out.println("2.刪除學生");
            System.out.println("3.修改學生");
            System.out.println("4.查詢學生");
            System.out.println("5.退出系統");
            System.out.println("請輸入選擇");
            

            // 1.製作選單，鍵盤輸入功能編號         
            // 2.接收使用者輸入
            String choice = scanner.next();
            
            // 3.製作功能選擇
            switch (choice) {
                // 透過輸入數字，載入下面的功能方法
                // 將 list 傳入，以便在各功能方法中操作 ArrayList
                // 功能 1 : 如果需要修改功能，請到 AddStudent.java 進行修改
                case "1" -> AddStudent.addStudent(list);    
                // 功能 2 : 如果需要修改功能，請到 DeleteStudent.java 進行修改
                case "2" -> DeletStudent.deleteStudent(list);
                // 功能 3 : 如果需要修改功能，請到 ModifyStudent.java 進行修改
                case "3" -> ModifyStudent.modifyStudentInfo(list);
                // 功能 4 : 如果需要修改功能，請到 SearchStudent.java 進行修改
                case "4" -> SearchStudent.queryStudent(list);
                // case = 5，跳出迴圈，結束系統
                case "5" -> {
                    // 5.退出系統
                    System.out.println("退出系統");
                    break loop;
                }                        
                default -> System.out.println("輸入錯誤，請重新輸入");    
            }
        }
    }    
}
