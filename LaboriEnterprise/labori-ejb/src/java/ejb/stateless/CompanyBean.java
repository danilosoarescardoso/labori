package ejb.stateless;

import entity.Company;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless(mappedName="ejb/company")
public class CompanyBean implements CompanyBeanLocal {

    @PersistenceContext(unitName = "labori-warPU")
    private EntityManager em;

    @Override
    public List<Company> getAll() {
        return em.createQuery("select x from Company x").getResultList();
    }

    @Override
    public Company getById(Long id) {
        return em.find(Company.class, id);
    }

    @Override
    public Company getByCNPJ(String cnpj) {
        Query query = em.createQuery("SELECT x FROM Company x WHERE x.cnpj = :cnpj");

        try {
            Company c = (Company) query
                    .setParameter("cnpj", cnpj)
                    .getSingleResult();
            return c;
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public Company checkPass(String cnpj, String password) {
        Company companyMatched = getByCNPJ(cnpj);

        if (companyMatched != null && companyMatched.getPassword().equals(password))
            return companyMatched;
        return null;

    }

}