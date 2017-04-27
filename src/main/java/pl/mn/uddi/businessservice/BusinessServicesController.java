package pl.mn.uddi.businessservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.uddi.api_v3.BusinessService;

/**
 * @author minidmnv
 */
@RestController
@RequestMapping("/service")
public class BusinessServicesController {

	@RequestMapping(method = RequestMethod.POST)
	public void addBusinessService(@RequestParam String businessServiceName) {

	}

	@RequestMapping(method = RequestMethod.GET)
	public void getAllBusinessServices() {

	}

	@RequestMapping(method = RequestMethod.PUT)
	public void editBinding(@RequestParam BusinessService service) {

	}

}
