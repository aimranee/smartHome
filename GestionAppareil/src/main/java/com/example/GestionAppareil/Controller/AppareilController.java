package com.example.GestionAppareil.Controller;

import com.example.GestionAppareil.Entities.Appareil;
import com.example.GestionAppareil.Service.AppareilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Appareil")
public class AppareilController {

    @Autowired
    private AppareilService appareilService;

    public List<Appareil> findAll() {
        return appareilService.findAll();
    }

    public long save(Appareil appareil) {
        return appareilService.save(appareil);
    }

    public Optional<Appareil> findById(Long aLong) {
        return appareilService.findById(aLong);
    }

    public void deleteById(Long aLong) {
        appareilService.deleteById(aLong);
    }

    public void deleteAll() {
        appareilService.deleteAll();
    }
}
