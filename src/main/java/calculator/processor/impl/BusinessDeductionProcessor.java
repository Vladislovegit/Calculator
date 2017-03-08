package calculator.processor.impl;

import calculator.processor.DeductionProcessor;
import model.DataSet;

public class BusinessDeductionProcessor extends DeductionProcessor {

    public BusinessDeductionProcessor() {
    }

    @Override
    protected Integer deduction(DataSet data) {
        return data.getBusinessCosts();
    }
}
