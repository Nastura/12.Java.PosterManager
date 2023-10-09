package ru.netology.moviePosters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.moviePoster.MoviePosterManager;
import ru.netology.moviePoster.PosterManager;

class PosterManagerTest {

    MoviePosterManager manager = new MoviePosterManager();
    MoviePosterManager manager2 = new MoviePosterManager(3);

    PosterManager movie1 = new PosterManager(1, "Бладшот", "боевик");
    PosterManager movie2 = new PosterManager(2, "Вперёд", "мультфильм");
    PosterManager movie3 = new PosterManager(3, "Отель \"Белград\"", "комедия");
    PosterManager movie4 = new PosterManager(4, "Джентельмены", "боевик");
    PosterManager movie5 = new PosterManager(5, "Человек-невидимка", "ужасы");
    PosterManager movie6 = new PosterManager(6, "Тролли. Мировой тур", "мультфильм");
    PosterManager movie7 = new PosterManager(7, "Номер один", "комедия");

    @BeforeEach
    public void setup() {
        manager.addNewMovie(movie1);
        manager.addNewMovie(movie2);
        manager.addNewMovie(movie3);
        manager.addNewMovie(movie4);
        manager.addNewMovie(movie5);
        manager.addNewMovie(movie6);
        manager.addNewMovie(movie7);
    }

    @Test
    public void testLimitManager() {

        Assertions.assertEquals(5, manager.getLimitManager());
    }

    @Test
    public void testLimitManagerIf3() {

        manager2.addNewMovie(movie1);
        manager2.addNewMovie(movie2);
        manager2.addNewMovie(movie3);

        Assertions.assertEquals(3, manager2.getLimitManager());
    }

    @Test
    public void addNewMovie() {

        PosterManager[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7};
        PosterManager[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast() {

        PosterManager[] expected = {movie7, movie6, movie5, movie4, movie3};
        PosterManager[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastIfMoviesLessManager() {

        manager2.addNewMovie(movie1);
        manager2.addNewMovie(movie2);

        PosterManager[] expected = {movie2, movie1};
        PosterManager[] actual = manager2.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastIfMoviesEqualsManager() {

        manager2.addNewMovie(movie1);
        manager2.addNewMovie(movie2);
        manager2.addNewMovie(movie3);

        PosterManager[] expected = {movie3, movie2, movie1};
        PosterManager[] actual = manager2.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}