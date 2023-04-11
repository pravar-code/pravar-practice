package zain.headless.userorder.list.client.serdes.v1_0;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TreeMap;

import javax.annotation.Generated;

import zain.headless.userorder.list.client.dto.v1_0.Resuest;
import zain.headless.userorder.list.client.json.BaseJSONParser;

/**
 * @author User
 * @generated
 */
@Generated("")
public class ResuestSerDes {

	public static Resuest toDTO(String json) {
		ResuestJSONParser resuestJSONParser = new ResuestJSONParser();

		return resuestJSONParser.parseToDTO(json);
	}

	public static Resuest[] toDTOs(String json) {
		ResuestJSONParser resuestJSONParser = new ResuestJSONParser();

		return resuestJSONParser.parseToDTOs(json);
	}

	public static String toJSON(Resuest resuest) {
		if (resuest == null) {
			return "null";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		if (resuest.getEnd() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"end\": ");

			sb.append(resuest.getEnd());
		}

		if (resuest.getFromDate() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"fromDate\": ");

			sb.append("\"");

			sb.append(_escape(resuest.getFromDate()));

			sb.append("\"");
		}

		if (resuest.getRequestType() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"requestType\": ");

			sb.append("\"");

			sb.append(_escape(resuest.getRequestType()));

			sb.append("\"");
		}

		if (resuest.getServiceName() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"serviceName\": ");

			sb.append("\"");

			sb.append(_escape(resuest.getServiceName()));

			sb.append("\"");
		}

		if (resuest.getStart() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"start\": ");

			sb.append(resuest.getStart());
		}

		if (resuest.getToDate() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"toDate\": ");

			sb.append("\"");

			sb.append(_escape(resuest.getToDate()));

			sb.append("\"");
		}

		if (resuest.getUserId() != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"userId\": ");

			sb.append(resuest.getUserId());
		}

		sb.append("}");

		return sb.toString();
	}

	public static Map<String, Object> toMap(String json) {
		ResuestJSONParser resuestJSONParser = new ResuestJSONParser();

		return resuestJSONParser.parseToMap(json);
	}

	public static Map<String, String> toMap(Resuest resuest) {
		if (resuest == null) {
			return null;
		}

		Map<String, String> map = new TreeMap<>();

		if (resuest.getEnd() == null) {
			map.put("end", null);
		}
		else {
			map.put("end", String.valueOf(resuest.getEnd()));
		}

		if (resuest.getFromDate() == null) {
			map.put("fromDate", null);
		}
		else {
			map.put("fromDate", String.valueOf(resuest.getFromDate()));
		}

		if (resuest.getRequestType() == null) {
			map.put("requestType", null);
		}
		else {
			map.put("requestType", String.valueOf(resuest.getRequestType()));
		}

		if (resuest.getServiceName() == null) {
			map.put("serviceName", null);
		}
		else {
			map.put("serviceName", String.valueOf(resuest.getServiceName()));
		}

		if (resuest.getStart() == null) {
			map.put("start", null);
		}
		else {
			map.put("start", String.valueOf(resuest.getStart()));
		}

		if (resuest.getToDate() == null) {
			map.put("toDate", null);
		}
		else {
			map.put("toDate", String.valueOf(resuest.getToDate()));
		}

		if (resuest.getUserId() == null) {
			map.put("userId", null);
		}
		else {
			map.put("userId", String.valueOf(resuest.getUserId()));
		}

		return map;
	}

	public static class ResuestJSONParser extends BaseJSONParser<Resuest> {

		@Override
		protected Resuest createDTO() {
			return new Resuest();
		}

		@Override
		protected Resuest[] createDTOArray(int size) {
			return new Resuest[size];
		}

		@Override
		protected void setField(
			Resuest resuest, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "end")) {
				if (jsonParserFieldValue != null) {
					resuest.setEnd(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "fromDate")) {
				if (jsonParserFieldValue != null) {
					resuest.setFromDate((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "requestType")) {
				if (jsonParserFieldValue != null) {
					resuest.setRequestType((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "serviceName")) {
				if (jsonParserFieldValue != null) {
					resuest.setServiceName((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "start")) {
				if (jsonParserFieldValue != null) {
					resuest.setStart(
						Integer.valueOf((String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "toDate")) {
				if (jsonParserFieldValue != null) {
					resuest.setToDate((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "userId")) {
				if (jsonParserFieldValue != null) {
					resuest.setUserId(
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