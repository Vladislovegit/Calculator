package calculator.processor;

import calculator.Constant;
import model.DataSet;

public class InsuranceDeductionProcessor extends DeductionProcessor {

    public InsuranceDeductionProcessor() {
    }

    @Override
    protected Integer operation(DataSet data) {
        return (data.getInsuranceCosts() <= Constant.INSURANCE_COSTS_LIMIT) ?
                data.getInsuranceCosts() :
                Constant.INSURANCE_COSTS_LIMIT;
    }
}
