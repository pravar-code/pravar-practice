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
@GraphQLName("OrderItem")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "OrderItem")
public class OrderItem implements Serializable {

	public static OrderItem toDTO(String json) {
		return ObjectMapperUtil.readValue(OrderItem.class, json);
	}

	public static OrderItem unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(OrderItem.class, json);
	}

	@Schema
	public Long getCpDefinitionId() {
		return cpDefinitionId;
	}

	public void setCpDefinitionId(Long cpDefinitionId) {
		this.cpDefinitionId = cpDefinitionId;
	}

	@JsonIgnore
	public void setCpDefinitionId(
		UnsafeSupplier<Long, Exception> cpDefinitionIdUnsafeSupplier) {

		try {
			cpDefinitionId = cpDefinitionIdUnsafeSupplier.get();
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
	protected Long cpDefinitionId;

	@Schema
	public Long getCpInstanceId() {
		return cpInstanceId;
	}

	public void setCpInstanceId(Long cpInstanceId) {
		this.cpInstanceId = cpInstanceId;
	}

	@JsonIgnore
	public void setCpInstanceId(
		UnsafeSupplier<Long, Exception> cpInstanceIdUnsafeSupplier) {

		try {
			cpInstanceId = cpInstanceIdUnsafeSupplier.get();
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
	protected Long cpInstanceId;

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
	public Long getGiftCharge() {
		return giftCharge;
	}

	public void setGiftCharge(Long giftCharge) {
		this.giftCharge = giftCharge;
	}

	@JsonIgnore
	public void setGiftCharge(
		UnsafeSupplier<Long, Exception> giftChargeUnsafeSupplier) {

		try {
			giftCharge = giftChargeUnsafeSupplier.get();
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
	protected Long giftCharge;

	@Schema
	public String getGiftMessage() {
		return giftMessage;
	}

	public void setGiftMessage(String giftMessage) {
		this.giftMessage = giftMessage;
	}

	@JsonIgnore
	public void setGiftMessage(
		UnsafeSupplier<String, Exception> giftMessageUnsafeSupplier) {

		try {
			giftMessage = giftMessageUnsafeSupplier.get();
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
	protected String giftMessage;

	@Schema
	@Valid
	public Number getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Number itemPrice) {
		this.itemPrice = itemPrice;
	}

	@JsonIgnore
	public void setItemPrice(
		UnsafeSupplier<Number, Exception> itemPriceUnsafeSupplier) {

		try {
			itemPrice = itemPriceUnsafeSupplier.get();
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
	protected Number itemPrice;

	@Schema
	public Long getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(Long orderItemId) {
		this.orderItemId = orderItemId;
	}

	@JsonIgnore
	public void setOrderItemId(
		UnsafeSupplier<Long, Exception> orderItemIdUnsafeSupplier) {

		try {
			orderItemId = orderItemIdUnsafeSupplier.get();
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
	protected Long orderItemId;

	@Schema
	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	@JsonIgnore
	public void setProductName(
		UnsafeSupplier<String, Exception> productNameUnsafeSupplier) {

		try {
			productName = productNameUnsafeSupplier.get();
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
	protected String productName;

	@Schema
	public Long getQuantity() {
		return quantity;
	}

	public void setQuantity(Long quantity) {
		this.quantity = quantity;
	}

	@JsonIgnore
	public void setQuantity(
		UnsafeSupplier<Long, Exception> quantityUnsafeSupplier) {

		try {
			quantity = quantityUnsafeSupplier.get();
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
	protected Long quantity;

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
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (cpDefinitionId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"cpDefinitionId\": ");

			sb.append(cpDefinitionId);
		}

		if (cpInstanceId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"cpInstanceId\": ");

			sb.append(cpInstanceId);
		}

		if (dueTodayAmount != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dueTodayAmount\": ");

			sb.append(dueTodayAmount);
		}

		if (giftCharge != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"giftCharge\": ");

			sb.append(giftCharge);
		}

		if (giftMessage != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"giftMessage\": ");

			sb.append("\"");

			sb.append(_escape(giftMessage));

			sb.append("\"");
		}

		if (itemPrice != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"itemPrice\": ");

			sb.append(itemPrice);
		}

		if (orderItemId != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"orderItemId\": ");

			sb.append(orderItemId);
		}

		if (productName != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"productName\": ");

			sb.append("\"");

			sb.append(_escape(productName));

			sb.append("\"");
		}

		if (quantity != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"quantity\": ");

			sb.append(quantity);
		}

		sb.append("}");

		return sb.toString();
	}

	@Schema(
		accessMode = Schema.AccessMode.READ_ONLY,
		defaultValue = "zain.headless.userorder.list.dto.v1_0.OrderItem",
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