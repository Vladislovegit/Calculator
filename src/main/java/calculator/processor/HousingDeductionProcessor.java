package calculator.processor;

import model.DataSet;

public class HousingDeductionProcessor extends DeductionProcessor {

    public HousingDeductionProcessor() {
    }

    @Override
    protected Integer operation(DataSet data) {
        return data.getHousingCosts();
    }
}
