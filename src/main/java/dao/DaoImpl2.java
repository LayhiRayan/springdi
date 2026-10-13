package dao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("dao2")
@Profile({"default", "dev"})
public class DaoImpl2 implements IDao {
    @Override
    public double getValue() {
        System.out.println("[DAO 2] Version de développement : 150.0");
        return 150.0;
    }
}
