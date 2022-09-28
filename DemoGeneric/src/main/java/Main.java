import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {

//        Tạo class Generic với kiểu tham số generic
        Color<String, String> color = new Color<>("1", "#fff");
        Color<Integer, Boolean> color2 = new Color<>(2, true);

//        Thừa kế lớp Generics
        ColorBook colorBook = new ColorBook("#ccc", 3);

//        truyền Kiểu generic mới vào
        ColorBook colorBook2 = new ColorBook("#ccc", 3, true);

//            Generics Interface
        BookImlp<String> bookImlp = new BookImlp<>();
        bookImlp.deleteBook("33");

        BookImlp<Integer> bookImlp2 = new BookImlp<>();
        bookImlp2.deleteBook(2);

//        wildcard
        Collection<?> collection = new ArrayList<>();

    }


}
