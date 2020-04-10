package com.mmt.myowndoubanspringboot.service.admin;

import com.mmt.myowndoubanspringboot.mapper.*;
import com.mmt.myowndoubanspringboot.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    MovieMapper movieMapper;
    @Autowired
    DirectorMapper directorMapper;
    @Autowired
    WriterMapper writerMapper;
    @Autowired
    ActorMapper actorMapper;
    @Autowired
    MovieDirectorMapper movieDirectorMapper;
    @Autowired
    MovieWriterMapper movieWriterMapper;
    @Autowired
    MovieCastMapper movieCastMapper;

    @Transactional
    public boolean addMovieInf(Movie movie) {
        movieMapper.insertSelective(movie);
        List<Director> directors = movie.getDirectors();
        List<Writer> writers = movie.getWriters();
        List<Actor> actors = movie.getActors();
        directorMapper.addDirectors(directors);
        writerMapper.addWriters(writers);
        actorMapper.addCasts(actors);
        Integer mid = movie.getId();
        movieDirectorMapper.addMD(mid, directors);
        movieWriterMapper.addMW(mid, writers);
        movieCastMapper.addMA(mid, actors);
        return true;
    }

    public List<Movie> getAllMovie() {
        return movieMapper.selectByExample(new MovieExample());
    }
}
