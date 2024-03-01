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
import pojos.Asignatura;

/**
 *
 * @author Usuario
 */
public class AsignaturaDAO {
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
    
    public List<Asignatura> obtenListaAsignaturas() throws HibernateException {
        List<Asignatura> listaAsignaturas = null;
        try
        {
            iniciaOperacion();
            listaAsignaturas = sesion.createQuery("from Asignatura").list();
        } catch (HibernateException he)
        {
            manejaExcepcion(he);
            throw he;
        } finally
        {
            sesion.close();
        }
        return listaAsignaturas;
    }
}
