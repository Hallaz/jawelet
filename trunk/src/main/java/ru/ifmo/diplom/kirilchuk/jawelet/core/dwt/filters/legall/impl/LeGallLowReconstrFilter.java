package ru.ifmo.diplom.kirilchuk.jawelet.core.dwt.filters.legall.impl;

import static ru.ifmo.diplom.kirilchuk.jawelet.util.MathUtils.SQRT_32;
import ru.ifmo.diplom.kirilchuk.jawelet.core.dwt.filters.Filter;

/**
 * Low reconstruction filter from Le Gall filter bank.
 * 
 * @author Kirilchuk V.E.
 */
public class LeGallLowReconstrFilter extends Filter {

	private static final double RECONSTRUCTION_DIVIDER = 16;
	
    private static final double[] COEFFICIENTS = {
        2.0 / RECONSTRUCTION_DIVIDER,
        4.0 / RECONSTRUCTION_DIVIDER,
        2.0 / RECONSTRUCTION_DIVIDER};

    public LeGallLowReconstrFilter() {
    	super(COEFFICIENTS);
    }
}
