/**
 * WebshopServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webshop;

public class WebshopServiceLocator extends org.apache.axis.client.Service implements webshop.WebshopService {

    public WebshopServiceLocator() {
    }


    public WebshopServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public WebshopServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BasicHttpBinding_IwebshopService
    private java.lang.String BasicHttpBinding_IwebshopService_address = "http://localhost:8080/Design_Time_Addresses/Webshop/webshopService/";

    public java.lang.String getBasicHttpBinding_IwebshopServiceAddress() {
        return BasicHttpBinding_IwebshopService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BasicHttpBinding_IwebshopServiceWSDDServiceName = "BasicHttpBinding_IwebshopService";

    public java.lang.String getBasicHttpBinding_IwebshopServiceWSDDServiceName() {
        return BasicHttpBinding_IwebshopServiceWSDDServiceName;
    }

    public void setBasicHttpBinding_IwebshopServiceWSDDServiceName(java.lang.String name) {
        BasicHttpBinding_IwebshopServiceWSDDServiceName = name;
    }

    public webshop.IwebshopService getBasicHttpBinding_IwebshopService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BasicHttpBinding_IwebshopService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBasicHttpBinding_IwebshopService(endpoint);
    }

    public webshop.IwebshopService getBasicHttpBinding_IwebshopService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            webshop.BasicHttpBinding_IwebshopServiceStub _stub = new webshop.BasicHttpBinding_IwebshopServiceStub(portAddress, this);
            _stub.setPortName(getBasicHttpBinding_IwebshopServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBasicHttpBinding_IwebshopServiceEndpointAddress(java.lang.String address) {
        BasicHttpBinding_IwebshopService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (webshop.IwebshopService.class.isAssignableFrom(serviceEndpointInterface)) {
                webshop.BasicHttpBinding_IwebshopServiceStub _stub = new webshop.BasicHttpBinding_IwebshopServiceStub(new java.net.URL(BasicHttpBinding_IwebshopService_address), this);
                _stub.setPortName(getBasicHttpBinding_IwebshopServiceWSDDServiceName());
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
        if ("BasicHttpBinding_IwebshopService".equals(inputPortName)) {
            return getBasicHttpBinding_IwebshopService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://tempuri.org/", "webshopService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://tempuri.org/", "BasicHttpBinding_IwebshopService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BasicHttpBinding_IwebshopService".equals(portName)) {
            setBasicHttpBinding_IwebshopServiceEndpointAddress(address);
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
