package podcastGroup6.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import podcastGroup6.entity.Store;
import podcastGroup6.service.IStoreService;

@Controller
@RequestMapping("/store")
public class StoreRest {

	@Autowired
	private IStoreService storeService;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public @ResponseBody List<Store> listAllStore () {
	    return storeService.getStoreList();
	}
}
