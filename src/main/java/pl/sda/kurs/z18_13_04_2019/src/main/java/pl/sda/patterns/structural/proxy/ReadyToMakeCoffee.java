package pl.sda.patterns.structural.proxy;

interface ReadyToMakeCoffee {

    default void start() {
        System.out.println("Ok, I'll do that... " + this.getClass().getSimpleName());
    }

    default String finish() {
        System.out.println("I've made it! " + this.getClass().getSimpleName());
        return this.getClass().getSimpleName();
    }
}
