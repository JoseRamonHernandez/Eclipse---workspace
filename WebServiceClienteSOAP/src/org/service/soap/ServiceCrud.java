/**
 * ServiceCrud.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.service.soap;

public interface ServiceCrud extends java.rmi.Remote {
    public java.lang.String updateS_Region(int id, java.lang.String name) throws java.rmi.RemoteException;
    public java.lang.String insertS_Region(int id, java.lang.String name) throws java.rmi.RemoteException;
    public java.lang.String deleteS_Region(int id_r) throws java.rmi.RemoteException;
    public void connectDataBase() throws java.rmi.RemoteException;
    public java.lang.String selectByIdS_Region(int id) throws java.rmi.RemoteException;
}
