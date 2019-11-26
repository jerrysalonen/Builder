package builder;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jerry Salonen
 */
public class SocialBurgerJoint extends HamburgerBuilder {
    List<String> burger;

    @Override
    public Object getBurger() {
        return burger;
    }

    @Override
    public void createBurger() {
        burger = new ArrayList();
    }

    @Override
    public void buildBurger() {
        burger.add("Beyond meat pihvi");
        burger.add("Marinoitu sipuli");
        burger.add("Tulinen majoneesi");
        burger.add("Salaatti");
    }

    @Override
    public void printBurger() {
        for (String s : burger) {
            System.out.println(s);
        }
    }
}
