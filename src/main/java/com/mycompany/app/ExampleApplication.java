package com.mycompany.app;

import io.sinistral.proteus.ProteusApplication;

public class ExampleApplication extends ProteusApplication
{
	public static void main(String[] args)
	{
			ExampleApplication app = new ExampleApplication();
			app.addService(io.sinistral.proteus.services.SwaggerService.class);
			app.addService(io.sinistral.proteus.services.AssetsService.class);
			app.addController(Examples.class);
			app.start();
	}
}
