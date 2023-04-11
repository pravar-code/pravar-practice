package zain.headless.userorder.list.client.dto.v1_0;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

import zain.headless.userorder.list.client.dto.v1_0.Order;
import zain.headless.userorder.list.client.function.UnsafeSupplier;
import zain.headless.userorder.list.client.serdes.v1_0.DataSerDes;

/**
 * @author User
 * @generated
 */
@Generated("")
public class Data implements Cloneable, Serializable {

	public static Data toDTO(String json) {
		return DataSerDes.toDTO(json);
	}

	public Order[] getOrders() {
		return orders;
	}

	public void setOrders(Order[] orders) {
		this.orders = orders;
	}

	public void setOrders(
		UnsafeSupplier<Order[], Exception> ordersUnsafeSupplier) {

		try {
			orders = ordersUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Order[] orders;

	@Override
	public Data clone() throws CloneNotSupportedException {
		return (Data)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Data)) {
			return false;
		}

		Data data = (Data)object;

		return Objects.equals(toString(), data.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return DataSerDes.toJSON(this);
	}

}