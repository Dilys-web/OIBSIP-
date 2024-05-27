public class User {
    private final int userId;
    private final int pin;

    public User(int userId, int pin) {
        this.userId = userId;
        this.pin = pin;
    }

    public int getUserId() {
        return userId;
    }

    public int getPin() {
        return pin;
    }
}
