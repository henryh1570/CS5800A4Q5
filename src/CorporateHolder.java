public class CorporateHolder extends AccountHolder {

    private String contact;

    public CorporateHolder(int id, String address, String contact) {
        super(id, address);
        this.contact = contact;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
