package zain.headless.userorder.list.client.dto.v1_0;

import java.io.Serializable;

import java.util.Date;
import java.util.Objects;

import javax.annotation.Generated;

import zain.headless.userorder.list.client.dto.v1_0.OrderItem;
import zain.headless.userorder.list.client.function.UnsafeSupplier;
import zain.headless.userorder.list.client.serdes.v1_0.OrderSerDes;

/**
 * @author User
 * @generated
 */
@Generated("")
public class Order implements Cloneable, Serializable {

	public static Order toDTO(String json) {
		return OrderSerDes.toDTO(json);
	}

	public Long getCommerceOrderId() {
		return commerceOrderId;
	}

	public void setCommerceOrderId(Long commerceOrderId) {
		this.commerceOrderId = commerceOrderId;
	}

	public void setCommerceOrderId(
		UnsafeSupplier<Long, Exception> commerceOrderIdUnsafeSupplier) {

		try {
			commerceOrderId = commerceOrderIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long commerceOrderId;

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public void setCreateDate(
		UnsafeSupplier<Date, Exception> createDateUnsafeSupplier) {

		try {
			createDate = createDateUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Date createDate;

	public Number getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(Number discountAmount) {
		this.discountAmount = discountAmount;
	}

	public void setDiscountAmount(
		UnsafeSupplier<Number, Exception> discountAmountUnsafeSupplier) {

		try {
			discountAmount = discountAmountUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Number discountAmount;

	public Number getDuePerMonthAmount() {
		return duePerMonthAmount;
	}

	public void setDuePerMonthAmount(Number duePerMonthAmount) {
		this.duePerMonthAmount = duePerMonthAmount;
	}

	public void setDuePerMonthAmount(
		UnsafeSupplier<Number, Exception> duePerMonthAmountUnsafeSupplier) {

		try {
			duePerMonthAmount = duePerMonthAmountUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Number duePerMonthAmount;

	public Number getDueTodayAmount() {
		return dueTodayAmount;
	}

	public void setDueTodayAmount(Number dueTodayAmount) {
		this.dueTodayAmount = dueTodayAmount;
	}

	public void setDueTodayAmount(
		UnsafeSupplier<Number, Exception> dueTodayAmountUnsafeSupplier) {

		try {
			dueTodayAmount = dueTodayAmountUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Number dueTodayAmount;

	public String getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(String grandTotal) {
		this.grandTotal = grandTotal;
	}

	public void setGrandTotal(
		UnsafeSupplier<String, Exception> grandTotalUnsafeSupplier) {

		try {
			grandTotal = grandTotalUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String grandTotal;

	public OrderItem[] getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(OrderItem[] orderItems) {
		this.orderItems = orderItems;
	}

	public void setOrderItems(
		UnsafeSupplier<OrderItem[], Exception> orderItemsUnsafeSupplier) {

		try {
			orderItems = orderItemsUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected OrderItem[] orderItems;

	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	public void setOrderStatus(
		UnsafeSupplier<Integer, Exception> orderStatusUnsafeSupplier) {

		try {
			orderStatus = orderStatusUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Integer orderStatus;

	public Number getShippingChargeAmount() {
		return shippingChargeAmount;
	}

	public void setShippingChargeAmount(Number shippingChargeAmount) {
		this.shippingChargeAmount = shippingChargeAmount;
	}

	public void setShippingChargeAmount(
		UnsafeSupplier<Number, Exception> shippingChargeAmountUnsafeSupplier) {

		try {
			shippingChargeAmount = shippingChargeAmountUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Number shippingChargeAmount;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public void setUserId(
		UnsafeSupplier<Integer, Exception> userIdUnsafeSupplier) {

		try {
			userId = userIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Integer userId;

	@Override
	public Order clone() throws CloneNotSupportedException {
		return (Order)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Order)) {
			return false;
		}

		Order order = (Order)object;

		return Objects.equals(toString(), order.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return OrderSerDes.toJSON(this);
	}

}