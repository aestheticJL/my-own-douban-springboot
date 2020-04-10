package com.mmt.myowndoubanspringboot.controller.adminController;

import com.mmt.myowndoubanspringboot.model.Movie;
import com.mmt.myowndoubanspringboot.model.RespBean;
import com.mmt.myowndoubanspringboot.service.admin.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/addMovie")
public class AdminMovieController {
    @Autowired
    MovieService movieService;
    @PostMapping("/")
    public RespBean addMovieInf(@RequestBody Movie movie){
        if (movieService.addMovieInf(movie)){
            return RespBean.ok("录入成功");
        }else {
            return RespBean.error("录入失败，请确认电影信息");
        }
    }
}
