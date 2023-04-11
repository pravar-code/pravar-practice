package zain.headless.userorder.list.client.serdes.v1_0;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Stream;

import javax.annotation.Generated;

import zain.headless.userorder.list.client.dto.v1_0.Data;
import zain.headless.userorder.list.client.dto.v1_0.Order;
import zain.headless.userorder.list.client.json.BaseJSONParser;

/**
 * @author User
 * @generated
 */
@Generated("")
public class DataSerDes {

	public static Data toDTO(String json) {
		DataJSONParser dataJSONParser = new DataJSONParser();

		return dataJSONParser.parseToDTO(json);
	}

	public static Data[] toDTOs(String json) {
		DataJSONParser dataJSONParser = new DataJSONParser();

		return dataJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Data data) {
		if (data == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (data.getOrders() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"orders\": ");

			sb.append("[");

			for (int i = 0; i < data.getOrders().length; i++) {
				sb.append(String.valueOf(data.getOrders()[i]));

				if ((i + 1) < data.getOrders().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		DataJSONParser dataJSONParser = new DataJSONParser();

		return dataJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(Data data) {
		if (data == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (data.getOrders() == null) {
			map.put("orders", null);
		}
		else {
			map.put("orders", String.valueOf(data.getOrders()));
		}

		return map;
	}

	public static class DataJSONParser extends BaseJSONParser<Data> {

		@Override
		protected Data createDTO() {
			return new Data();
		}

		@Override
		protected Data[] createDTOArray(int size) {
			return new Data[size];
		}

		@Override
		protected void setField(
			Data data, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "orders")) {
				if (jsonParserFieldValue != null) {
					data.setOrders(
						Stream.of(
							toStrings((Object[])jsonParserFieldValue)
						).map(
							object -> OrderSerDes.toDTO((String)object)
						).toArray(
							size -> new Order[size]
						));
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