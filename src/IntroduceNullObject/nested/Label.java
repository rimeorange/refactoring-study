package IntroduceNullObject.nested;

public class Label {
    private final String _label;

    public Label(String _label) {
        this._label = _label;
    }

    public void display() {
        System.out.println("display: " + _label);
    }

    public String toString() {
        return "\"" + _label + "\"";
    }

    public boolean isNull() {
        return false;
    }

    //팰토리 메서드
    public static Label newNull() {
        return NullLabel.getInstance();
    }

    //널 객체
    public static class NullLabel extends Label {
        //싱글톤
        private static final NullLabel sigleton = new NullLabel();
        private static NullLabel getInstance() {
            return sigleton;
        }

        public NullLabel() {
            super("(none)");
        }

        @Override
        public boolean isNull() {
            return true;
        }

        @Override
        public void display() {
        }
    }
}
