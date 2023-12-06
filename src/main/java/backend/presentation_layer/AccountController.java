package backend.presentation_layer;

import backend.business_layer.AccountService;
import database.Account;

import java.sql.SQLException;
import java.util.List;

public class AccountController {
    public List<Account> getListAccount(String request) throws SQLException, ClassNotFoundException {
        if (request.equals("get_list_account")){
            AccountService service = new AccountService();
            return service.getListAccount();
        } else {
            return null;
        }

    }
}
