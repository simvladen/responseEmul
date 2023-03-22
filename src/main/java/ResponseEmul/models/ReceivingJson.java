package ResponseEmul.models;

public class ReceivingJson {
    private String operationName;
    private String userName;
    private Long sum;

    public ReceivingJson(String opName, String user, Long opSum){
        operationName = opName;
        userName = user;
        sum = opSum;
    }

    public String getOpName() {
        return operationName;
    }
    public void setOpName(String name) {
        operationName = name;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String name) {
        userName = name;
    }

    public Long getSum() {
        return sum;
    }
    public void setSum(Long number) {
        sum = number;
    }

}
