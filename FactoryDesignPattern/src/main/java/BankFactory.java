//FACTORY CLASS
public class BankFactory {
    private BankFactory() {
    }

    public static final Bank getBank(BankType type) {
        switch (type) {
            case TPBANK -> {
                return new TPbank();
            }
            case VIETCOMBANK -> {
                return new Vietcombank();
            }
            default -> {
                System.out.println("khong ton tai");
                throw new IllegalArgumentException("bank not found");
            }
        }
    }
}
