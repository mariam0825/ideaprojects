package StudentClass;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class classTest {

    public class ClassTest {

        @Test
        public void testThatClassroomCanBeCreated() {
            StudentClass classroom = new StudentClass("Winifred");
            assertEquals(0, classroom.getGradeLevel());
            assertEquals("winifred", classroom.getName());
        }

        @Test
        public void testThatStudentCanHaveAGrade() {
            StudentClass classroom = new StudentClass("Winifred");
            classroom.studentLevel(5);
            assertEquals(5, classroom.getGradeLevel());
        }

        @Test
        public void testThatStudentCanBePromoted() {
            StudentClass classroom = new StudentClass("Winifred");
            classroom.studentLevel(5);
            classroom.promotion(6);
            assertEquals(6, classroom.getGradeLevel());
        }

        @Test
        public void testThatStudentCanHaveAScore() {
            StudentClass classroom = new StudentClass("Winifred");
            classroom.studentLevel(5);
            assertEquals("failed", classroom.scores(20));
        }

        @Test
        public void testThatStudentCanPass() {
            StudentClass classroom = new StudentClass("Winifred");
            classroom.studentLevel(5);
            assertEquals("passed", classroom.scores(80));
        }

        @Test
        public void testThatStudentCanUpdateName() {
            StudentClass classroom = new StudentClass("Winifred");
            assertEquals("sandara", classroom.updateName("Sandara"));
        }

        @Test
        public void testForStudentThatAreAboutToGraduating() {
            StudentClass classroom = new StudentClass("Winifred");
            assertEquals("Graduating students", classroom.isGraduating(12));
        }
    }