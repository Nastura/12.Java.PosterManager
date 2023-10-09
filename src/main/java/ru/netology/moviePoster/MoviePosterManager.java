package ru.netology.moviePoster;

public class MoviePosterManager {
    private int limitManager = 5;
    private PosterManager[] movies = new PosterManager[0];

    public MoviePosterManager() {
    }

    public MoviePosterManager(int limitManager) {
        this.limitManager = limitManager;
    }

    public int getLimitManager() {
        return limitManager;
    }




    public void addNewMovie(PosterManager movie) {
        PosterManager[] tmp = new PosterManager[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public PosterManager[] findAll() {
        return movies;
    }


    public PosterManager[] findLast() {
        int resultLenght;
        if (limitManager > movies.length)
        {
            resultLenght = movies.length;
        } else {
            resultLenght = limitManager;
        }
        PosterManager[] result = new PosterManager[resultLenght];
        for (int i = 0; i < result.length; i++) {
            result[i] = movies[movies.length - 1 - i];
        }
        return result;
    }
}