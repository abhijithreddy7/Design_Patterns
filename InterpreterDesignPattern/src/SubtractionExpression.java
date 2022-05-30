public class SubtractionExpression implements Expression{
    private String expression;

    public SubtractionExpression(String expression)
    {
        this.expression=expression;
    }

    @Override
    public int interpret(ContextInterpreter contextInterpreter) {
        String[] data = contextInterpreter.interpret(expression);
        int number1 = Integer.parseInt(data[0]);
        int number2 = Integer.parseInt(data[1]);
        return number1 - number2;
    }
}
