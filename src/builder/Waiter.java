package builder;

/**
 * @author Jerry Salonen
 */
public class Waiter {
    private HamburgerBuilder hBuilder;

    public void setBuilder(HamburgerBuilder hb) {
        hBuilder = hb;
    }

    public Object getBurger() {
        return hBuilder.getBurger();
    }

    public void makeBurger() {
        hBuilder.createBurger();
        hBuilder.buildBurger();
    }

    public void printBurger() {
        hBuilder.printBurger();
    }
}
