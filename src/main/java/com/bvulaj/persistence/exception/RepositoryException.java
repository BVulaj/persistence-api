/**
 * 
 */
package com.bvulaj.persistence.exception;

/**
 * @author Brandon Vulaj
 * 
 */
public class RepositoryException extends Exception {

	private static final long serialVersionUID = 2839133387709691544L;

	/**
	 * @param message
	 */
	public RepositoryException(String message) {
		super(message);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public RepositoryException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param cause
	 */
	public RepositoryException(Throwable cause) {
		super(cause);
	}

}
