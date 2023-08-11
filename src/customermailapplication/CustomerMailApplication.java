/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package customermailapplication;

// 64050075

/**
 *
 * @author sarun
 */
public class CustomerMailApplication {
    public static void main(String[] args) {
        Customer c = CustomerFactory.createCustomer("Mountain");
        System.out.println(c.createMail());
    }
}
