package ReplaceTypeCodeWithClass.before;

public class Item {
    public static final int TYPECODE_BOOK = 0;
    public static final int TYPECODE_DVD = 1;
    public static final int TYPECODE_SOFTWARE = 2;

    private final int _typecode;
    private final String _title;
    private final int _price;

    public Item(int _typecode, String _title, int _price) {
        this._typecode = _typecode;
        this._title = _title;
        this._price = _price;
    }

    public int getTypecode() {
        return _typecode;
    }

    public String getTitle() {
        return _title;
    }

    public int getPrice() {
        return _price;
    }

    @Override
    public String toString() {
        return "["
                + getTypecode() + ", "
                + getTitle() + ", "
                + getPrice() + ", "
                + ']';
    }
}
