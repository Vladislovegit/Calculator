package calculator.processor.condition.impl;

import calculator.Constant;
import calculator.processor.condition.Condition;
import model.DataSet;

public class RaisingAloneCondition extends Condition {

    public RaisingAloneCondition() {
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
