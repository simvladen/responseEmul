package ResponseEmul.models;

public class ResponseJson {
    private String userName;
    private Long balance;

    public ResponseJson(){
    }
    public ResponseJson(String user, Long newBalance){
        setUserName(user);
        setBalance(newBalance);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getBalance() {
        return balance;
    }

    public void setBalance(Long balance) {
        this.balance = balance;
    }
}
