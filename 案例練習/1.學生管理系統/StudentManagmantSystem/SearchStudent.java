package RealCase.StudentManagmantSystem;

import java.util.ArrayList;

// SearchStudent 類別，負責查詢學生訊息
public class SearchStudent {
    
    // 定義 queryStudent 方法，用來查詢學生訊息
    // 傳入 ArrayList<student> list 參數，用來存放學生訊息
    public static void queryStudent(ArrayList<student> list) {

        // 1 如果沒有學生訊資訊，就先提示他們先建立學生訊息
        // .isEmty() 方法用來判斷 ArrayList 是否為空
        if (list.isEmpty()) {
            System.out.println("當前沒有學生訊息，麻煩添加");
            // 執行到 return 就不會繼續執行
            // 並且終止 queryStudent 這個方法
            return;        
        } 

        // 2 如果有學生訊息，就列出學生訊息
        System.out.println("id\t姓名\t性別\t生日");
        for (int i = 0; i < list.size(); i++) {
            // 取得學生訊息
            student stu = list.get(i);
            // 顯示學生訊息
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
        }        
    }
}
