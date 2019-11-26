package builder;

public class Main {

    public static void main(String[] args) {
	    Waiter waiter = new Waiter();

	    HamburgerBuilder sbj = new SocialBurgerJoint();
	    waiter.setBuilder(sbj);
	    waiter.makeBurger();
	    Object burger1 = waiter.getBurger();
        System.out.println(burger1.getClass());
	    waiter.printBurger();

        System.out.println("");

        HamburgerBuilder bk = new BurgerKing();
        waiter.setBuilder(bk);
        waiter.makeBurger();
        Object burger2 = waiter.getBurger();
        System.out.println(burger2.getClass());
        waiter.printBurger();
    }
}
