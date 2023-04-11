package zain.headless.userorder.list.client.serdes.v1_0;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

import javax.annotation.Generated;

import zain.headless.userorder.list.client.dto.v1_0.UserOrderList;
import zain.headless.userorder.list.client.json.BaseJSONParser;

/**
 * @author User
 * @generated
 */
@Generated("")
public class UserOrderListSerDes {

	public static UserOrderList toDTO(String json) {
		UserOrderListJSONParser userOrderListJSONParser =
			new UserOrderListJSONParser();

		return userOrderListJSONParser.parseToDTO(json);
	}

	public static UserOrderList[] toDTOs(String json) {
		UserOrderListJSONParser userOrderListJSONParser =
			new UserOrderListJSONParser();

		return userOrderListJSONParser.parseToDTOs(json);
	}

	public static String toJSON(UserOrderList userOrderList) {
		if (userOrderList == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (userOrderList.getData() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"data\": ");

			sb.append(String.valueOf(userOrderList.getData()));
		}

		if (userOrderList.getEnd() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"end\": ");

			sb.append(userOrderList.getEnd());
		}

		if (userOrderList.getStart() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"start\": ");

			sb.append(userOrderList.getStart());
		}

		if (userOrderList.getStatus() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"status\": ");

			sb.append("\"");

			sb.append(_escape(userOrderList.getStatus()));

			sb.append("\"");
		}

		if (userOrderList.getStatusCode() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"statusCode\": ");

			sb.append("\"");

			sb.append(_escape(userOrderList.getStatusCode()));

			sb.append("\"");
		}

		if (userOrderList.getStatusMessage() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"statusMessage\": ");

			sb.append("\"");

			sb.append(_escape(userOrderList.getStatusMessage()));

			sb.append("\"");
		}

		if (userOrderList.getTotal() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"total\": ");

			sb.append(userOrderList.getTotal());
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		UserOrderListJSONParser userOrderListJSONParser =
			new UserOrderListJSONParser();

		return userOrderListJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(UserOrderList userOrderList) {
		if (userOrderList == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (userOrderList.getData() == null) {
			map.put("data", null);
		}
		else {
			map.put("data", String.valueOf(userOrderList.getData()));
		}

		if (userOrderList.getEnd() == null) {
			map.put("end", null);
		}
		else {
			map.put("end", String.valueOf(userOrderList.getEnd()));
		}

		if (userOrderList.getStart() == null) {
			map.put("start", null);
		}
		else {
			map.put("start", String.valueOf(userOrderList.getStart()));
		}

		if (userOrderList.getStatus() == null) {
			map.put("status", null);
		}
		else {
			map.put("status", String.valueOf(userOrderList.getStatus()));
		}

		if (userOrderList.getStatusCode() == null) {
			map.put("statusCode", null);
		}
		else {
			map.put(
				"statusCode", String.valueOf(userOrderList.getStatusCode()));
		}

		if (userOrderList.getStatusMessage() == null) {
			map.put("statusMessage", null);
		}
		else {
			map.put(
				"statusMessage",
				String.valueOf(userOrderList.getStatusMessage()));
		}

		if (userOrderList.getTotal() == null) {
			map.put("total", null);
		}
		else {
			map.put("total", String.valueOf(userOrderList.getTotal()));
		}

		return map;
	}

	public static class UserOrderListJSONParser
		extends BaseJSONParser<UserOrderList> {

		@Override
		protected UserOrderList createDTO() {
			return new UserOrderList();
		}

		@Override
		protected UserOrderList[] createDTOArray(int size) {
			return new UserOrderList[size];
		}

		@Override
		protected void setField(
			UserOrderList userOrderList, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "data")) {
				if (jsonParserFieldValue != null) {
					userOrderList.setData(
						DataSerDes.toDTO((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "end")) {
				if (jsonParserFieldValue != null) {
					userOrderList.setEnd(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "start")) {
				if (jsonParserFieldValue != null) {
					userOrderList.setStart(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "status")) {
				if (jsonParserFieldValue != null) {
					userOrderList.setStatus((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "statusCode")) {
				if (jsonParserFieldValue != null) {
					userOrderList.setStatusCode((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "statusMessage")) {
				if (jsonParserFieldValue != null) {
					userOrderList.setStatusMessage(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "total")) {
				if (jsonParserFieldValue != null) {
					userOrderList.setTotal(
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