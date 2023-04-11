package zain.headless.userorder.list.client.dto.v1_0;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

import zain.headless.userorder.list.client.function.UnsafeSupplier;
import zain.headless.userorder.list.client.serdes.v1_0.OrderItemSerDes;

/**
 * @author User
 * @generated
 */
@Generated("")
public class OrderItem implements Cloneable, Serializable {

	public static OrderItem toDTO(String json) {
		return OrderItemSerDes.toDTO(json);
	}

	public Long getCpDefinitionId() {
		return cpDefinitionId;
	}

	public void setCpDefinitionId(Long cpDefinitionId) {
		this.cpDefinitionId = cpDefinitionId;
	}

	public void setCpDefinitionId(
		UnsafeSupplier<Long, Exception> cpDefinitionIdUnsafeSupplier) {

		try {
			cpDefinitionId = cpDefinitionIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long cpDefinitionId;

	public Long getCpInstanceId() {
		return cpInstanceId;
	}

	public void setCpInstanceId(Long cpInstanceId) {
		this.cpInstanceId = cpInstanceId;
	}

	public void setCpInstanceId(
		UnsafeSupplier<Long, Exception> cpInstanceIdUnsafeSupplier) {

		try {
			cpInstanceId = cpInstanceIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long cpInstanceId;

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

	public Long getGiftCharge() {
		return giftCharge;
	}

	public void setGiftCharge(Long giftCharge) {
		this.giftCharge = giftCharge;
	}

	public void setGiftCharge(
		UnsafeSupplier<Long, Exception> giftChargeUnsafeSupplier) {

		try {
			giftCharge = giftChargeUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long giftCharge;

	public String getGiftMessage() {
		return giftMessage;
	}

	public void setGiftMessage(String giftMessage) {
		this.giftMessage = giftMessage;
	}

	public void setGiftMessage(
		UnsafeSupplier<String, Exception> giftMessageUnsafeSupplier) {

		try {
			giftMessage = giftMessageUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String giftMessage;

	public Number getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Number itemPrice) {
		this.itemPrice = itemPrice;
	}

	public void setItemPrice(
		UnsafeSupplier<Number, Exception> itemPriceUnsafeSupplier) {

		try {
			itemPrice = itemPriceUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Number itemPrice;

	public Long getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(Long orderItemId) {
		this.orderItemId = orderItemId;
	}

	public void setOrderItemId(
		UnsafeSupplier<Long, Exception> orderItemIdUnsafeSupplier) {

		try {
			orderItemId = orderItemIdUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long orderItemId;

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setProductName(
		UnsafeSupplier<String, Exception> productNameUnsafeSupplier) {

		try {
			productName = productNameUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String productName;

	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	public void setQuantity(
		UnsafeSupplier<Long, Exception> quantityUnsafeSupplier) {

		try {
			quantity = quantityUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Long quantity;

	@Override
	public OrderItem clone() throws CloneNotSupportedException {
		return (OrderItem)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof OrderItem)) {
			return false;
		}

		OrderItem orderItem = (OrderItem)object;

		return Objects.equals(toString(), orderItem.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return OrderItemSerDes.toJSON(this);
	}

}