import lombok.Getter;
import lombok.experimental.Accessors;

@Getter
@Accessors(fluent = true)
public class Drink {

    private String name;
    private int price;

    public Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
