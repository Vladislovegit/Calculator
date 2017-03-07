package calculator;

import model.DataSet;

public interface Processor {
    Integer process(Integer intermediateValue, DataSet data);
}
