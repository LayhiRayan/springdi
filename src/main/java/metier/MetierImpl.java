package metier;

import dao.IDao;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("metier")
@Profile("default")
public class MetierImpl implements IMetier {
    @Autowired
    @Qualifier("dao2")
    private IDao dao;

    @Override
    public double calcul() {
        if (dao == null) throw new IllegalStateException("Le DAO n'a pas été injecté.");
        return dao.getValue() * 2;
    }

    // Utilisé pour la configuration XML et les tests sans contexte Spring.
    public void setDao(IDao dao) {
        this.dao = Objects.requireNonNull(dao, "Le DAO est obligatoire.");
    }
}
