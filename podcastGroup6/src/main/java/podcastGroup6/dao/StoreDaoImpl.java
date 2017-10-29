package podcastGroup6.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import podcastGroup6.config.HibernateUtil;
import podcastGroup6.entity.Store;

@Repository
@Transactional
public class StoreDaoImpl implements IStoreDao {

	@Autowired
	private HibernateUtil hibernateUtil;

	@Override
	public List<Store> getStoreList() {
		return hibernateUtil.fetchAll(Store.class);
	}
}
