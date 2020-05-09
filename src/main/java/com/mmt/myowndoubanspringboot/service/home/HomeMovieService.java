package com.mmt.myowndoubanspringboot.service.home;

import com.mmt.myowndoubanspringboot.mapper.CommentMapper;
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
    @Autowired
    CommentMapper commentMapper;
    public List<Movie> getMovieByType(String type) {
        if ("其他".equals(type)) {
            return movieMapper.getOtherMovie();
        } else {
            MovieExample movieExample = new MovieExample();
            movieExample.createCriteria().andCountriesLike("%" + type + "%");
            return movieMapper.selectByExample(movieExample);
        }
    }

    public Movie getMovieAllInfById(Integer id) {
        return movieMapper.getMovieAllInfById(id);
    }

    public List<Movie> getNewCommentMovie() {
        List<Integer> IDs = commentMapper.getNewCommentMovieId();
        return movieMapper.getMovieByIDs(IDs);
    }

    public List<Movie> getHighScoreMovie() {
        return movieMapper.getHighScoreMovie();
    }

    public List<Movie> getMyHighScoreMovie() {
        List<Integer> IDs = commentMapper.getMyHighScoreMovieId();
        return movieMapper.getMovieByIDs(IDs);
    }
}
