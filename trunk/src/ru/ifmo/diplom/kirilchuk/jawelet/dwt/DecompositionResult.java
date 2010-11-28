package ru.ifmo.diplom.kirilchuk.jawelet.dwt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Kirilchuk V.E.
 */
public class DecompositionResult {
    private int level;
    private double[] approximation;
    private List<double[]> details = new ArrayList<double[]>();//TODO mb stack?

    public double[] getApproximation() {
        return approximation;
    }

    public void setApproximation(double[] approximation) {
        this.approximation = approximation;
    }

    public void addDetails(double[] details) {
        this.details.add(details);
    }

    public List<double[]> getDetailsList() {
        return Collections.unmodifiableList(this.details);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
