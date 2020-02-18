package com.mtit.service;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;

import com.mtit.service.ServicePublish;
import com.mtit.service.ServicePublishImpl;

public class ServiceActivator implements BundleActivator {

	ServiceRegistration publishServiceRegistration;

	@Override
	public void start(BundleContext context) throws Exception {

		System.out.println("Publisher Start");
		ServicePublish publisherService = new ServicePublishImpl();
		publishServiceRegistration = context.registerService(
				ServicePublish.class.getName(), publisherService, null);
	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Publisher Stop");
		publishServiceRegistration.unregister();
	}
}
