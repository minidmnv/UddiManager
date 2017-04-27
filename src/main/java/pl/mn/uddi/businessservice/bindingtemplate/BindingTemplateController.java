package pl.mn.uddi.businessservice.bindingtemplate;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author mnicinski
 */
@RestController
@RequestMapping("/service/{:serviceId}")
public class BindingTemplateController {

	@RequestMapping(method = RequestMethod.POST)
	public void addBindingTemplate(@RequestParam String bindingTemplateLocalization) {

	}

	@RequestMapping(method = RequestMethod.DELETE)
	public void removeBindingTemplate() {

	}

}
