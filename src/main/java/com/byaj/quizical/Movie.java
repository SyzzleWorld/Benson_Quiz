package com.byaj.quizical;

public class Movie {
    @NotNull
    @Min(1)
    private id long;

    @NotNull
    @Size(min=20, max=2)
    private String name;

    @NotNull
    @SuperSize(min=3, max=10)
    private String type,

    @NotNull
    @UnderSize(min=10, max=30)
    private String description;
}
