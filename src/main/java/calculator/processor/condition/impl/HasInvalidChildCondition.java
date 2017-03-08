package calculator.processor.condition.impl;

import calculator.Constant;
import calculator.processor.condition.Condition;
import model.DataSet;

public class HasInvalidChildCondition extends Condition {

    public HasInvalidChildCondition() {
    }

    @Override
    public Integer getChildrenDeduction(DataSet data) {
        return data.getPeriod() * Constant.INCREASED_CHILD_DEDUCTION;
    }

    @Override
    public Integer getDependentsDeduction(DataSet data) {
        return data.getPeriod() * data.getDependentsAmount() * Constant.DEPENDENT_DEDUCTION;
    }
}
