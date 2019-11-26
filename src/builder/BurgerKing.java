package builder;

/**
 * @author Jerry Salonen
 */
public class BurgerKing extends HamburgerBuilder {

    private StringBuilder burger;

    @Override
    public Object getBurger() {
        return burger;
    }

    @Override
    public void createBurger() {
        burger = new StringBuilder();
    }

    @Override
    public void buildBurger() {
        burger.append("Halloumi - ");
        burger.append("Tuoresipuli - ");
        burger.append("Paprikamajoneesi - ");
        burger.append("Salaatti");
    }

    @Override
    public void printBurger() {
        System.out.println(burger);
    }
}
