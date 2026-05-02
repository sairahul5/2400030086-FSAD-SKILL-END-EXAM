package com.klef.fsad.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transports")
public class TransportController {

    @Autowired
    private TransportService transportService;

    @PostMapping
    public Transport createTransport(@RequestBody Transport transport) {
        return transportService.saveTransport(transport);
    }

    @DeleteMapping("/{id}")
    public void deleteTransport(@PathVariable Integer id) {
        transportService.deleteTransport(id);
    }
}
