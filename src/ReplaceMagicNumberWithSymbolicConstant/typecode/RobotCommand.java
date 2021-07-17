package ReplaceMagicNumberWithSymbolicConstant.typecode;

public class RobotCommand {
    private final String _name;

    public RobotCommand(String _name) {
        this._name = _name;
    }

    public String toString() {
        return "[ RobotCommand: " + _name + " ]";
    }
}
