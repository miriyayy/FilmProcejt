class ActionFilm extends Movie {
    String actionType;

    public ActionFilm(String filmName, String director, int broadcastYear, double score, String actionType) {
        super(filmName, director, broadcastYear, score);
        this.actionType = actionType;
    }


    public void showInformation() {
        super.showInformation();
        System.out.println("Action Type: " + actionType);
    }
}