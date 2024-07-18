package com.latte;

import com.latte.movie.Movie;
import com.latte.movie.MovieService;
import com.latte.notice.Notice;
import com.latte.notice.NoticeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class IndexController {

    private final MovieService movieService;
    private final NoticeService noticeService;

    @GetMapping("/index")
    public String Index(Model model) {
        List<Movie> movieList = movieService.getList();
        List<Notice> noticeList = noticeService.getList();
        model.addAttribute("movieList", movieList);
        model.addAttribute("noticeList", noticeList);
        return "index";
    }

    // 기본 페이지 설정
    @GetMapping("/")
    public String root() {
        return "redirect:/index";
    }
}
