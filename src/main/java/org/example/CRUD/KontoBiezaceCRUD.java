package org.example.CRUD;

import interfejsyy.Konto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import java.util.List;

public class KontoBiezaceCRUD {
    private SessionFactory sessionFactory;

    public KontoBiezaceCRUD() {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();

        Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();
        sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
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
