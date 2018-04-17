import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class KitchenTest {

    Order order1;
    Dish dish1;
    Kitchen kitchen1;
    Waiter waiter1;

    ArrayList<Order> prep;
    ArrayList<Dish> pass;

    @Before
    public void before(){
        order1 = new Order(1, MenuItem.LASAGNE);
        dish1 = new Dish(MenuItem.LASAGNE);
        kitchen1 = new Kitchen(prep, pass);
        waiter1 = new Waiter("Sergio", 70.00, prep);
        prep = new ArrayList<Order>();
        pass = new ArrayList<Dish>();
    }

    @Test
    public void canAddOrderToPrepList(){
        prep.add(order1);
        kitchen1.addOrderToKitchen(waiter1);
        assertEquals(1, kitchen1.getPrep().size());
    }


}
