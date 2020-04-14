package com.mmt.myowndoubanspringboot.controller.homeController;

import com.mmt.myowndoubanspringboot.model.Movie;
import com.mmt.myowndoubanspringboot.service.home.HomeMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/home/movie")
public class HomeMovieController {
    @Autowired
    HomeMovieService homeMovieService;
    @GetMapping("/{type}")
    public List<Movie> getMovieByType(@PathVariable String type){
        return homeMovieService.getMovieByType(type);
    }
    @GetMapping("/id/{id}")
    public Movie getMovieAllInfById(@PathVariable Integer id){
        return homeMovieService.getMovieAllInfById(id);
    }
}
