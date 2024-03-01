/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.List;
import notas.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import pojos.Alumno;

/**
 *
 * @author Usuario
 */
public class AlumnoDAO {

    private Session sesion;
    private Transaction tx;

    private void iniciaOperacion() throws HibernateException {
        sesion = HibernateUtil.getSessionFactory().openSession();
        tx = sesion.beginTransaction();
    }

    private void manejaExcepcion(HibernateException he) throws HibernateException {
        tx.rollback();
        throw new HibernateException("Error en la capa de acceso a datos", he);
    }

    public void guardaAlumno(Alumno a) throws HibernateException {
        int id;
        try
        {
            iniciaOperacion();
            sesion.save(a);
            tx.commit();
        } catch (HibernateException he)
        {
            manejaExcepcion(he);
            throw he;
        } finally
        {
            sesion.close();
        }
    }

    public void actualizaAlumno(Alumno a) throws HibernateException {
        try
        {
            iniciaOperacion();
            sesion.update(a);
            tx.commit();
        } catch (HibernateException he)
        {
            manejaExcepcion(he);
            throw he;
        } finally
        {
            sesion.close();
        }
    }

    public void eliminaAlumno(Alumno a) throws HibernateException {
        try
        {
            iniciaOperacion();
            sesion.delete(a);
            tx.commit();
        } catch (HibernateException he)
        {
            manejaExcepcion(he);
            throw he;
        } finally
        {
            sesion.close();
        }
    }

    public Alumno obtenAlumno(int idAlumno) throws HibernateException {
        Alumno a = null;
        try
        {
            iniciaOperacion();
            a = (Alumno) sesion.get(Alumno.class, idAlumno);
        } catch (HibernateException he)
        {
            manejaExcepcion(he);
            throw he;
        } finally
        {
            sesion.close();
        }
        return a;
    }

    public List<Alumno> obtenListaAlumnos() throws HibernateException {
        List<Alumno> listaAlumnos = null;
        try
        {
            iniciaOperacion();
            listaAlumnos = sesion.createQuery("from Alumno").list();
        } catch (HibernateException he)
        {
            manejaExcepcion(he);
            throw he;
        } finally
        {
            sesion.close();
        }
        return listaAlumnos;
    }
}
