/* 用來添加學生 */
package RealCase.StudentManagmantSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class AddStudent {
    public static void addStudent(ArrayList<student> list) {
        
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        
        // 輸入學生資訊，使用一個 while 迴圈輸入，直到不再需要輸入為止       
        loop: while (true) {
            // 每次輸入前，都先建立一個新物件
            student stu = new student();

            // 顯示 進入學生添加功能
            System.out.println("*--------------進入學生添加功能-------------*");

            // 透過這個迴圈，可以完成判斷 id 是否已經存在
            while (true) {
                System.out.println("輸入學生 id");
                String id = sc.next();

                // 判斷 id 是否已經存在
                // 如果存在，提示重新輸入
                // 調用 checkId 方法，判斷 id 是否已經存在
                if (checkId(list, id)) {
                    System.out.println("id 已經存在，請重新輸入");          
                } else {
                    // 若 id 不存在，則設定 id 並跳出迴圈
                    stu.setId(id);
                    break;
                }
            }
            
            // 輸入學生姓名、年齡、地址
            System.out.println("請輸入學生姓名");
            String name = sc.next();
            stu.setName(name);
        
            System.out.println("請輸入學生年齡");
            int age = sc.nextInt();
            stu.setAge(age);
        
            System.out.println("輸入學生家地址");
            String address = sc.next();
            stu.setAddress(address);
            
            // 將學生物件加入 ArrayList
            list.add(stu);
            System.out.println("添加成功");

            // 是否繼續添加學生資訊
            System.out.println("是否繼續添加學生資訊？(yes/no)");
            // 若輸入 yes，則回到 while 迴圈，繼續輸入學生資訊
            // 若輸入 no，則跳出 while 迴圈，結束輸入學生功能
            String choice = sc.next();
            if (choice.equals("yes")) {
                continue loop;
            } else {
                System.out.println("結束輸入學生功能");
                break loop;
            }
        }
    }

    // 這個方法用來判斷 id 是否已經存在
    // 若存在，則回傳 true，否則回傳 false
    private static boolean checkId(ArrayList<student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
}
