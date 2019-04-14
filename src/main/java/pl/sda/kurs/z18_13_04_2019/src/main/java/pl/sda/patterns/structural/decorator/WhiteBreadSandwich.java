package pl.sda.patterns.structural.decorator;

public class WhiteBreadSandwich extends Sandwich {

    public WhiteBreadSandwich(String desc) {
        super.description = desc;
    }

    @Override
    protected int getPrice() {
        return 5;
    }
}
