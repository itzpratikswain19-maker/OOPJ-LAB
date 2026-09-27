// Assignment8_Q4

class movie {

    String title;
    String director;
    String actor;
    String reviews;

    movie(String t, String d, String a) {
        title = t;
        director = d;
        actor = a;
    }

    void addReviews(String r) {
        reviews = r;
    }

    void display() {
        System.out.println("movie details:");
        System.out.println("Title:" + title);
        System.out.println("Director:" + director);
        System.out.println("Actor:" + actor);
        System.out.println("Reviews:" + reviews);
    }

    public static void main(String args[]) {
        movie m = new movie("Lucifer", "Neil Gaiman", "Lucifer Morningstar");
        m.addReviews("This series is Best.");
        m.display();
    }
}
