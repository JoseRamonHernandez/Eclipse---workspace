/**
 * ServiceCrudServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.service.soap;

public class ServiceCrudServiceLocator extends org.apache.axis.client.Service implements org.service.soap.ServiceCrudService {

    public ServiceCrudServiceLocator() {
    }


    public ServiceCrudServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ServiceCrudServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ServiceCrud
    private java.lang.String ServiceCrud_address = "http://localhost:7575/WebServiceServidorSOAP/services/ServiceCrud";

    public java.lang.String getServiceCrudAddress() {
        return ServiceCrud_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ServiceCrudWSDDServiceName = "ServiceCrud";

    public java.lang.String getServiceCrudWSDDServiceName() {
        return ServiceCrudWSDDServiceName;
    }

    public void setServiceCrudWSDDServiceName(java.lang.String name) {
        ServiceCrudWSDDServiceName = name;
    }

    public org.service.soap.ServiceCrud getServiceCrud() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ServiceCrud_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getServiceCrud(endpoint);
    }

    public org.service.soap.ServiceCrud getServiceCrud(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.service.soap.ServiceCrudSoapBindingStub _stub = new org.service.soap.ServiceCrudSoapBindingStub(portAddress, this);
            _stub.setPortName(getServiceCrudWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setServiceCrudEndpointAddress(java.lang.String address) {
        ServiceCrud_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.service.soap.ServiceCrud.class.isAssignableFrom(serviceEndpointInterface)) {
                org.service.soap.ServiceCrudSoapBindingStub _stub = new org.service.soap.ServiceCrudSoapBindingStub(new java.net.URL(ServiceCrud_address), this);
                _stub.setPortName(getServiceCrudWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ServiceCrud".equals(inputPortName)) {
            return getServiceCrud();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://soap.service.org", "ServiceCrudService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://soap.service.org", "ServiceCrud"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ServiceCrud".equals(portName)) {
            setServiceCrudEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
