/**
 * IwebshopService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package webshop;

public interface IwebshopService extends java.rmi.Remote {
    public webshop.Product[] getAllProducts(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public webshop.Product getProductById(java.lang.Integer id, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public void saveProduct(java.lang.String name, java.lang.String desc, java.lang.Integer stock, java.lang.Double price) throws java.rmi.RemoteException;
    public webshop.User[] getAllUsers(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public webshop.User getUserByID(java.lang.Integer id, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public webshop.User getUserByName(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public java.lang.String saveNewUser(java.lang.String name) throws java.rmi.RemoteException;
    public java.lang.Boolean checkUserAuthentication(java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public int[] getAllOrdersByCustomerID(java.lang.Integer cId, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public webshop.Order getOrderByID(java.lang.Integer id, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public void saveNewOrder(webshop.User u, webshop.Order_Product[] producten, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
    public webshop.OrderProductDTO[] getProductsFromOrder(java.lang.Integer orderID, java.lang.String username, java.lang.String password) throws java.rmi.RemoteException;
}
