package model;

public class book extends Entity{
    private String tittle, autor, isbn, editorial;
    private boolean disponibility;

    public book(int id, String tittle, String autor, String isbn, String editorial, boolean disponibility) {
        super(id);
        this.tittle = tittle;
        this.autor = autor;
        this.isbn = isbn;
        this.editorial = editorial;
        this.disponibility = disponibility;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public boolean isDisponibility() {
        return disponibility;
    }

    public void setDisponibility(boolean disponibility) {
        this.disponibility = disponibility;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "Tittle='" + tittle + '\'' +
                ", Autor='" + autor + '\'' +
                ", ISBN='" + isbn + '\'' +
                ", Editorial='" + editorial + '\'' +
                ", Disponibility=" + disponibility +
                '}';
    }
}