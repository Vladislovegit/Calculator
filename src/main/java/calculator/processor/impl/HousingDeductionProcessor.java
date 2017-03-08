package calculator.processor.impl;

import calculator.processor.DeductionProcessor;
import model.DataSet;

public class HousingDeductionProcessor extends DeductionProcessor {

    public HousingDeductionProcessor() {
    }

    @Override
    protected Integer deduction(DataSet data) {
        return data.getHousingCosts();
    }
}
