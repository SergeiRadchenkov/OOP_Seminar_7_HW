public class Decorator implements iCalculable {
    private iCalculable component;
    private Logger logger;

    public Decorator(iCalculable component, Logger logger) {
        this.component = component;
        this.logger = logger;
    }

    @Override
    public ComplexNumber ToDo(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = component.ToDo(a, b);
        logger.log("Операция: " + component.getClass().getSimpleName() + ", Результат: " + result);
        return result;
    }
}
