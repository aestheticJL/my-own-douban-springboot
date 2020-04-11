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
    MovieActorMapper movieActorMapper;

    @Transactional
    public boolean addMovieInf(Movie movie) {
        movieMapper.insertSelective(movie);
        List<Director> directors = movie.getDirectors();
        List<Writer> writers = movie.getWriters();
        List<Actor> actors = movie.getActors();
        directorMapper.addDirectors(directors);
        writerMapper.addWriters(writers);
        actorMapper.addActors(actors);
        Integer mid = movie.getId();
        movieDirectorMapper.addMD(mid, directors);
        movieWriterMapper.addMW(mid, writers);
        movieActorMapper.addMA(mid, actors);
        return true;
    }

    public List<Movie> getAllMovie() {
        return movieMapper.selectByExample(new MovieExample());
    }

    public Movie getMovieById(Integer id) {
        return movieMapper.selectByPrimaryKey(id);
    }

    public boolean deleteMovie(Integer id) {
        MovieActorExample movieActorExample = new MovieActorExample();
        movieActorExample.createCriteria().andMidEqualTo(id);
        movieActorMapper.deleteByExample(movieActorExample);
        MovieWriterExample movieWriterExample = new MovieWriterExample();
        movieWriterExample.createCriteria().andMidEqualTo(id);
        movieWriterMapper.deleteByExample(movieWriterExample);
        MovieDirectorExample movieDirectorExample = new MovieDirectorExample();
        movieDirectorExample.createCriteria().andMidEqualTo(id);
        movieDirectorMapper.deleteByExample(movieDirectorExample);
        movieMapper.deleteByPrimaryKey(id);
        return true;
    }
}
