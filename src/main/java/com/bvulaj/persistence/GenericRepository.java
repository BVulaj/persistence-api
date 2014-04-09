/**
 * 
 */
package com.bvulaj.persistence;

import java.io.Serializable;
import java.util.List;

import com.bvulaj.persistence.exception.RepositoryException;

/**
 * @author Brandon Vulaj
 * 
 */
public interface GenericRepository<T, K extends Serializable> {

	T find(K id) throws RepositoryException;

	List<T> findAll() throws RepositoryException;

	List<T> findSimilar(T obj) throws RepositoryException;

	T findUnique(T obj) throws RepositoryException;

	long count() throws RepositoryException;

	long countSimilar(T obj) throws RepositoryException;

	void store(T obj) throws RepositoryException;

	void update(T obj) throws RepositoryException;

	void delete(T obj) throws RepositoryException;

	void deleteSimilar(T obj) throws RepositoryException;

	void deleteAll() throws RepositoryException;
}
