package com.java.vec.util;

import java.io.*;

public class ReadWriteFile {

	/**
	 * 将指定内容写入指定文件
	 * 
	 * @param file
	 * @param content
	 * @throws IOException
	 */
	public static void writeFile(String file, String content)
			throws IOException {

		File result = new File(file);
		OutputStream out = new FileOutputStream(result, false);
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(out,
				"utf-8"));

		bw.write(content);

		bw.close();
		out.close();
	}

}
