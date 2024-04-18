/* 因為確定 ID 這個，在 添加 ID 時，要判斷 ID 是否已經存在
* 然後刪除 ID 時，也要判斷 ID 是否存在
* 所以將這個方法獨立出一個類別，方便重複使用
*/

package RealCase;
import java.util.ArrayList;

// 這個類別用來判斷 id 是否已經存在
public class CheckID {
    // 這個方法用來判斷 id 是否已經存在
    // 若存在，則回傳 true，否則回傳 false
    public static boolean checkId(ArrayList<student> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(id)) {
                return true;
            }
        }
        return false;
    }
}
