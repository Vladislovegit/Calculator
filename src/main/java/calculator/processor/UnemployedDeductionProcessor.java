package calculator.processor;

import calculator.Constant;
import model.DataSet;

public class UnemployedDeductionProcessor extends DeductionProcessor {

    public UnemployedDeductionProcessor() {
    }

    @Override
    protected Integer operation(DataSet data) {
        return data.getPeriod() * Constant.UNEMPLOYED_DEDUCTION_COEFFICIENT;
    }

    @Override
    public Integer process(Integer intermediateValue, DataSet data) {
        return ((intermediateValue - data.getBusinessCosts()) <= Constant.UNEMPLOYED_INCOME_LIMIT) ?
                intermediateValue - operation(data) :
                intermediateValue;
    }
}
