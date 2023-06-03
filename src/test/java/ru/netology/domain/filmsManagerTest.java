package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class filmsManagerTest {
    @Test
    public void shouldShowAllFilm() {
        filmsManager filmsManager = new filmsManager();
        filmsManager.addNewFilm("film_1");
        filmsManager.addNewFilm("film_2");
        filmsManager.addNewFilm("film_3");
        filmsManager.addNewFilm("film_4");
        filmsManager.addNewFilm("film_5");
        filmsManager.addNewFilm("film_6");
        filmsManager.addNewFilm("film_7");
        String[] expected = {"film_1", "film_2", "film_3", "film_4", "film_5", "film_6", "film_7"};
        String[] actual = filmsManager.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowAllLastAddFilms() {
        filmsManager filmsManager = new filmsManager();
        filmsManager.addNewFilm("film_1");
        filmsManager.addNewFilm("film_2");
        filmsManager.addNewFilm("film_3");
        filmsManager.addNewFilm("film_4");
        filmsManager.addNewFilm("film_5");
        filmsManager.addNewFilm("film_6");
        filmsManager.addNewFilm("film_7");
        String[] expected = {"film_7", "film_6", "film_5", "film_4", "film_3"};
        String[] actual = filmsManager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastFilmsLimit() {
        filmsManager filmsManager = new filmsManager(5);
        filmsManager.addNewFilm("film_1");
        filmsManager.addNewFilm("film_2");
        filmsManager.addNewFilm("film_3");
        filmsManager.addNewFilm("film_4");
        filmsManager.addNewFilm("film_5");
        filmsManager.addNewFilm("film_6");
        filmsManager.addNewFilm("film_7");
        String[] expected = {"film_7", "film_6", "film_5", "film_4", "film_3"};
        String[] actual = filmsManager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowLastFilmsLessLimit() {
        filmsManager filmsManager = new filmsManager(5);

        filmsManager.addNewFilm("film_5");
        filmsManager.addNewFilm("film_6");
        filmsManager.addNewFilm("film_7");
        String[] expected = {"film_7", "film_6", "film_5"};
        String[] actual = filmsManager.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}