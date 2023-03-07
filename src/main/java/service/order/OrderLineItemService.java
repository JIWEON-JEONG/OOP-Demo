package service.order;

import service.shop.MenuService;

public class OrderLineItemService {

	private MenuService menuService;

	public void validateOrder() {
		menuService.validateOrderLine();
	}
}
