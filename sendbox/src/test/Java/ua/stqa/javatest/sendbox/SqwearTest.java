package ua.stqa.javatest.sendbox;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Buka on 29.02.2016.
 */
public class SqwearTest {

  @Test
public void testArea() {
  Square s =new Square (5);
    Assert.assertEquals(s.area(),25.0);
}
        }