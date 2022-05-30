public class ContextInterpreter {

    public String[] interpret(String inputData) {
        String tempInputData = inputData.replaceAll("[^0-9]", " ");
        tempInputData = tempInputData.replaceAll("( )+", " ").trim();
        String[] input = tempInputData.split(" ");
        return input;
    }
}
