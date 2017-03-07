package calculator.processor;

import model.DataSet;

public class BusinessDeductionProcessor extends DeductionProcessor {

    public BusinessDeductionProcessor() {
    }

    @Override
    protected Integer operation(DataSet data) {
        return data.getBusinessCosts();
    }
}
