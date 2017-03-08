package calculator.processor.condition.impl;

import calculator.Constant;
import calculator.processor.condition.Condition;
import model.DataSet;

public class OneChildCondition extends Condition {

    public OneChildCondition() {
    }

    @Override
    public Integer getChildrenDeduction(DataSet data) {
        return data.getPeriod() * Constant.CHILD_DEDUCTION;
    }

    @Override
    public Integer getDependentsDeduction(DataSet data) {
        return data.getPeriod() * data.getDependentsAmount() * Constant.DEPENDENT_DEDUCTION;
    }
}
