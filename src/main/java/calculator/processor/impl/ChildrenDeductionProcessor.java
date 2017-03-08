package calculator.processor.impl;

import calculator.processor.DeductionProcessor;
import calculator.processor.condition.Condition;
import model.DataSet;

public class ChildrenDeductionProcessor extends DeductionProcessor {

    private Condition condition;

    public ChildrenDeductionProcessor(DataSet dataSet) {
        condition = Condition.getCondition(dataSet);
    }

    @Override
    protected Integer deduction(DataSet data) {
        return condition.getChildrenDeduction(data);
    }
}
