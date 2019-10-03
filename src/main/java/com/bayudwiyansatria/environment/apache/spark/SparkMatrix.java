/*
 * MIT License
 *
 * Copyright (c) 2019 Bayu Dwiyan Satria
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.bayudwiyansatria.environment.apache.spark;

public class SparkMatrix {

	public double getDistance_Relative(String[] p1, String[] p2){
        return 1.0;
    }

    public double getDistance_Relative(double[] p1, double[] p2) {
        double distance = 0.0;
        for(int i = 0; i < p1.length; ++i) {
            double difference = p2[i] - p1[i];
            distance += difference * difference;
        }
        return distance;
    }

    public int getDistance_Relative(int[] p1, int[] p2) {
        int distance = 0;
        for(int i = 0; i < p1.length; ++i) {
            int difference = p2[i] - p1[i];
            distance += difference * difference;
        }
        return distance;
    }

    public double getDistance_Relative(int[] p1, double[] p2) {
        double distance = 0.0;
        for(int i = 0; i < p1.length; ++i) {
            double difference = p2[i] - (double)p1[i];
            distance += difference * difference;
        }
        return distance;
    }

    public double getDistance_Relative(double[] p1, int[] p2) {
        double distance = 0.0;
        for(int i = 0; i < p1.length; ++i) {
            double difference = (double)p2[i] - p1[i];
            distance += difference * difference;
        }
        return distance;
    }

    public double[] getDistance_Relative(double[] p1, double[][] p2) {
        double[] distance = new double[p2.length];
        for(int i = 0; i < p2.length; ++i) {
            distance[i] = this.getDistance_Relative(p1, p2[i]);
        }
        return distance;
    }

    public double[] getDistance_Relative(int[] p1, double[][] p2) {
        double[] distance = new double[p2.length];
        for(int i = 0; i < p2.length; ++i) {
            distance[i] = this.getDistance_Relative(p1, p2[i]);
        }

        return distance;
    }

    public double[] getDistance_Relative(double[] p1, int[][] p2) {
        double[] distance = new double[p2.length];
        for(int i = 0; i < p2.length; ++i) {
            distance[i] = this.getDistance_Relative(p1, p2[i]);
        }

        return distance;
    }

    public double[] getDistance_Relative(int[] p1, int[][] p2) {
        double[] distance = new double[p2.length];
        for(int i = 0; i < p2.length; ++i) {
            distance[i] = (double)this.getDistance_Relative(p1, p2[i]);
        }
        return distance;
    }}
