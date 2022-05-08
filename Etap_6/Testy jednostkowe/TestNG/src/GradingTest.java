import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class GradingTest {
    @Test
    public void NegativeGrade(){
        var grading = new Grading();
        assertEquals("Niedostateczny", grading.Grade(40));
    }
    @Test
    public void PositiveGrade(){
        var grading = new Grading();
        assertEquals("Dostateczny", grading.Grade(50));
    }
    @Test
    public void PositivePlusGrade(){
        var grading = new Grading();
        assertEquals("Dostateczny plus", grading.Grade(60));
    }
    @Test
    public void GoodGrade(){
        var grading = new Grading();
        assertEquals("Dobry", grading.Grade(70));
    }
    @Test
    public void GoodPlusGrade(){
        var grading = new Grading();
        assertEquals("Dobry plus", grading.Grade(80));
    }
    @Test
    public void VeryGoodGrade(){
        var grading = new Grading();
        assertEquals("Bardzo dobry", grading.Grade(90));
    }
}