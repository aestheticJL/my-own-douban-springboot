package com.mmt.myowndoubanspringboot.controller.adminController;

import com.mmt.myowndoubanspringboot.model.Movie;
import com.mmt.myowndoubanspringboot.model.RespBean;
import com.mmt.myowndoubanspringboot.service.admin.AdminMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admin/movie")
public class AdminMovieController {
    @Autowired
    AdminMovieService adminMovieService;

    @PostMapping("/")
    public RespBean addMovieInf(@RequestBody Movie movie) {
        if (adminMovieService.addMovieInf(movie)) {
            return RespBean.ok("录入成功");
        } else {
            return RespBean.error("录入失败，请确认电影信息");
        }
    }

    @GetMapping("/")
    public List<Movie> getAllMovie() {
        return adminMovieService.getAllMovie();
    }

    @GetMapping("/{id}")
    public Movie getMovieById(@PathVariable Integer id) {
        return adminMovieService.getMovieById(id);
    }

    @DeleteMapping("/{id}")
    public RespBean deleteMovie(@PathVariable Integer id) {
        if (adminMovieService.deleteMovie(id)) {
            return RespBean.ok("删除成功");
        } else {
            return RespBean.error("删除失败");
        }
    }
}
