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

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author User
 * @generated
 */
@Generated("")
@GraphQLName("Resuest")
@JsonFilter("Liferay.Vulcan")
@XmlRootElement(name = "Resuest")
public class Resuest implements Serializable {

	public static Resuest toDTO(String json) {
		return ObjectMapperUtil.readValue(Resuest.class, json);
	}

	public static Resuest unsafeToDTO(String json) {
		return ObjectMapperUtil.unsafeReadValue(Resuest.class, json);
	}

	@Schema(example = "10")
	public Integer getEnd() {
		return end;
	}

	public void setEnd(Integer end) {
		this.end = end;
	}

	@JsonIgnore
	public void setEnd(UnsafeSupplier<Integer, Exception> endUnsafeSupplier) {
		try {
			end = endUnsafeSupplier.get();
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
	protected Integer end;

	@Schema
	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	@JsonIgnore
	public void setFromDate(
		UnsafeSupplier<String, Exception> fromDateUnsafeSupplier) {

		try {
			fromDate = fromDateUnsafeSupplier.get();
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
	protected String fromDate;

	@Schema
	public String getRequestType() {
		return requestType;
	}

	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}

	@JsonIgnore
	public void setRequestType(
		UnsafeSupplier<String, Exception> requestTypeUnsafeSupplier) {

		try {
			requestType = requestTypeUnsafeSupplier.get();
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
	protected String requestType;

	@Schema
	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	@JsonIgnore
	public void setServiceName(
		UnsafeSupplier<String, Exception> serviceNameUnsafeSupplier) {

		try {
			serviceName = serviceNameUnsafeSupplier.get();
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
	protected String serviceName;

	@Schema(example = "1")
	public Integer getStart() {
		return start;
	}

	public void setStart(Integer start) {
		this.start = start;
	}

	@JsonIgnore
	public void setStart(
		UnsafeSupplier<Integer, Exception> startUnsafeSupplier) {

		try {
			start = startUnsafeSupplier.get();
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
	protected Integer start;

	@Schema
	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

	@JsonIgnore
	public void setToDate(
		UnsafeSupplier<String, Exception> toDateUnsafeSupplier) {

		try {
			toDate = toDateUnsafeSupplier.get();
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
	protected String toDate;

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
		StringBundler sb = new StringBundler();

		sb.append("{");

		if (end != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"end\": ");

			sb.append(end);
		}

		if (fromDate != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"fromDate\": ");

			sb.append("\"");

			sb.append(_escape(fromDate));

			sb.append("\"");
		}

		if (requestType != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"requestType\": ");

			sb.append("\"");

			sb.append(_escape(requestType));

			sb.append("\"");
		}

		if (serviceName != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"serviceName\": ");

			sb.append("\"");

			sb.append(_escape(serviceName));

			sb.append("\"");
		}

		if (start != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"start\": ");

			sb.append(start);
		}

		if (toDate != null) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append("\"toDate\": ");

			sb.append("\"");

			sb.append(_escape(toDate));

			sb.append("\"");
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
		defaultValue = "zain.headless.userorder.list.dto.v1_0.Resuest",
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