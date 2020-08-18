package test02;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import org.junit.Test;

import main02.Main02;

public class Test02 {

	@Test
    public void testGetColor1() {
		Main02 c1 = new Main02();
        String t1 = c1.getColor(1);
        assertThat(t1,is("赤"));
    }
    @Test
    public void testGetColor2() {
    	Main02 c1 = new Main02();
        String t1 = c1.getColor(2);
        assertThat(t1,is("青"));
    }
    @Test
    public void testGetColor3() {
    	Main02 c1 = new Main02();
        String t1 = c1.getColor(3);
        assertThat(t1,is("1or2を入力してください"));
    }
}
