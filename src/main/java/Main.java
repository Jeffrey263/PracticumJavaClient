import webshop.*;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args) throws ServiceException, RemoteException {
        //Haal webshop service op
        WebshopServiceLocator shopLocator = new WebshopServiceLocator();
        IwebshopService shopService = shopLocator.getBasicHttpBinding_IwebshopService();

        System.out.println("\n--------------| INLOGGEN |----------------");
        String username = "Jeffrey263";
        String password = "wD$1wu1l";
        boolean ingelogt = shopService.checkUserAuthentication(username, password);
        System.out.println("Inloggen gelukt: " + ingelogt);
        User currentUser = shopService.getUserByName(username, password);
        System.out.println("Ingelogte gebruiker: " + currentUser.getName());

        System.out.println("\n--------------| NIEUWE GEBRUIKER |----------------");
        String newUserMsg = shopService.saveNewUser("Peter95");
        System.out.println(newUserMsg);

        System.out.println("\n--------------| PRODUCTEN OPHALEN |----------------");
        Product[] products = shopService.getAllProducts(username, password);

        for(Product p : products){
            System.out.println("Product: " + p.getName() + " \t\t\tprijs: " + p.getPrice());
        }

        System.out.println("\n--------------| ORDER AANMAKEN |----------------");
        Product sinasappel = shopService.getProductById(1, username, password);
        int quantity = 5;

        Order_Product op = new Order_Product();
        op.setProduct(sinasappel);
        op.setQuantity(quantity);
        Order_Product[] orderProducts = {op};

        shopService.saveNewOrder(currentUser, orderProducts, username, password);
        System.out.println("Order aangemaakt!");

        System.out.println("\n--------------| GET ORDERS |----------------");
        int[] orders = shopService.getAllOrdersByCustomerID(currentUser.getId(), username, password);

        for(int i : orders){
            System.out.println("Order: " + i);
            OrderProductDTO[] oDTOArray = shopService.getProductsFromOrder(i, username, password);

            for (OrderProductDTO oDTO : oDTOArray){
                Product p = shopService.getProductById(oDTO.getProduct(), username, password);
                System.out.println("\tProduct: " + p.getName() + "\tquantity: " + oDTO.getQuantity());
            }
        }

        User updatedUser = shopService.getUserByName(username, password);
        System.out.println("Users balance: " + updatedUser.getBalance());
    }
}
