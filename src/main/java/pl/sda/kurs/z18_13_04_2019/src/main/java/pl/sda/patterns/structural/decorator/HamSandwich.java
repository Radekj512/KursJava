package pl.sda.patterns.structural.decorator;

public class HamSandwich extends SandwichDecorator {
    Sandwich sandwich;
    public HamSandwich(Sandwich sandwich) {
        this.sandwich = sandwich;

    }

    @Override
    protected int getPrice() {
        return sandwich.getPrice()+5;
    }

    public String getDesc(){
        return sandwich.description += " with ham";
    }
}
