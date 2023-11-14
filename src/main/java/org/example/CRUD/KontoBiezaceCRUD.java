package org.example.CRUD;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class KontoBiezaceCRUD extends KontaCRUD {


    public KontoBiezaceCRUD() {
        super();

    }

    public List getKonta()
    {
        Session session = null;
        List result = null;
        session=sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM KontoBiezace";
        Query query = session.createQuery(hql);
        result =query.list();
        session.close();
        return result;
    }




}
