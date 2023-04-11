package org.service.soap;

public class ServiceCrudProxy implements org.service.soap.ServiceCrud {
  private String _endpoint = null;
  private org.service.soap.ServiceCrud serviceCrud = null;
  
  public ServiceCrudProxy() {
    _initServiceCrudProxy();
  }
  
  public ServiceCrudProxy(String endpoint) {
    _endpoint = endpoint;
    _initServiceCrudProxy();
  }
  
  private void _initServiceCrudProxy() {
    try {
      serviceCrud = (new org.service.soap.ServiceCrudServiceLocator()).getServiceCrud();
      if (serviceCrud != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)serviceCrud)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)serviceCrud)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (serviceCrud != null)
      ((javax.xml.rpc.Stub)serviceCrud)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.service.soap.ServiceCrud getServiceCrud() {
    if (serviceCrud == null)
      _initServiceCrudProxy();
    return serviceCrud;
  }
  
  public java.lang.String updateS_Region(int id, java.lang.String name) throws java.rmi.RemoteException{
    if (serviceCrud == null)
      _initServiceCrudProxy();
    return serviceCrud.updateS_Region(id, name);
  }
  
  public java.lang.String insertS_Region(int id, java.lang.String name) throws java.rmi.RemoteException{
    if (serviceCrud == null)
      _initServiceCrudProxy();
    return serviceCrud.insertS_Region(id, name);
  }
  
  public java.lang.String deleteS_Region(int id_r) throws java.rmi.RemoteException{
    if (serviceCrud == null)
      _initServiceCrudProxy();
    return serviceCrud.deleteS_Region(id_r);
  }
  
  public void connectDataBase() throws java.rmi.RemoteException{
    if (serviceCrud == null)
      _initServiceCrudProxy();
    serviceCrud.connectDataBase();
  }
  
  public java.lang.String selectByIdS_Region(int id) throws java.rmi.RemoteException{
    if (serviceCrud == null)
      _initServiceCrudProxy();
    return serviceCrud.selectByIdS_Region(id);
  }
  
  
}