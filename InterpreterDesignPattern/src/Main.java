public class Main {
    public static void main(String args[]) {

        ContextInterpreter contextInterpreter = new ContextInterpreter();
        InterpreterClient interpreterClient = new InterpreterClient(contextInterpreter);

        int result=interpreterClient.interpret("add 300 and 45");
        System.out.println(result);
    }
}
