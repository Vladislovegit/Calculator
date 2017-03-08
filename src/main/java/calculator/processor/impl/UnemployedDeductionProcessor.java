package calculator.processor.impl;

import calculator.Constant;
import calculator.processor.DeductionProcessor;
import model.DataSet;

public class UnemployedDeductionProcessor extends DeductionProcessor {

    public UnemployedDeductionProcessor() {
    }

    @Override
    protected Integer deduction(DataSet data) {
        return data.getPeriod() * Constant.UNEMPLOYED_DEDUCTION;
    }

    @Override
    public Integer process(Integer intermediateValue, DataSet data) {
        Integer result = (intermediateValue - data.getBusinessCosts()) <= Constant.UNEMPLOYED_INCOME_LIMIT ?
                intermediateValue - deduction(data)  :
                intermediateValue;
        return result > 0 ? result : 0;
    }
}
