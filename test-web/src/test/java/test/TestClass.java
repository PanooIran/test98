package test;

import javax.inject.Inject;

import junit.framework.Assert;
import junit.framework.TestCase;
import ui.UiBean;

public class TestClass extends TestCase{
/*	@Inject
	private UiBean uiBean;*/
	
	public void test1() {
		Assert.assertEquals("ali", UiBean.testSay());
	}
}
