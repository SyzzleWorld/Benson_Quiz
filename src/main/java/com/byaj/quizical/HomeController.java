package com.byaj.quizical;

@Controller
public class HomeController {
    @GetMapping("/movie")
    public String loadTvForm(Model model){
        model.addAttribute("movie", new Movie());
        return "movie";
    }

    @PostMapping("/movie")
    public String processTvForm(@Valid Movie Movie, BindingResult result){
        if (result.hasErrors()){
            return "movie";
        }
        return "movieconfirm";
    }
}
