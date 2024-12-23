package com.latte.movie;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("/movie")
@RequiredArgsConstructor
@Controller
public class MovieController {

    private final MovieService movieService;

    @GetMapping("/list")
    public String list(Model model) {
        List<Movie> list = movieService.getList();
        model.addAttribute("movieList", list);
        return "movie/movie_list";
    }
}
