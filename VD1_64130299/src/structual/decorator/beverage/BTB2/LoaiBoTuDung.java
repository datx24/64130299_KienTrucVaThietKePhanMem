package structual.decorator.beverage.BTB2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LoaiBoTuDung extends TokenDecorator{
    private List<String> stopWords = Arrays.asList("thì","là","mà","và","hoặc");
    public LoaiBoTuDung(ITokenize tokens) {
        super(tokens);
    }

    @Override
    public List<String> tokenize() {
        List<String> result = new ArrayList<>(super.tokenize());
        result.removeAll(stopWords);
        return result;
    }
}
