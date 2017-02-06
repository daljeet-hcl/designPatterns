package HelloBuilder;

/**
 * Created by daljeet2 on 2/6/17.
 */
public class BuilderMain {

    public static void main(String[] args)
    {
        PizzaBuilder builder=new PizzaBuilder();
        builder.addItem("cheese").addItem("chicken").addItem("thinCrust");
        System.out.println(builder.items.get(2));
    }
}
