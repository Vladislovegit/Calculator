package calculator.processor;

import model.DataSet;

public class EducationDeducationProcessor extends DeductionProcessor {

    public EducationDeducationProcessor() {
    }

    @Override
    protected Integer operation(DataSet data) {
        return data.getEducationCosts();
    }
}
