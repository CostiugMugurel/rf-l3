package ro.usv.rf;

public class MainClass {
	
	
	public static void main(String[] args) {
		double[][] learningSet;
		try {
			learningSet = FileUtils.readLearningSetFromFile("D:\\Lab3_rf\\ro.usv.rf\\src\\ro\\usv\\rf\\in.txt");
			int numberOfPatterns = learningSet.length;
			int numberOfFeatures = learningSet[0].length;
			System.out.println(String.format("The learning set has %s patters and %s features", numberOfPatterns, numberOfFeatures));
		
                for(int i=1;i<numberOfPatterns;i++)
                {
                    double ed=Calculate.CalcDisE(learningSet[0], learningSet[i]);
                    System.out.println("Distanta ed " +ed);
                }
                 for(int i=1;i<numberOfPatterns;i++)
                {
                    double ces=Calculate.CalcDistCe(learningSet[0], learningSet[i]);
                    System.out.println("Distanta ces " +ces);
                }
                 
                 for(int i=1;i<numberOfPatterns;i++)
                {
                    double mah=Calculate.CalcDistM(learningSet[0], learningSet[i],numberOfPatterns );
                    System.out.println("Distanta mah " +mah);
                }
        }
                    catch (USVInputFileCustomException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("Finished learning set operations");
		}
	}

}
