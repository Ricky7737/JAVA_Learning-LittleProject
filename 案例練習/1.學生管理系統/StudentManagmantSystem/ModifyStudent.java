/*用來修改學生資訊 */
package RealCase.StudentManagmantSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class ModifyStudent {
    // 建立一個方法，用來修改學生資訊
    public static void modifyStudentInfo(ArrayList<student> list) {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        // 1.顯示進入修改學生資訊的畫面
        System.out.println("*-----------修改學生資訊功能選單-----------*");

        // 建立一個 while 迴圈，用來持續進行修改學生資訊的動作

        loop:while (true) {
            // 2.建立一個鍵盤輸入查找要刪除的學生
            System.out.println("請輸入要修改的學生ID:");
            String id = scanner.next();
            
            /* 3. 利用 StudentId class 的 studentID 來查找輸入的 studentID 是否存在 */
            if (SearchId.searchID(list, id) == -1) {
                System.out.println("要修改的 "+ id  +" 不存在，無法更改，請重新輸入");
            // 如果沒回傳 -1，表示 id 存在，請使用者輸入新的學生資訊
            } else {
                // 4. 顯示修改學生資訊的畫面
                System.out.println("*開始修改學生資訊*");
                System.out.println("請輸入要修改的學生姓名:");
                String name = scanner.next();
                System.out.println("請輸入要修改的學生年齡:");
                int age = scanner.nextInt();
                System.out.println("請輸入要修改的學生地址:");
                String address = scanner.next();

                // 然後將新的資訊寫入對應的 id

                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getId().equals(id)) {
                        list.get(i).setName(name);
                        list.get(i).setAge(age);
                        list.get(i).setAddress(address);
                    }
                }
            }

            // 詢問是否繼續修改
            System.out.println("是否繼續修改學生資訊? (Y/N)");

            String choice = scanner.next();

            if (choice.equalsIgnoreCase("Y")) {
                continue loop;
            } else {
                break loop;
            }
        }
    }
}
