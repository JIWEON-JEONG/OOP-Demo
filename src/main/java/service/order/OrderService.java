package service.order;

import service.shop.ShopService;

public class OrderService {
	private ShopService shopService;
	private OrderLineItemService orderLineItemService;

	//주문하기
	public void order() {
		shopService.validateOrder();
		orderLineItemService.validateOrder();
	}
}
