package service.shop;

import service.order.OrderOptionService;

public class OptionSpecificationService {

	private OrderOptionService orderOptionService;

	public void validateOption() {
		String orderGroupOptionName = orderOptionService.readName();
		OptionCompareAndValidate(orderGroupOptionName);
	}

	private void OptionCompareAndValidate(String orderOptionName) {
	}
}
