package ro.usv.rf;

public class DistanceUtils {

	protected static double calculateEuclidianDistance(double[] linia1, double[] linia2)
	{
		return Math.sqrt( Math.pow(linia1[0] - linia2[1],2) + Math.pow(linia1[1] - linia2[1],2));
	}
	
}
