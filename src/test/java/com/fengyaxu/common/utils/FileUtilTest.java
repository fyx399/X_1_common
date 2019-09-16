package com.fengyaxu.common.utils;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;

import com.fengyaxu.utils.FileUtil;

public class FileUtilTest {
	@Test
	public void testGetExtendName() {
		String str="test.doc.jpg";
		String string = FileUtil.getExtendName(str);
		System.out.println(string);
	}

	@Test
	public void testGetTempDirectory() {
		File file = FileUtil.getTempDirectory();
		System.out.println(file);
	}

	@Test
	public void testGetUserDirectory() {
		File file = FileUtil.getUserDirectory();
		System.out.println(file);
	}
}
