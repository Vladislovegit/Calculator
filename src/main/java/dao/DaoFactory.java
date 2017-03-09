package dao;

import dao.impl.DatabaseDataSetDao;

import java.util.HashMap;
import java.util.Map;

public class DaoFactory {
    private static final Map<DaoType, Object> daos = new HashMap<>();

    static {
        daos.put(DaoType.DATASET_DAO, new DatabaseDataSetDao());
    }

    public static DataSetDao getDataSetDAO() {
        return (DataSetDao)daos.get(DaoType.DATASET_DAO);
    }
}
