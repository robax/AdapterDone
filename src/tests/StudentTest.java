package tests;
// A unit test for class Student

// @author Rick Mercer
import model.Student;
import static org.junit.Assert.*;
import org.junit.Test;

public class StudentTest {

  @Test
  public void testGetters() {
    // Not everyone thinks we should test simple getters
    Student s = new Student("Chris", "Computer Science", 2.5, 21);
    assertEquals("Chris", s.getName());
    assertEquals("Computer Science", s.getMajor());
    assertEquals(2.5, s.getGPA(), 0.01);
    assertEquals(21, (int) s.getAge());
  }

  @Test
  public void testSetGPA() {
    // Not everyone thinks we should test simple getters
    Student s = new Student("Chris", "Computer Science", 2.5, 21);
    assertEquals(2.5, s.getGPA(), 0.01);
    s.setGPA(4.0);
    assertEquals(4.0, s.getGPA(), 0.01);
  }
}