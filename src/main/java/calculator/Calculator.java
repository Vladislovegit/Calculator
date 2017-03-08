package calculator;

import calculator.processor.Processor;
import model.DataSet;

import java.util.ArrayList;

import static calculator.Constant.INCOME_TAX_RATE;

public class Calculator {
    private DataSet dataSet;
    private ArrayList<Processor> processors = new ArrayList<>();

    public Calculator(DataSet dataSet) {
        this.dataSet = dataSet;
    }

    public void add(Processor processor) {
        processors.add(processor);
    }

    public Double calculate() {
        Integer res = 0;
        for (Processor processor : processors) {
            res = processor.process(res, dataSet);
        }
        return multiplyOnIncomeTaxRate(res);
    }

    private Double multiplyOnIncomeTaxRate(Integer res) {
        return res * INCOME_TAX_RATE;
    }
}
