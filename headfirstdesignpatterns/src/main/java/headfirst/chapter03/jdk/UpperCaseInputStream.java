package headfirst.chapter03.jdk;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class UpperCaseInputStream extends FilterInputStream {

	public UpperCaseInputStream(InputStream in) {
		super(in);
	}

	@Override
	public int read() throws IOException {
		int c = super.read();
		return (c == -1 ? c : Character.toUpperCase((char) c));
	}

	@Override
	public int read(byte[] b, int offset, int len) throws IOException {

		int byteSize = super.read(b, offset, len);

		for (int i = offset; i < offset + byteSize; i++) {
			b[i] = (byte) Character.toUpperCase((char) b[i]);
		}
		return byteSize;
	}

}
