package zain.headless.userorder.list.internal.resource.v1_0;

import com.liferay.commerce.model.CommerceOrder;
import com.liferay.commerce.model.CommerceOrderItem;
import com.liferay.commerce.service.CommerceOrderItemLocalServiceUtil;
import com.liferay.commerce.service.CommerceOrderLocalServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.ServiceScope;

import zain.headless.userorder.list.dto.v1_0.Data;
import zain.headless.userorder.list.dto.v1_0.Order;
import zain.headless.userorder.list.dto.v1_0.OrderItem;
import zain.headless.userorder.list.dto.v1_0.Resuest;
import zain.headless.userorder.list.dto.v1_0.UserOrderList;
import zain.headless.userorder.list.resource.v1_0.ZainUserOrderListingResource;

/**
 * @author User
 */
@Component(
	properties = "OSGI-INF/liferay/rest/v1_0/zain-user-order-listing.properties",
	scope = ServiceScope.PROTOTYPE, service = ZainUserOrderListingResource.class
)
public class ZainUserOrderListingResourceImpl
	extends BaseZainUserOrderListingResourceImpl {
	

@Override
	public UserOrderList postGetUserOrderList(Integer channelId, Resuest resuest) throws Exception {
		_log.info(ZainUserOrderListingResourceImpl.class);
		final DecimalFormat decfor = new DecimalFormat("0.00");  
		
		UserOrderList itList = new UserOrderList();
//	 	Set the status message , code , status , end , start, total
		
			itList.setStatus("SUCCESS");
			itList.setStatusCode("ZN100");
			itList.setStatusMessage("Ok");
		
		
			//	   get the userId from the resques
		int userId  =  resuest.getUserId();
		_log.info(userId);
		
// 	 Gett the orders by the userid
		List<CommerceOrder> userOrders = getUserOrdersByUserId(userId);
		
		
//  setting the orders
		
		
//	Orders array for mulitiples order details of user	
		Order[] orders = new Order[userOrders.size()];
		
		for (int i = 0; i < orders.length; i++) {
			CommerceOrder currentOrder = userOrders.get(i);
			Order orderDetails = new Order();
			orderDetails.setCommerceOrderId(currentOrder.getCommerceOrderId());
			orderDetails.setUserId(userId);
			orderDetails.setCreateDate(currentOrder.getCreateDate());
			orderDetails.setOrderStatus(currentOrder.getOrderStatus());
			orderDetails.setGrandTotal(decfor.format(currentOrder.getTotal()));
			orderDetails.setShippingChargeAmount(currentOrder.getShippingAmount());
			orderDetails.setDiscountAmount(currentOrder.getSubtotalDiscountAmount());
//			need to update 
			orderDetails.setOrderItems(getOrderItems(currentOrder.getCommerceOrderId()));
			orderDetails.setDueTodayAmount(0L);
			orderDetails.setDuePerMonthAmount(0L);
			orders[i] = orderDetails;
		}
		
		
//		Setting the Data
		Data data = new Data();
		data.setOrders(orders);
		itList.setData(data);
		
		
		
		
		

		
		return itList;
	}
	
	private OrderItem[] getOrderItems(long commerceOrderId) {
		try {
			CommerceOrderItem cOrders = CommerceOrderItemLocalServiceUtil.getCommerceOrderItem(commerceOrderId);
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			_log.warn("no id found");
		}
		int orderitemsCount = CommerceOrderItemLocalServiceUtil.getCommerceOrderItemsCount(commerceOrderId);
		OrderItem orderitems[] = new OrderItem[orderitemsCount];
		return null;
	}

	private static Log _log = LogFactoryUtil.getLog(ZainUserOrderListingResourceImpl.class.getName());
	
	
//	Fetching all the orders of the user by userid
	private List<CommerceOrder> getUserOrdersByUserId(int userId) {
		
		List<CommerceOrder> orders = CommerceOrderLocalServiceUtil.getCommerceOrders(-1, -1);

		List<CommerceOrder> userOrders = new ArrayList<>();
		int i  = 0;
		for (CommerceOrder commerceOrder : orders) {
			if(userId == commerceOrder.getUserId()) {
				userOrders.add(commerceOrder);
				
				i++;
			}
		}
		_log.info(userOrders);
		_log.info("OrderCountOfUser"+i);

		return userOrders;
	}

}