package org.opensha.eq.forecast;

import static com.google.common.base.CaseFormat.UPPER_CAMEL;
import static com.google.common.base.CaseFormat.UPPER_UNDERSCORE;

import com.google.common.base.CaseFormat;

/**
 * Forecast source XML tags.
 * @author Peter Powers
 */
@SuppressWarnings("javadoc")
public enum SourceElement {

	FAULT_SOURCE_SET,
	FAULT_SOURCE,
	
	MAG_UNCERTAINTY,
	EPISTEMIC,
	ALEATORY,
	
	MAG_FREQ_DIST,
	
	GEOMETRY,
	TRACE,

	
	SUBDUCTION_SOURCE_SET,
	SUBDUCTION_SOURCE,
	
	LOWER_TRACE,


	INDEXED_FAULT_SOURCE_SET,
	INDEXED_FAULT_SECTIONS,
	FAULT_SECTION,
	
	
	GRID_SOURCE_SET,
	
	SOURCE_ATTS,
	
	NODES,
	NODE,
	
	DEFAULTS;
		
	/**
	 * Returns an {@code CaseFormat#UPPER_CAMEL} {@code String} representation
	 * of this {@code SourceElement}.
	 */
	@Override
	public String toString() { 
		return UPPER_UNDERSCORE.to(UPPER_CAMEL, name());
	}
	
	/**
	 * Converts supplied {@code String} to equivalent {@code SourceElement}.
	 * Method expects a {@code String} with {@code CaseFormat#UPPER_CAMEL}
	 * @param s {@code String} to convert
	 * @return the corresponding {@code SourceElement}
	 * @see CaseFormat
	 * @throws IllegalArgumentException if supplied String is incorrectly
	 *         formatted or no matching {@code SourceElement} exists
	 */
	public static SourceElement fromString(String s) {
		return valueOf(UPPER_CAMEL.to(UPPER_UNDERSCORE, s));
	}
		
}
