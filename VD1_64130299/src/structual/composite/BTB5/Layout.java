package structual.composite.BTB5;

import java.util.ArrayList;
import java.util.List;

public abstract class Layout implements Component{
    private List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }
    public void remove(Component component){
        components.add(component);
    }
    @Override
    public void build() {

    }
}
