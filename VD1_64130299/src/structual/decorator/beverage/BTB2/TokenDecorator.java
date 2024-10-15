package structual.decorator.beverage.BTB2;


import java.util.List;

public abstract class TokenDecorator implements ITokenize{
    protected ITokenize tokens;

    public TokenDecorator(ITokenize tokens) {
        this.tokens = tokens;
    }

    @Override
    public List<String> tokenize() {
        return tokens.tokenize();
    }
}
