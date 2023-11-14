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
public class PracownikCRUD {
    private SessionFactory sessionFactory;
    public PracownikCRUD() {
        StandardServiceRegistry ssr = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml").build();

        Metadata metadata = new MetadataSources(ssr).getMetadataBuilder().build();
        sessionFactory = metadata.getSessionFactoryBuilder().build();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
    }
    public boolean getKonta(String haslo,String login)
    {
        Session session = null;
        List result = null;
        session=sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        String hql = "FROM pracownik p WHERE p.login = :login AND p.haslo = :haslo";
        Query query = session.createQuery(hql);
        query.setParameter("login", login);
        query.setParameter("haslo", haslo);
        result = query.list();
        session.close();
        if(result.isEmpty())
        {
            return false;
        }

        else {
            return true;
        }
        }




    }

