package zain.headless.userorder.list.client.dto.v1_0;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

import zain.headless.userorder.list.client.dto.v1_0.Data;
import zain.headless.userorder.list.client.function.UnsafeSupplier;
import zain.headless.userorder.list.client.serdes.v1_0.UserOrderListSerDes;

/**
 * @author User
 * @generated
 */
@Generated("")
public class UserOrderList implements Cloneable, Serializable {

	public static UserOrderList toDTO(String json) {
		return UserOrderListSerDes.toDTO(json);
	}

	public Data getData() {
		return data;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public void setData(UnsafeSupplier<Data, Exception> dataUnsafeSupplier) {
		try {
			data = dataUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Data data;

	public Integer getEnd() {
		return end;
	}

	public void setEnd(Integer end) {
		this.end = end;
	}

	public void setEnd(UnsafeSupplier<Integer, Exception> endUnsafeSupplier) {
		try {
			end = endUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Integer end;

	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	public void setStart(
		UnsafeSupplier<Integer, Exception> startUnsafeSupplier) {

		try {
			start = startUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Integer start;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setStatus(
		UnsafeSupplier<String, Exception> statusUnsafeSupplier) {

		try {
			status = statusUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String status;

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public void setStatusCode(
		UnsafeSupplier<String, Exception> statusCodeUnsafeSupplier) {

		try {
			statusCode = statusCodeUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String statusCode;

	public String getStatusMessage() {
		return statusMessage;
	}

	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	public void setStatusMessage(
		UnsafeSupplier<String, Exception> statusMessageUnsafeSupplier) {

		try {
			statusMessage = statusMessageUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String statusMessage;

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public void setTotal(
		UnsafeSupplier<Integer, Exception> totalUnsafeSupplier) {

		try {
			total = totalUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected Integer total;

	@Override
	public UserOrderList clone() throws CloneNotSupportedException {
		return (UserOrderList)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof UserOrderList)) {
			return false;
		}

		UserOrderList userOrderList = (UserOrderList)object;

		return Objects.equals(toString(), userOrderList.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return UserOrderListSerDes.toJSON(this);
	}

}