package podcastGroup6.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import podcastGroup6.dao.IStoreDao;
import podcastGroup6.entity.Store;

public class StoreServiceImpl implements IStoreService {

	@Autowired
	private IStoreDao storeDao;

	public List<Store> getStoreList() {
		return storeDao.getStoreList();
	}

}
