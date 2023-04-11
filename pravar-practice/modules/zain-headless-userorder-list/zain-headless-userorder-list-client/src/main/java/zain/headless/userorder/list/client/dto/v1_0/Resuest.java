package zain.headless.userorder.list.client.dto.v1_0;

import java.io.Serializable;

import java.util.Objects;

import javax.annotation.Generated;

import zain.headless.userorder.list.client.function.UnsafeSupplier;
import zain.headless.userorder.list.client.serdes.v1_0.ResuestSerDes;

/**
 * @author User
 * @generated
 */
@Generated("")
public class Resuest implements Cloneable, Serializable {

	public static Resuest toDTO(String json) {
		return ResuestSerDes.toDTO(json);
	}

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

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public void setFromDate(
		UnsafeSupplier<String, Exception> fromDateUnsafeSupplier) {

		try {
			fromDate = fromDateUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String fromDate;

	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	public void setRequestType(
		UnsafeSupplier<String, Exception> requestTypeUnsafeSupplier) {

		try {
			requestType = requestTypeUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String requestType;

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public void setServiceName(
		UnsafeSupplier<String, Exception> serviceNameUnsafeSupplier) {

		try {
			serviceName = serviceNameUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String serviceName;

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

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	public void setToDate(
		UnsafeSupplier<String, Exception> toDateUnsafeSupplier) {

		try {
			toDate = toDateUnsafeSupplier.get();
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	protected String toDate;

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
	public Resuest clone() throws CloneNotSupportedException {
		return (Resuest)super.clone();
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Resuest)) {
			return false;
		}

		Resuest resuest = (Resuest)object;

		return Objects.equals(toString(), resuest.toString());
	}

	@Override
	public int hashCode() {
		String string = toString();

		return string.hashCode();
	}

	public String toString() {
		return ResuestSerDes.toJSON(this);
	}

}