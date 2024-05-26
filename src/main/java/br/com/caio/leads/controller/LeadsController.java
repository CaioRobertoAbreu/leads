package br.com.caio.leads.controller;

import br.com.caio.leads.dto.LeadRequest;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/leads")
public class LeadsController {

    @PostMapping("/send")
    public ResponseEntity<?> send(@RequestHeader(name = "lead-correlation-id") String correlationId,
                                  @RequestBody @Valid LeadRequest leadRequest){

        return ResponseEntity.noContent().build();
    }

    @GetMapping("/up")
    private ResponseEntity<String> up(){

        return ResponseEntity.ok("UP!");
    }
}
