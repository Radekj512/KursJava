package pl.sda.patterns.structural.decorator;

public class CheeseSandwich extends SandwichDecorator {

    Sandwich sandwich;

    public CheeseSandwich(Sandwich sandwich) {
        this.sandwich = sandwich;

    }

    @Override
    protected int getPrice() {
        return sandwich.getPrice()+2;
    }

    public String getDesc(){
        sandwich.description = sandwich.description+ " with cheese";
        return sandwich.description;
    }
}
