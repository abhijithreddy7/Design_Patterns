public class InterpreterClient {
    private ContextInterpreter contextInterpreter;

    public InterpreterClient(ContextInterpreter contextInterpreter) {
        this.contextInterpreter = contextInterpreter;
    }

    public int interpret(String inputData) {

        Expression expression = null;

        if (inputData.contains("add")) {
            expression = new AdditionExpression(inputData);
        }

        else if (inputData.contains("subtract")) {
            expression = new SubtractionExpression(inputData);
        }

        else {
            throw new RuntimeException(inputData+" is not valid expression!!");
        }

        int result = expression.interpret(contextInterpreter);
        System.out.println(inputData);

        return result;
    }
}
