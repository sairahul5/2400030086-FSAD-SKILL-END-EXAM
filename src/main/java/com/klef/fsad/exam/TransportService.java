package com.klef.fsad.exam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransportService {

    @Autowired
    private TransportRepository transportRepository;

    public Transport saveTransport(Transport transport) {
        return transportRepository.save(transport);
    }

    public void deleteTransport(Integer id) {
        transportRepository.deleteById(id);
    }
}
