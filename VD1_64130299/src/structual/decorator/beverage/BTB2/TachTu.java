package structual.decorator.beverage.BTB2;

import java.util.Arrays;
import java.util.List;

public class TachTu implements ITokenize{
    String s;

    public TachTu(String s) {
        this.s = s;
    }

    @Override
    public List<String> tokenize() {
        return Arrays.asList(s.split(" "));
    }
}
