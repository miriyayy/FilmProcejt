
public class FilmProcejt {
    public static void main(String[] args) {

        ActionFilm actionMovie = new ActionFilm("Inception", "Christopher Nolan", 2010, 8.7, "Thriller");
        actionMovie.showInformation();

        System.out.println("\n-----------------\n");

        ComedyFilm comedyMovie = new ComedyFilm("3 Idiots", "Amir Khan", 2009, 8.4, 55);
        comedyMovie.showInformation();
    }
}
