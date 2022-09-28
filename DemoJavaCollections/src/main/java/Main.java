import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        HASHMAP
        HashMap<String, String> hashMap1 = new HashMap<String, String>();
        hashMap1.put("hash", "hash");
        hashMap1.put("hash2", "hash2");
        hashMap1.put("hash3", "hash3");
        System.out.println(hashMap1.entrySet());

        for (Map.Entry<String, String> s : hashMap1.entrySet()
        ) {
            System.out.println(s);
        }

//        Map interface được định nghĩa gồm những method phục vụ những hoạt động cơ bản (như put, get, remove, containsKey, containsValue, size, empty),
//        phục vụ việc thao tác hàng loạt (như putAll, clear),
//        phục vụ việc xem dữ liệu trong tập (như keySet, entrySet, values)
    }
}
