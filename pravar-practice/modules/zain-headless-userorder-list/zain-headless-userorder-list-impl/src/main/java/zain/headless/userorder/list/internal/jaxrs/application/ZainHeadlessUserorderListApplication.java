package zain.headless.userorder.list.internal.jaxrs.application;

import javax.annotation.Generated;

import javax.ws.rs.core.Application;

import org.osgi.service.component.annotations.Component;

/**
 * @author User
 * @generated
 */
@Component(
	property = {
		"liferay.jackson=false",
		"osgi.jaxrs.application.base=/zain-headless-userorder-list",
		"osgi.jaxrs.extension.select=(osgi.jaxrs.name=Liferay.Vulcan)",
		"osgi.jaxrs.name=ZainHeadlessUserorderList"
	},
	service = Application.class
)
@Generated("")
public class ZainHeadlessUserorderListApplication extends Application {
}