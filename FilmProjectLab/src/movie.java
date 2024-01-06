class Movie {
    String filmName;
    String director;
    int broadcastYear;
    double score;

    public Movie(String filmName, String director, int broadcastYear, double score) {
        this.filmName = filmName;
        this.director = director;
        this.broadcastYear = broadcastYear;
        this.score = score;
    }

    public void showInformation() {
        System.out.println("Movie: " + filmName);
        System.out.println("Director: " + director);
        System.out.println("Year of Release: " + broadcastYear);
        System.out.println("Audience Score: " + score);
    }
}