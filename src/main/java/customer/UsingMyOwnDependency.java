package customer;


import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckManager;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

import java.time.LocalDate;

public class UsingMyOwnDependency {

    public static void main(String[] args) throws Exception {

        BaseCustomerManager customerManagerNero = new NeroCustomerManager();
        customerManagerNero.Save(new Customer("Orhan Efe","Clk", LocalDate.of(2009,11,30),18));
        System.out.println();

        BaseCustomerManager customerManagerStarBucks = new StarbucksCustomerManager(new CustomerCheckManager(){});

        customerManagerStarBucks.Save(new Customer("Erdem","Clk",LocalDate.of(2000,6,3),3));
        System.out.println();

        customerManagerNero.Delete(new Customer(2));
    }
}