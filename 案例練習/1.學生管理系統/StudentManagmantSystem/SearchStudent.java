package RealCase;

import java.util.ArrayList;

public class SearchStudent {
    public static void queryStudent(ArrayList<student> list) {
        // 4.1 如果沒有學生訊資訊，就先提示他們先建立學生訊息
        if (list.isEmpty()) {
            System.out.println("當前沒有學生訊息，麻煩添加");
            // 跳出迴圈
            return;
        // 4.2 如果有學生訊息，就列出學生訊息
        } 
        System.out.println("id\t姓名\t性別\t生日");
        for (int i = 0; i < list.size(); i++) {
            // 取得學生訊息
            student stu = list.get(i);
            // 顯示學生訊息
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
        }        
    }
}
