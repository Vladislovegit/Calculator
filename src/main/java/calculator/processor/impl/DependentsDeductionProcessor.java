package calculator.processor.impl;

import calculator.processor.DeductionProcessor;
import calculator.processor.condition.Condition;
import model.DataSet;

public class DependentsDeductionProcessor extends DeductionProcessor {

    private Condition condition;

    public DependentsDeductionProcessor(DataSet dataSet) {
        condition = Condition.getCondition(dataSet);
    }

    @Override
    protected Integer deduction(DataSet data) {
        return condition.getDependentsDeduction(data);
    }
}
