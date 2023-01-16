package ub2;

public class Mainub2 {
    public static void main(String[] args) {
        FilmApp filmApp = new FilmApp();

        Schauspieler miau = new Schauspieler("cristi",2);
        Schauspieler jsj = new Schauspieler("ss",4);

        Film au = new Film("au",Typ.Drama);
        filmApp.addFilm(au);



    }
}
