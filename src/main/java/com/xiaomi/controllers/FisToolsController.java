package com.xiaomi.controllers;

import net.paoding.rose.web.Invocation;
import net.paoding.rose.web.annotation.Path;
import net.paoding.rose.web.annotation.rest.Get;

@Path("/fis")
public class FisToolsController {
	@Get("")
	public Object test(Invocation inv) throws Exception {
		return "../WEB-INF/views/home/page/index.vm";
	}
}
