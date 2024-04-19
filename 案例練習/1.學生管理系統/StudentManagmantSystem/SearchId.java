/*尋找學生 id 在 刪除學生 id 與 修改 學生資料中都會用到
 * 所以將 searchID 方法定義在此類別中
 */
package RealCase.StudentManagmantSystem;

import java.util.ArrayList;

public class SearchId {
        // 建立一個私有的尋找 id 方法，僅提供給 deleteStudent 類別使用
        public static int searchID(ArrayList<student> list, String id){
            // 遍歷 ArrayList 找尋 id 相同的元素
            for(int i=0; i<list.size(); i++){
                if(list.get(i).getId().equals(id)){
                    return i;
                }
            }
            // 找不到 id 相同的元素
            return -1;
        }
}
