package com.mmt.myowndoubanspringboot.service.home;

import com.mmt.myowndoubanspringboot.mapper.MovieMapper;
import com.mmt.myowndoubanspringboot.model.Movie;
import com.mmt.myowndoubanspringboot.model.MovieExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeMovieService {
    @Autowired
    MovieMapper movieMapper;
    public List<Movie> getMovieByType(String type) {
        MovieExample movieExample = new MovieExample();
        movieExample.createCriteria().andCountriesLike("%" + type + "%");
        return movieMapper.selectByExample(movieExample);
    }

    public Movie getMovieAllInfById(Integer id) {
        return movieMapper.getMovieAllInfById(id);
    }
}
