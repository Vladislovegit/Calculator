package calculator.processor;

import calculator.Processor;
import model.DataSet;

public abstract class DeductionProcessor implements Processor{

    protected abstract Integer operation(DataSet data);

    @Override
    public Integer process(Integer intermediateValue, DataSet data) {
        Integer result = intermediateValue - operation(data);

        return result != 0 ? result : 0;
    }
}
