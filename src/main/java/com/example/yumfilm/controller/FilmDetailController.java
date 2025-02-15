package com.example.yumfilm.controller;

import com.example.yumfilm.model.Film;
import com.example.yumfilm.responses.FilmResponse;
import com.example.yumfilm.service.FilmDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/filmDetail")
@CrossOrigin("*")
public class FilmDetailController {
    @Autowired
    FilmDetailService filmDetailService;



    @GetMapping("{filmID}")
    public ResponseEntity<FilmResponse> getFilmDetails(@PathVariable int filmID) {
        return ResponseEntity.ok(filmDetailService.findFilmDetailById(filmID));
    }

}
