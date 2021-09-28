public class Phone implements Messagable{
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Phone(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    private String phoneNumber;

    @Override
    public void sendMessage() {

    }
}
