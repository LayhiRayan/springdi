package dao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("dao")
@Profile({"default", "prod"})
public class DaoImpl implements IDao {
    @Override
    public double getValue() {
        System.out.println("[DAO] Version de production : 100.0");
        return 100.0;
    }
}
