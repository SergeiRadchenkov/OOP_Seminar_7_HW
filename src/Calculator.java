public class Calculator implements iCalculable {
    private iCalculable operation;

    public Calculator(iCalculable operation) {
        this.operation = operation;
    }

    @Override
    public ComplexNumber ToDo(ComplexNumber a, ComplexNumber b) {
        return operation.ToDo(a, b);
    }
}
