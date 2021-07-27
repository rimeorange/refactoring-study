package ExtractClass.after;

public class Book {
    private String _title;
    private String _isbn;
    private String _price;
    private Author _author;

    public Book(String _title, String _isbn, String _price, String authorName, String authorMail) {
        this._title = _title;
        this._isbn = _isbn;
        this._price = _price;
        this._author = new Author(authorName, authorMail);
    }

    public String get_title() {
        return _title;
    }

    public String get_isbn() {
        return _isbn;
    }

    public String get_price() {
        return _price;
    }

    public String getAuthorName() {
        return _author.getName();
    }

    public String getAuthorMail() {
        return _author.getMail();
    }

    public void setAuthorName(String name) {
        _author.setName(name);
    }

    public void setAuthorMail(String mail) {
        _author.setMail(mail);
    }

    public String toXml() {
        String author = tag("author", tag("name", _author.getName()) + tag("mail", _author.getMail()));
        String book = tag("book", tag("title", _title) + tag("isbn", _isbn) + tag("price", _price) + author);
        return book;
    }

    private String tag(String element, String content) {
        return "<" + element + ">" + content + "</" + element + ">";
    }
}

class Author {
    private String _name;
    private String _mail;

    public Author(String name, String mail) {
        this._name = name;
        this._mail = mail;
    }

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public String getMail() {
        return _mail;
    }

    public void setMail(String _mail) {
        this._mail = _mail;
    }
}
