package zain.headless.userorder.list.dto.v1_0;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.liferay.petra.function.UnsafeSupplier;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLField;
import com.liferay.portal.vulcan.graphql.annotation.GraphQLName;
import com.liferay.portal.vulcan.util.ObjectMapperUtil;

import io.swagger.v3.oas.annotations.media.Schema;

import java.io.Serializable;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.annotation.Generated;

import javax.validation.Valid;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author User
 * @generated
 */
@Generated("")
@GraphQLName("Order")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "Order")
public class Order implements Serializable {

	public static Order toDTO(String json) {
		return ObjectMapperUtil.readValue(Order.class, json);
	}

	public static Order unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(Order.class, json);
	}

	@Schema
	public Long getCommerceOrderId() {
		return commerceOrderId;
	}

	public void setCommerceOrderId(Long commerceOrderId) {
		this.commerceOrderId = commerceOrderId;
	}

	@JsonIgnore
	public void setCommerceOrderId(
		UnsafeSupplier<Long, Exception> commerceOrderIdUnsafeSupplier) {

		try {
			commerceOrderId = commerceOrderIdUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Long commerceOrderId;

	@Schema
	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	@JsonIgnore
	public void setCreateDate(
		UnsafeSupplier<Date, Exception> createDateUnsafeSupplier) {

		try {
			createDate = createDateUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Date createDate;

	@Schema
	@Valid
	public Number getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(Number discountAmount) {
		this.discountAmount = discountAmount;
	}

	@JsonIgnore
	public void setDiscountAmount(
		UnsafeSupplier<Number, Exception> discountAmountUnsafeSupplier) {

		try {
			discountAmount = discountAmountUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Number discountAmount;

	@Schema
	@Valid
	public Number getDuePerMonthAmount() {
		return duePerMonthAmount;
	}

	public void setDuePerMonthAmount(Number duePerMonthAmount) {
		this.duePerMonthAmount = duePerMonthAmount;
	}

	@JsonIgnore
	public void setDuePerMonthAmount(
		UnsafeSupplier<Number, Exception> duePerMonthAmountUnsafeSupplier) {

		try {
			duePerMonthAmount = duePerMonthAmountUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Number duePerMonthAmount;

	@Schema
	@Valid
	public Number getDueTodayAmount() {
		return dueTodayAmount;
	}

	public void setDueTodayAmount(Number dueTodayAmount) {
		this.dueTodayAmount = dueTodayAmount;
	}

	@JsonIgnore
	public void setDueTodayAmount(
		UnsafeSupplier<Number, Exception> dueTodayAmountUnsafeSupplier) {

		try {
			dueTodayAmount = dueTodayAmountUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Number dueTodayAmount;

	@Schema
	public String getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(String grandTotal) {
		this.grandTotal = grandTotal;
	}

	@JsonIgnore
	public void setGrandTotal(
		UnsafeSupplier<String, Exception> grandTotalUnsafeSupplier) {

		try {
			grandTotal = grandTotalUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected String grandTotal;

	@Schema
	@Valid
	public OrderItem[] getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(OrderItem[] orderItems) {
		this.orderItems = orderItems;
	}

	@JsonIgnore
	public void setOrderItems(
		UnsafeSupplier<OrderItem[], Exception> orderItemsUnsafeSupplier) {

		try {
			orderItems = orderItemsUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected OrderItem[] orderItems;

	@Schema
	public Integer getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

	@JsonIgnore
	public void setOrderStatus(
		UnsafeSupplier<Integer, Exception> orderStatusUnsafeSupplier) {

		try {
			orderStatus = orderStatusUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Integer orderStatus;

	@Schema
	@Valid
	public Number getShippingChargeAmount() {
		return shippingChargeAmount;
	}

	public void setShippingChargeAmount(Number shippingChargeAmount) {
		this.shippingChargeAmount = shippingChargeAmount;
	}

	@JsonIgnore
	public void setShippingChargeAmount(
		UnsafeSupplier<Number, Exception> shippingChargeAmountUnsafeSupplier) {

		try {
			shippingChargeAmount = shippingChargeAmountUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Number shippingChargeAmount;

	@Schema
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@JsonIgnore
	public void setUserId(
		UnsafeSupplier<Integer, Exception> userIdUnsafeSupplier) {

		try {
			userId = userIdUnsafeSupplier.get();
		}
		catch (RuntimeException re) {
			throw re;
		}
		catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@GraphQLField
	@JsonProperty(access = JsonProperty.Access.READ_WRITE)
	protected Integer userId;

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
		StringBundler sb = new StringBundler();

		sb.append("{");

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ss'Z'");

		if (commerceOrderId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"commerceOrderId\": ");

			sb.append(commerceOrderId);
		}

		if (createDate != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"createDate\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(createDate));

			sb.append("\"");
		}

		if (discountAmount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"discountAmount\": ");

			sb.append(discountAmount);
		}

		if (duePerMonthAmount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"duePerMonthAmount\": ");

			sb.append(duePerMonthAmount);
		}

		if (dueTodayAmount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dueTodayAmount\": ");

			sb.append(dueTodayAmount);
		}

		if (grandTotal != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"grandTotal\": ");

			sb.append("\"");

			sb.append(_escape(grandTotal));

			sb.append("\"");
		}

		if (orderItems != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"orderItems\": ");

			sb.append("[");

			for (int i = 0; i < orderItems.length; i++) {
				sb.append(String.valueOf(orderItems[i]));

				if ((i + 1) < orderItems.length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (orderStatus != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"orderStatus\": ");

			sb.append(orderStatus);
		}

		if (shippingChargeAmount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shippingChargeAmount\": ");

			sb.append(shippingChargeAmount);
		}

		if (userId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"userId\": ");

			sb.append(userId);
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "zain.headless.userorder.list.dto.v1_0.Order",
		name = "x-class-name"
	)
	public String xClassName;

	private static String _escape(Object object) {
		return StringUtil.replace(
			String.valueOf(object), _JSON_ESCAPE_STRINGS[0],
			_JSON_ESCAPE_STRINGS[1]);
	}

	private static boolean _isArray(Object value) {
		if (value == null) {
			return false;
		}

		Class<?> clazz = value.getClass();

		return clazz.isArray();
	}

	private static String _toJSON(Map<String, ?> map) {
		StringBuilder sb = new StringBuilder("{");

		@SuppressWarnings("unchecked")
		Set set = map.entrySet();

		@SuppressWarnings("unchecked")
		Iterator<Map.Entry<String, ?>> iterator = set.iterator();

		while (iterator.hasNext()) {
			Map.Entry<String, ?> entry = iterator.next();

			sb.append("\"");
			sb.append(_escape(entry.getKey()));
			sb.append("\": ");

			Object value = entry.getValue();

			if (_isArray(value)) {
				sb.append("[");

				Object[] valueArray = (Object[])value;

				for (int i = 0; i < valueArray.length; i++) {
					if (valueArray[i] instanceof String) {
						sb.append("\"");
						sb.append(valueArray[i]);
						sb.append("\"");
					}
					else {
						sb.append(valueArray[i]);
					}

					if ((i + 1) < valueArray.length) {
						sb.append(", ");
					}
				}

				sb.append("]");
			}
			else if (value instanceof Map) {
				sb.append(_toJSON((Map<String, ?>)value));
			}
			else if (value instanceof String) {
				sb.append("\"");
				sb.append(_escape(value));
				sb.append("\"");
			}
			else {
				sb.append(value);
			}

			if (iterator.hasNext()) {
				sb.append(", ");
			}
		}

		sb.append("}");

		return sb.toString();
	}

	private static final String[][] _JSON_ESCAPE_STRINGS = {
		{"\\", "\"", "\b", "\f", "\n", "\r", "\t"},
		{"\\\\", "\\\"", "\\b", "\\f", "\\n", "\\r", "\\t"}
	};

}