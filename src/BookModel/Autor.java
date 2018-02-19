package BookModel;

public class Autor {
    private int autorId;
    private String name;
    private String surname;
    private int birthYear;
    private String city;
    private String country;

    public Autor(int autorId, String name, String surname, int birthYear, String city, String country) {
        this.autorId = autorId;
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.city = city;
        this.country = country;
    }
}
