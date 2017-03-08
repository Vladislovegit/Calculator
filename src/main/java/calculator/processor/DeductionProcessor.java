package calculator.processor;

import model.DataSet;

public abstract class DeductionProcessor implements Processor{

    protected abstract Integer deduction(DataSet data);

    @Override
    public Integer process(Integer intermediateValue, DataSet data) {
        Integer result = intermediateValue - deduction(data);

        return result > 0 ? result : 0;
    }
}
