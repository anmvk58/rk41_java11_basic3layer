package backend.business_layer;

import backend.data_layer.AccountRepository;
import database.Account;

import java.sql.SQLException;
import java.util.List;

public class AccountService {
    public List<Account> getListAccount() throws SQLException, ClassNotFoundException {
        AccountRepository repository = new AccountRepository();

        List<Account> list = repository.getListAccount();

        for (Account a : list){
            a.setCustomerClass("Diamond");
        }

        return list;
    }
}
