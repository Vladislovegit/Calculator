package calculator.processor.impl;

import calculator.processor.Processor;
import model.DataSet;

public class IncomeProcessor implements Processor {

    public IncomeProcessor() {
    }

    @Override
    public Integer process(Integer intermediateValue, DataSet data) {
        intermediateValue += data.getRevenueFromSale();
        intermediateValue += data.getNonOperatingRevenue();
        return intermediateValue;
    }
}
