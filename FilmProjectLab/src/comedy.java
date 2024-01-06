class ComedyFilm extends Movie {
    int jokeCount;

    public ComedyFilm(String filmName, String director, int broadcastYear, double score, int jokeCount) {
        super(filmName, director, broadcastYear, score);
        this.jokeCount = jokeCount;
    }

    public void showInformation() {
        super.showInformation();
        System.out.println("Joke Count: " + jokeCount);
    }
}