package backend.data_layer;

import database.Account;
import utils.JDBCUtils;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AccountRepository {

    public List<Account> getListAccount() throws SQLException, ClassNotFoundException {
        JDBCUtils jdbcUtils = new JDBCUtils();
        Connection cnn = jdbcUtils.getConnection();

        Statement statement = cnn.createStatement();

        String sql = "SELECT AccountId, Username, FullName FROM account LIMIT 10";

        ResultSet resultSet = statement.executeQuery(sql);

        List<Account> list = new ArrayList<>();

        while (resultSet.next()){
            int accountId = resultSet.getInt(1);
            String userName = resultSet.getString(2);
            String fullName = resultSet.getString(3);
            list.add(new Account(accountId, userName, fullName));
        }

        jdbcUtils.disconnect();
        return list;
    }
}
