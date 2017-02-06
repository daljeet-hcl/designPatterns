package HelloBuilder;

import java.util.ArrayList;

/**
 * Created by daljeet2 on 2/6/17.
 */
public class PizzaBuilder {

    public ArrayList<String> items=new ArrayList<String>();

    public PizzaBuilder addItem(String item){
     items.add(item);
     return this;
    };

    public PizzaBuilder addVegetable(String item){
        items.add(item);
        return this;
    }


}
