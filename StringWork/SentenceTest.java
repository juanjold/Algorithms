import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

public class SentenceTest {
  String sentence;
  String reverse;
  
  @Before
  public void setUp() {
    sentence = "This is a default sentence";
    reverse = "sentence default a is This";
  }
  
  @Test
  public void TestSentence() {
    assertEquals(reverse,Sentence.reverseWords(sentence, ' '));
}
  @Test
  public void TestWord() {
   assertEquals("word",Sentence.reverseWords("word", ' ')); 
  }
  
  @Test
  public void TestNull() {
    assertNull(Sentence.reverseWords(null, ' '));
  }
  
  @Test
  public void TestEmptyString() {
    assertEquals("",Sentence.reverseWords("", ' '));
  }
  
  @Test
  public void TestManySpaces() {
    sentence = "This  has   many     spaces";
    reverse = "spaces     many   has  This";
    assertEquals(reverse,Sentence.reverseWords(sentence, ' '));
  }
  
  @Test
  public void TestTrailingSpaces() {
    sentence = "    This has a leading space ";
    reverse = " space leading a has This    ";
    assertEquals(reverse,Sentence.reverseWords(sentence, ' '));
  }
  
  @Test 
  public void TestDelim() {
    sentence = "-This-is redundant";
    reverse = "is redundant-This-";
    assertEquals(reverse,Sentence.reverseWords(sentence, '-'));
  }    
}