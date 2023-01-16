package ub2;

import java.util.ArrayList;

public class FilmApp {
    public ArrayList<Film> films;

    public FilmApp() {
        this.films = new ArrayList<Film>();
    }

    public ArrayList<Film> getFilms() {
        return films;
    }

    public void setFilms(ArrayList<Film> films) {
        this.films = films;
    }

    public void addFilm(Film film) {
        films.add(film);
    }

    public void deleteFilm(Film film) {
        films.remove(film);
    }

    public void updateFilm(Film oldfilm, Film newfilm) {
        int index = films.indexOf(oldfilm);
        films.set(index, newfilm);
    }

    public void dispFilm(){
        if(films.isEmpty()){
            System.out.println("Is empty");
        }
        for(Film employe : films){
            System.out.println(employe.toString());
        }

    }


}
