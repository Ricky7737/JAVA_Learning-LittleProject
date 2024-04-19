/*用來刪除指定的學生資訊 
 * 功能 1.透過 id 刪除學生，如果 id 不存在，則顯示錯誤訊息。 
 * 功能 2.刪除成功後，顯示刪除成功訊息。 
 * 功能 3.然後詢問是否繼續刪除其他學生資訊，如果是，則回到功能 1，否則結束程式，然後顯示完成學生刪除，並跳回主選單。 
*/
package RealCase.StudentManagmantSystem;

import java.util.ArrayList;
import java.util.Scanner;

public class DeletStudent {
    // 引入 ArrayList 來後續刪除學生資訊
    // String id 為要刪除的學生 id
    // ArrayList<student> studentList 為學生資訊的 ArrayList
    public static void deleteStudent(ArrayList<student> list) {

        // 1.建立一個鍵盤輸入
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        // 6. 建立一個 while 迴圈，用來判斷是否繼續刪除其他學生資訊

        while (true) {
            // 1.顯示刪除學生資訊的功能選單
            System.out.println("*-----------刪除學生資訊功能選單-----------*");
            // 2.判斷 id 是否存在於 studentList
            System.out.println("請輸入要刪除的 id");
            // 3.讀取 id 值
            String id = scanner.nextLine();

            /*4.使用預先寫好的 SearchId 類別，來尋找 id 是否存在於 studentList
            * 調用 下面 searchID 方法，如果 id 存在，則刪除該學生資訊
            * 否則顯示錯誤訊息
            * 因為如果 id 不存在，則 searchID 方法會回傳 -1，因此判斷 -1 來判斷 id 是否存在
            */
            if (SearchId.searchID(list, id) == -1) {
                System.out.println("此 id 不存在，請重新輸入");
            // 如果沒回傳 -1，表示 id 存在，因此刪除該學生資訊
            } else {
                // 刪除學生資訊
                list.remove(SearchId.searchID(list, id));
                System.out.println("刪除成功");
            }

            // 7.顯示是否繼續刪除其他學生資訊
            System.out.println("是否繼續刪除其他學生資訊？(y/n)");
            // 8.讀取 y/n 值
            String choice = scanner.nextLine();


            // 9.如果輸入 n，則結束程式，並顯示完成學生刪除，並跳回主選單
            if (choice.equals("n")) {
                System.out.println("完成學生刪除，並跳回主選單");
                break;
            }
        }
    }



}
