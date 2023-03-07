package service.shop;

import service.order.OrderOptionGroupService;

public class OptionGroupSpecificationService {

	private OrderOptionGroupService orderOptionGroupService;
	private OptionSpecificationService optionSpecificationService;

	public void validateOptionGroup() {
		String orderGroupOptionName = orderOptionGroupService.readGroupName();
		OptionGroupCompareAndValidate(orderGroupOptionName);
		optionSpecificationService.validateOption();
	}

	private void OptionGroupCompareAndValidate(String orderGroupOptionName) {
	}
}
