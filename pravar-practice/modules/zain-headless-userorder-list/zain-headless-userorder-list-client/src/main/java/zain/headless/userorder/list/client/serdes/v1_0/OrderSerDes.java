package zain.headless.userorder.list.client.serdes.v1_0;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Stream;

import javax.annotation.Generated;

import zain.headless.userorder.list.client.dto.v1_0.Order;
import zain.headless.userorder.list.client.dto.v1_0.OrderItem;
import zain.headless.userorder.list.client.json.BaseJSONParser;

/**
 * @author User
 * @generated
 */
@Generated("")
public class OrderSerDes {

	public static Order toDTO(String json) {
		OrderJSONParser orderJSONParser = new OrderJSONParser();

		return orderJSONParser.parseToDTO(json);
	}

	public static Order[] toDTOs(String json) {
		OrderJSONParser orderJSONParser = new OrderJSONParser();

		return orderJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Order order) {
		if (order == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ssXX");

		if (order.getCommerceOrderId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"commerceOrderId\": ");

			sb.append(order.getCommerceOrderId());
		}

		if (order.getCreateDate() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"createDate\": ");

			sb.append("\"");

			sb.append(liferayToJSONDateFormat.format(order.getCreateDate()));

			sb.append("\"");
		}

		if (order.getDiscountAmount() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"discountAmount\": ");

			sb.append(order.getDiscountAmount());
		}

		if (order.getDuePerMonthAmount() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"duePerMonthAmount\": ");

			sb.append(order.getDuePerMonthAmount());
		}

		if (order.getDueTodayAmount() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dueTodayAmount\": ");

			sb.append(order.getDueTodayAmount());
		}

		if (order.getGrandTotal() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"grandTotal\": ");

			sb.append("\"");

			sb.append(_escape(order.getGrandTotal()));

			sb.append("\"");
		}

		if (order.getOrderItems() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"orderItems\": ");

			sb.append("[");

			for (int i = 0; i < order.getOrderItems().length; i++) {
				sb.append(String.valueOf(order.getOrderItems()[i]));

				if ((i + 1) < order.getOrderItems().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		if (order.getOrderStatus() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"orderStatus\": ");

			sb.append(order.getOrderStatus());
		}

		if (order.getShippingChargeAmount() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"shippingChargeAmount\": ");

			sb.append(order.getShippingChargeAmount());
		}

		if (order.getUserId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"userId\": ");

			sb.append(order.getUserId());
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		OrderJSONParser orderJSONParser = new OrderJSONParser();

		return orderJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(Order order) {
		if (order == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		DateFormat liferayToJSONDateFormat = new SimpleDateFormat(
			"yyyy-MM-dd'T'HH:mm:ssXX");

		if (order.getCommerceOrderId() == null) {
			map.put("commerceOrderId", null);
		}
		else {
			map.put(
				"commerceOrderId", String.valueOf(order.getCommerceOrderId()));
		}

		if (order.getCreateDate() == null) {
			map.put("createDate", null);
		}
		else {
			map.put(
				"createDate",
				liferayToJSONDateFormat.format(order.getCreateDate()));
		}

		if (order.getDiscountAmount() == null) {
			map.put("discountAmount", null);
		}
		else {
			map.put(
				"discountAmount", String.valueOf(order.getDiscountAmount()));
		}

		if (order.getDuePerMonthAmount() == null) {
			map.put("duePerMonthAmount", null);
		}
		else {
			map.put(
				"duePerMonthAmount",
				String.valueOf(order.getDuePerMonthAmount()));
		}

		if (order.getDueTodayAmount() == null) {
			map.put("dueTodayAmount", null);
		}
		else {
			map.put(
				"dueTodayAmount", String.valueOf(order.getDueTodayAmount()));
		}

		if (order.getGrandTotal() == null) {
			map.put("grandTotal", null);
		}
		else {
			map.put("grandTotal", String.valueOf(order.getGrandTotal()));
		}

		if (order.getOrderItems() == null) {
			map.put("orderItems", null);
		}
		else {
			map.put("orderItems", String.valueOf(order.getOrderItems()));
		}

		if (order.getOrderStatus() == null) {
			map.put("orderStatus", null);
		}
		else {
			map.put("orderStatus", String.valueOf(order.getOrderStatus()));
		}

		if (order.getShippingChargeAmount() == null) {
			map.put("shippingChargeAmount", null);
		}
		else {
			map.put(
				"shippingChargeAmount",
				String.valueOf(order.getShippingChargeAmount()));
		}

		if (order.getUserId() == null) {
			map.put("userId", null);
		}
		else {
			map.put("userId", String.valueOf(order.getUserId()));
		}

		return map;
	}

	public static class OrderJSONParser extends BaseJSONParser<Order> {

		@Override
		protected Order createDTO() {
			return new Order();
		}

		@Override
		protected Order[] createDTOArray(int size) {
			return new Order[size];
		}

		@Override
		protected void setField(
			Order order, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "commerceOrderId")) {
				if (jsonParserFieldValue != null) {
					order.setCommerceOrderId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "createDate")) {
				if (jsonParserFieldValue != null) {
					order.setCreateDate(toDate((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "discountAmount")) {
				if (jsonParserFieldValue != null) {
					order.setDiscountAmount(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "duePerMonthAmount")) {
				if (jsonParserFieldValue != null) {
					order.setDuePerMonthAmount(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "dueTodayAmount")) {
				if (jsonParserFieldValue != null) {
					order.setDueTodayAmount(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "grandTotal")) {
				if (jsonParserFieldValue != null) {
					order.setGrandTotal((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "orderItems")) {
				if (jsonParserFieldValue != null) {
					order.setOrderItems(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> OrderItemSerDes.toDTO((String)object)
						).toArray(
							size -> new OrderItem[size]
						));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "orderStatus")) {
				if (jsonParserFieldValue != null) {
					order.setOrderStatus(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(
						jsonParserFieldName, "shippingChargeAmount")) {

				if (jsonParserFieldValue != null) {
					order.setShippingChargeAmount(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "userId")) {
				if (jsonParserFieldValue != null) {
					order.setUserId(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
		}

	}

	private static String _escape(Object object) {
		String string = String.valueOf(object);

		for (String[] strings : BaseJSONParser.JSON_ESCAPE_STRINGS) {
			string = string.replace(strings[0], strings[1]);
		}

		return string;
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
			sb.append(entry.getKey());
			sb.append("\": ");

			Object value = entry.getValue();

			Class<?> valueClass = value.getClass();

			if (value instanceof Map) {
				sb.append(_toJSON((Map)value));
			}
			else if (valueClass.isArray()) {
				Object[] values = (Object[])value;

				sb.append("[");

				for (int i = 0; i < values.length; i++) {
					sb.append("\"");
					sb.append(_escape(values[i]));
					sb.append("\"");

					if ((i + 1) < values.length) {
						sb.append(", ");
					}
				}

				sb.append("]");
			}
			else if (value instanceof String) {
				sb.append("\"");
				sb.append(_escape(entry.getValue()));
				sb.append("\"");
			}
			else {
				sb.append(String.valueOf(entry.getValue()));
			}

			if (iterator.hasNext()) {
				sb.append(", ");
			}
		}

		sb.append("}");

		return sb.toString();
	}

}