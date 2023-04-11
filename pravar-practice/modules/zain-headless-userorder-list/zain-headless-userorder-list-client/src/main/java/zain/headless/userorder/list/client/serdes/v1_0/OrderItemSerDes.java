package zain.headless.userorder.list.client.serdes.v1_0;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

import javax.annotation.Generated;

import zain.headless.userorder.list.client.dto.v1_0.OrderItem;
import zain.headless.userorder.list.client.json.BaseJSONParser;

/**
 * @author User
 * @generated
 */
@Generated("")
public class OrderItemSerDes {

	public static OrderItem toDTO(String json) {
		OrderItemJSONParser orderItemJSONParser = new OrderItemJSONParser();

		return orderItemJSONParser.parseToDTO(json);
	}

	public static OrderItem[] toDTOs(String json) {
		OrderItemJSONParser orderItemJSONParser = new OrderItemJSONParser();

		return orderItemJSONParser.parseToDTOs(json);
	}

	public static String toJSON(OrderItem orderItem) {
		if (orderItem == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (orderItem.getCpDefinitionId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"cpDefinitionId\": ");

			sb.append(orderItem.getCpDefinitionId());
		}

		if (orderItem.getCpInstanceId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"cpInstanceId\": ");

			sb.append(orderItem.getCpInstanceId());
		}

		if (orderItem.getDueTodayAmount() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"dueTodayAmount\": ");

			sb.append(orderItem.getDueTodayAmount());
		}

		if (orderItem.getGiftCharge() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"giftCharge\": ");

			sb.append(orderItem.getGiftCharge());
		}

		if (orderItem.getGiftMessage() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"giftMessage\": ");

			sb.append("\"");

			sb.append(_escape(orderItem.getGiftMessage()));

			sb.append("\"");
		}

		if (orderItem.getItemPrice() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"itemPrice\": ");

			sb.append(orderItem.getItemPrice());
		}

		if (orderItem.getOrderItemId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"orderItemId\": ");

			sb.append(orderItem.getOrderItemId());
		}

		if (orderItem.getProductName() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"productName\": ");

			sb.append("\"");

			sb.append(_escape(orderItem.getProductName()));

			sb.append("\"");
		}

		if (orderItem.getQuantity() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"quantity\": ");

			sb.append(orderItem.getQuantity());
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		OrderItemJSONParser orderItemJSONParser = new OrderItemJSONParser();

		return orderItemJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(OrderItem orderItem) {
		if (orderItem == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (orderItem.getCpDefinitionId() == null) {
			map.put("cpDefinitionId", null);
		}
		else {
			map.put(
				"cpDefinitionId",
				String.valueOf(orderItem.getCpDefinitionId()));
		}

		if (orderItem.getCpInstanceId() == null) {
			map.put("cpInstanceId", null);
		}
		else {
			map.put(
				"cpInstanceId", String.valueOf(orderItem.getCpInstanceId()));
		}

		if (orderItem.getDueTodayAmount() == null) {
			map.put("dueTodayAmount", null);
		}
		else {
			map.put(
				"dueTodayAmount",
				String.valueOf(orderItem.getDueTodayAmount()));
		}

		if (orderItem.getGiftCharge() == null) {
			map.put("giftCharge", null);
		}
		else {
			map.put("giftCharge", String.valueOf(orderItem.getGiftCharge()));
		}

		if (orderItem.getGiftMessage() == null) {
			map.put("giftMessage", null);
		}
		else {
			map.put("giftMessage", String.valueOf(orderItem.getGiftMessage()));
		}

		if (orderItem.getItemPrice() == null) {
			map.put("itemPrice", null);
		}
		else {
			map.put("itemPrice", String.valueOf(orderItem.getItemPrice()));
		}

		if (orderItem.getOrderItemId() == null) {
			map.put("orderItemId", null);
		}
		else {
			map.put("orderItemId", String.valueOf(orderItem.getOrderItemId()));
		}

		if (orderItem.getProductName() == null) {
			map.put("productName", null);
		}
		else {
			map.put("productName", String.valueOf(orderItem.getProductName()));
		}

		if (orderItem.getQuantity() == null) {
			map.put("quantity", null);
		}
		else {
			map.put("quantity", String.valueOf(orderItem.getQuantity()));
		}

		return map;
	}

	public static class OrderItemJSONParser extends BaseJSONParser<OrderItem> {

		@Override
		protected OrderItem createDTO() {
			return new OrderItem();
		}

		@Override
		protected OrderItem[] createDTOArray(int size) {
			return new OrderItem[size];
		}

		@Override
		protected void setField(
			OrderItem orderItem, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "cpDefinitionId")) {
				if (jsonParserFieldValue != null) {
					orderItem.setCpDefinitionId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "cpInstanceId")) {
				if (jsonParserFieldValue != null) {
					orderItem.setCpInstanceId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "dueTodayAmount")) {
				if (jsonParserFieldValue != null) {
					orderItem.setDueTodayAmount(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "giftCharge")) {
				if (jsonParserFieldValue != null) {
					orderItem.setGiftCharge(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "giftMessage")) {
				if (jsonParserFieldValue != null) {
					orderItem.setGiftMessage((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "itemPrice")) {
				if (jsonParserFieldValue != null) {
					orderItem.setItemPrice(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "orderItemId")) {
				if (jsonParserFieldValue != null) {
					orderItem.setOrderItemId(
						Long.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "productName")) {
				if (jsonParserFieldValue != null) {
					orderItem.setProductName((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "quantity")) {
				if (jsonParserFieldValue != null) {
					orderItem.setQuantity(
						Long.valueOf((String)jsonParserFieldValue));
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