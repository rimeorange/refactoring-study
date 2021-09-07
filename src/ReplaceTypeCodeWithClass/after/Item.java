package ReplaceTypeCodeWithClass.after;

public class Item {
    private final ItemType _itemtype;
    private final String _title;
    private final int _price;

    public Item(ItemType itemType, String title, int price) {
        _itemtype = itemType;
        _title = title;
        _price = price;
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
                + _itemtype.getTypecode() + ", "
                + getTitle() + ", "
                + getPrice() + ", "
                + ']';
    }
}
