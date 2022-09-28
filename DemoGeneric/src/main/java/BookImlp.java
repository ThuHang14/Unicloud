public class BookImlp<T> implements Book<T>{
    @Override
    public void updateBook(T obj) {
        System.out.println("update " + obj );
    }

    @Override
    public void deleteBook(T obj) {
        System.out.println("delete " + obj);
    }
}
