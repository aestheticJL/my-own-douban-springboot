package com.mmt.myowndoubanspringboot.controller.adminController;

import com.mmt.myowndoubanspringboot.model.Movie;
import com.mmt.myowndoubanspringboot.service.admin.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin/movieMana")
public class MovieManagementController {
    @Autowired
    MovieService movieService;
    @GetMapping("/")
    public List<Movie> getAllMovie(){
        return movieService.getAllMovie();
    }
}
