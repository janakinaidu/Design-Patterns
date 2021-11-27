package com.naidu;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class SingleTone implements Cloneable, Serializable {

	private static final long serialVersionUID = 1L;
	private static SingleTone singleTone = null;

	private SingleTone() {

	}

	public static SingleTone getInstance() {
		if (singleTone == null) {
			synchronized (SingleTone.class) {
				if (singleTone == null) {
					singleTone = new SingleTone();
				}
			}
		}
		return singleTone;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}

	private Object readResolve() throws ObjectStreamException {
		return singleTone;
	}

}
