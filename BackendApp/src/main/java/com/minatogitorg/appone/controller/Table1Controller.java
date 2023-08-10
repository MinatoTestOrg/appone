package com.minatogitorg.appone.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.ext.XLogger;
import org.slf4j.ext.XLoggerFactory;
import org.springframework.http.ResponseEntity;
import com.vs.rappit.base.factory.InstanceFactory;
import com.minatogitorg.appone.base.controller.Table1BaseController;
import com.minatogitorg.appone.service.ITable1Service;
import com.minatogitorg.appone.service.Table1Service;
import com.minatogitorg.appone.model.Table1;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "rest/table1s/", produces = "application/json")
public class Table1Controller extends Table1BaseController<ITable1Service<Table1>, Table1> {
	private static XLogger LOGGER = XLoggerFactory.getXLogger(Table1Controller.class);
	public Table1Controller(Table1Service table1Service) {
		super(table1Service);
	}
}
