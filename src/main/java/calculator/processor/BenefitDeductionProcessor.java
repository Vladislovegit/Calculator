package calculator.processor;

import calculator.Constant;
import model.DataSet;

public class BenefitDeductionProcessor extends DeductionProcessor {

    public BenefitDeductionProcessor() {
    }

    @Override
    protected Integer operation(DataSet data) {
        return data.getPeriod() * Constant.BENEFIT_DEDUCTION_COEFFICIENT;
    }
}
