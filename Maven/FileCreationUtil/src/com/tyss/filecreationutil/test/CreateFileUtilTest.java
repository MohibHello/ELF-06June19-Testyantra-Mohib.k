package com.tyss.filecreationutil.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.tyss.filecreationutil.util.CreateFileUtil;

public class CreateFileUtilTest {

	CreateFileUtil ref = new CreateFileUtil();

	@Test
	public void createFileTest() {

		boolean actual = ref.createFile("hello.txt", "this is the data");
		boolean expected = true;

		assertEquals(expected, actual);
	}
}
