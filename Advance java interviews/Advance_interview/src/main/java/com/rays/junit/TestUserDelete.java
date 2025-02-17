package com.rays.junit;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestUserDelete {

	@Test
	public void delete() throws Exception {
		
		UserModel.delete(13);

		UserBean bean = UserModel.findByPk(13);

		assertNull("user is not null", bean);
	//	assertTrue("is not delete", bean == null);
	}
}