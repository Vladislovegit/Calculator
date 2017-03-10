package dao.impl;

import dao.DataSetDao;
import dao.exception.DAOException;
import dao.util.HibernateSessionFactory;
import model.DataSet;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class DatabaseDataSetDao implements DataSetDao {

    private static final String GET_ALL = "FROM DataSet";

    @Override
    public Long insert(DataSet dataSet) throws DAOException {
        Transaction transaction = null;
        Long id;

        try (Session session = HibernateSessionFactory.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            id = (Long) session.save(dataSet);
            transaction.commit();
        } catch (HibernateException e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DAOException(e);
        }
        return id;
    }

    @Override
    public List<DataSet> getAll() throws DAOException {
        List<DataSet> data = new ArrayList<>();
        Transaction transaction = null;
        try (Session session = HibernateSessionFactory.getSessionFactory().openSession()) {
            transaction = session.beginTransaction();
            Query query = session.createQuery(GET_ALL);
            for (Object dataSet : query.getResultList()) {
                data.add((DataSet) dataSet);
            }
            transaction.commit();
        } catch (HibernateException e) {
            if (transaction != null) {
                transaction.rollback();
            }
            throw new DAOException(e);
        }
        return data;
    }
}
