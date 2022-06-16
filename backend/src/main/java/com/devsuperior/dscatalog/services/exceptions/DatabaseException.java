package com.devsuperior.dscatalog.services.exceptions;

public class DatabaseException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	
	public DatabaseException(String msg) {
		//repassar o argumento para a super classe
		super(msg);
	}

}
