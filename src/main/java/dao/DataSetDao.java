package dao;

import dao.exception.DAOException;
import model.DataSet;

import java.util.List;

public interface DataSetDao {
    Long insert(DataSet dataSet) throws DAOException;

    List<DataSet> getAll() throws DAOException;
}
