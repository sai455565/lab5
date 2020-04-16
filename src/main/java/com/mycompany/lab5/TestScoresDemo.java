package com.mycompany.lab5;

/**
 *
 * @author satyanagasaitejaadabala
 */
public class TestScoresDemo {
   public static void main(String[] args) throws Exception {
       
       double[] badScores = { 97.5, 66.7, 88.0, 101.0, 99.0 };
       double[] goodScores = { 97.5, 66.7, 88.0, 100.0, 99.0 };
       TestScores test_Score = null;
       // Start the try block.
       try {
           test_Score = new TestScores(badScores);
       } catch (IllegalArgumentException e) {
           System.out.println(e.getMessage());
       }
       // Start the try block.
       try {
           test_Score = new TestScores(goodScores);
       } catch (IllegalArgumentException e) {
           System.out.println(e.getMessage());
       }
      
       System.out.print("Good scores" + "\n\tThe average of the good scores is " + test_Score.getAverage());
   }  
}
