package calculator.processor.impl;

import calculator.processor.DeductionProcessor;
import model.DataSet;

public class EducationDeductionProcessor extends DeductionProcessor {

    public EducationDeductionProcessor() {
    }

    @Override
    protected Integer deduction(DataSet data) {
        return data.getEducationCosts();
    }
}
