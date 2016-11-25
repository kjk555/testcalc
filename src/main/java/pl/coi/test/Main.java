package pl.coi.test;

public class Main {

    public enum Operation{ ADD,SUB,MUX,DIV };


    public void setInputData(InputData inputData) {
        this.inputData = inputData;
    }

    private InputData inputData = new InputData();


    public static void main(String[] ars) {
        Main main = new Main();
        System.out.println(main.run());

    }

    public double run(){
        double val1 =  inputData.getDouble("piersza liczba : ");
        Operation operation = inputData.getOperation();
        double val2 = inputData.getDouble("druga liczba : ");

        double result = 0;
        switch ( operation ) {
            case ADD:
                result = add( val1, val2);
                break;
            case SUB:
                result = sub( val1, val2);
                break;
            case MUX:
                result = mux( val1, val2);
                break;
            case DIV:
                result = div( val1, val2);
                break;
        }
        return result;


    }




     double add(Double val1, Double val2) {
        return val1 + val2;
    }

     double sub(Double val1, Double val2) {
        return val1 - val2;
    }

    double mux(Double val1, Double val2) {
        return val1 * val2;
    }

    double div(Double val1, Double val2) {
        return val1 / val2;
    }


}
