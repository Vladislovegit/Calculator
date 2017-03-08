package calculator.processor.impl;

import calculator.Constant;
import calculator.processor.DeductionProcessor;
import model.DataSet;

public class BenefitDeductionProcessor extends DeductionProcessor {

    public BenefitDeductionProcessor() {
    }

    @Override
    protected Integer deduction(DataSet data) {
        return data.getPeriod() * Constant.BENEFIT_DEDUCTION;
    }
}
