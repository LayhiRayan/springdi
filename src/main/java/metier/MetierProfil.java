package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/** Variante de l'exercice profils : un seul DAO est actif, sans qualifier fixe. */
@Component("metier")
@Profile({"dev", "prod"})
public class MetierProfil implements IMetier {
    private final IDao dao;

    @Autowired
    public MetierProfil(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        return dao.getValue() * 2;
    }
}
