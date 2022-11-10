import java.util.concurrent.ThreadLocalRandom;

public abstract class AccountHolder {
    protected int id;
    protected String address;

    public AccountHolder(int id, String address) {
        this.id = id;
        this.address = address;
    }

    public int getNextID() {
        return ThreadLocalRandom.current().nextInt(999999) + 1;
    }
}
