package frontend;

import backend.presentation_layer.AccountController;
import database.Account;

import java.sql.SQLException;
import java.util.List;

public class Program {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        AccountController controller = new AccountController();

        List<Account> list = controller.getListAccount("get_list_account");

        for (Account a : list){
            System.out.println(a);
        }
    }
}
