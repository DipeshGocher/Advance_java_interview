package com.rays.junit;

import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestUserAdd {

	@Test
	public void testAdd() throws Exception {

		UserBean bean = new UserBean();
		bean.setId(19);
		bean.setName("rishab");
		bean.setSalary(5000);

		UserModel model = new UserModel();

		model.add(bean);

		bean = model.findByPk(19);

		assertNotNull(bean);
   	//    assertTrue(bean == null);
//		assertFalse("is not true", bean != null);

	}

}