package structual.decorator.beverage.BTB2;

import java.util.List;
import java.util.stream.Collectors;

public class LoaiBoDauCau extends TokenDecorator {

    public LoaiBoDauCau(ITokenize tokens) {
        super(tokens);
    }

    @Override
    public List<String> tokenize() {
        List<String> result = super.tokenize();
        return result.stream()
                .map(token -> token.replaceAll("\\p{Punct}",""))
                .collect(Collectors.toList());
    }
}
