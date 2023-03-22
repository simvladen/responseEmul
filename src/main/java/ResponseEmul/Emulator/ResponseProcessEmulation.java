package ResponseEmul.Emulator;

import ResponseEmul.models.ReceivingJson;
import ResponseEmul.models.ResponseJson;


public class ResponseProcessEmulation {
    public static ResponseJson EmulateResponse(ReceivingJson input){
        long balance = (long) (Math.random() * 100);
        return new ResponseJson(input.getUserName(), input.getSum()+ balance);
    }
}
