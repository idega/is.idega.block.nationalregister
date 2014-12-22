package is.idega.block.nationalregister.data.bean.impl;

import is.idega.block.nationalregister.data.bean.NationalRegister;
import is.idega.block.nationalregister.data.bean.NationalRegisterDAO;

import java.util.List;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.idega.core.persistence.Param;
import com.idega.core.persistence.impl.GenericDaoImpl;
import com.idega.util.ListUtil;
import com.idega.util.StringUtil;

@Repository
@Transactional(readOnly = true)
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class NationalRegisterDAOImpl extends GenericDaoImpl implements NationalRegisterDAO {

	@Override
	public NationalRegister findBySSN(String ssn) {
		if (StringUtil.isEmpty(ssn)) {
			return null;
		}

		List<NationalRegister> results = getResultListByInlineQuery(
				"from " + NationalRegister.class.getName() + " nr where nr.ssn = :ssn",
				NationalRegister.class,
				new Param("ssn", ssn)
		);

		return ListUtil.isEmpty(results) ? null : results.get(0);
	}

	@Override
	@Transactional(readOnly = false)
	public NationalRegister update(NationalRegister entry) {
		if (entry == null) {
			return null;
		}

		if (entry.getId() == null) {
			persist(entry);
		} else {
			merge(entry);
		}

		return entry.getId() == null ? null : entry;
	}

}