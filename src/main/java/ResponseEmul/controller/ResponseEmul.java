package ResponseEmul.controller;

import ResponseEmul.Emulator.ResponseProcessEmulation;
import ResponseEmul.models.ReceivingJson;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/responseEmul")
public class ResponseEmul {
    @GetMapping()
    public String ok() {
        return "Ok!";
    }

    @PostMapping(consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> emulate(@RequestBody ReceivingJson input){
        return ResponseEntity.ok(ResponseProcessEmulation.EmulateResponse(input));
    }
}
