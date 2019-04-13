package pl.sda.patterns.behavioral.command;

//TODO refactor it using command pattern
public class SaySth {
    public String justSayIt(Object o) {
        if (o instanceof SayHi) {
            String hi = ((SayHi) o).hi();
            return hi;
        } else if (o instanceof SayNo) {
            String no = ((SayNo) o).no();
            return no;
        } else if (o instanceof SayYes) {
            String yes = ((SayYes) o).yes();
            return yes;
        } else {
            throw new RuntimeException("Wrong object type");
        }
    }
}
