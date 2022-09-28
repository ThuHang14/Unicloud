import java.io.IOException;

public class TestTryCatch {
    public static void main(String[] args) {
        int a = 0;
//        THROW
        if (a <= 0) throw new RuntimeException("nho hon khong ");
        else System.out.println("a lon hon khong ");

//        TROWS
        M  m = new M();
        try {
            m.method();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        TRY_CATCH
        try {
            System.out.println(3 / a);
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("end");
        }

        System.out.println(222);
    }

   static class M {
        void method() throws IOException {
            throw new IOException("Loi thiet bi");
        }
    }
}
