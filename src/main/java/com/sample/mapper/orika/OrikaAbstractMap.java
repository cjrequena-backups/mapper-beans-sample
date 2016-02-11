
package com.sample.mapper.orika;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import ma.glasnost.orika.MapperFacade;

/**
 * @author crequena
 * 
 * 
 *         Common mapping methods.
 */
public abstract class OrikaAbstractMap {

	protected abstract MapperFacade getMapper();

	protected <S, T> T map(S source, Class<T> targetClass) {
		return getMapper().map(source, targetClass);
	}

	protected <S, T> List<T> map(Collection<S> sources, Class<T> targetClass) {
		List<T> targets = new ArrayList<T>();
		for (S source : sources) {
			T target = map(source, targetClass);
			targets.add(target);
		}
		return targets;
	}

	protected <S, T> void map(Collection<S> sources, Collection<T> targets, Class<T> targetClass) {
		for (S source : sources) {
			T target = map(source, targetClass);
			targets.add(target);
		}
	}
}
