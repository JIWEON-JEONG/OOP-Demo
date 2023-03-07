package service.shop;

public class MenuService {

	private OptionGroupSpecificationService optionGroupSpecificationService;

	public void validateOrderLine() {
		validateOrderLineItem();
		optionGroupSpecificationService.validateOptionGroup();
	}

	public void validateOrderLineItem() {
	}
}
