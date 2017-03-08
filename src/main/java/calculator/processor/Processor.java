package calculator.processor;

import model.DataSet;

public interface Processor {
    Integer process(Integer intermediateValue, DataSet data);
}
