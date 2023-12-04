package com.example.GestionAppareil.Controller;

import com.example.GestionAppareil.Service.CategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Categorie")
public class CategorieController {
    @Autowired
    CategorieService categorieService;


}
