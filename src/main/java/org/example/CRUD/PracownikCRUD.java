package org.example.CRUD;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;

import java.util.List;
public class PracownikCRUD  extends HumanCrud{

    public PracownikCRUD() {
        super();
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

