package abs_cls_interfaces_final.zadatak_A_P2;

public class Knjiga extends KnjiznicnaJedinica {
    private String autor;
    private String isbn;

    public Knjiga(String naslov, int godina,
                  String autor, String isbn) {
        super(naslov, godina);
        this.autor = autor;
        this.isbn = isbn;
    }

    @Override
    public String podaci() {
        return "[Knjiga] " + naslov + " (" + godina + "), "
                + "autor: " + autor + ", ISBN: " + isbn;
    }
}