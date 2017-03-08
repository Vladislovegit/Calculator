package calculator.processor.condition.impl;

import calculator.Constant;
import calculator.processor.condition.Condition;
import model.DataSet;

public class MoreThanOneChildCondition extends Condition {

    public MoreThanOneChildCondition() {
    }

    @Override
    public Integer getChildrenDeduction(DataSet data) {
        return data.getPeriod() * data.getChildrenAmount() * Constant.INCREASED_CHILD_DEDUCTION;
    }

    @Override
    public Integer getDependentsDeduction(DataSet data) {
        return data.getPeriod() * data.getDependentsAmount() * Constant.INCREASED_DEPENDENT_DEDUCTION;
    }
}
