package calculator.processor.impl;

import calculator.Constant;
import calculator.processor.DeductionProcessor;
import model.DataSet;

public class InsuranceDeductionProcessor extends DeductionProcessor {

    public InsuranceDeductionProcessor() {
    }

    @Override
    protected Integer deduction(DataSet data) {
        return data.getInsuranceCosts() <= Constant.INSURANCE_COSTS_LIMIT ?
                data.getInsuranceCosts() :
                Constant.INSURANCE_COSTS_LIMIT;
    }
}
