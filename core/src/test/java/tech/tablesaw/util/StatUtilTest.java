package tech.tablesaw.util;

import org.junit.Test;

import tech.tablesaw.api.FloatColumn;

import java.util.Random;

import static org.junit.Assert.assertEquals;

/**
 *
 */
public class StatUtilTest {

    @Test
    public void testSum() {
        Random random = new Random();
        float sum = 0.0f;
        FloatColumn column = new FloatColumn("c1");
        for (int i = 0; i < 100; i++) {
            float f = random.nextFloat();
            column.append(f);
            sum += f;
        }
        assertEquals(sum, column.sum(), 0.01f);
    }

    @Test
    public void testMin() {
        Random random = new Random();
        float min = Float.MAX_VALUE;
        FloatColumn column = new FloatColumn("c1");
        for (int i = 0; i < 100; i++) {
            float f = random.nextFloat();
            column.append(f);
            if (min > f) {
                min = f;
            }
        }
        assertEquals(min, column.min(), 0.01f);
    }

    @Test
    public void testMax() {
        Random random = new Random();
        float max = Float.MIN_VALUE;
        FloatColumn column = new FloatColumn("c1");
        for (int i = 0; i < 100; i++) {
            float f = random.nextFloat();
            column.append(f);
            if (max < f) {
                max = f;
            }
        }
        assertEquals(max, column.max(), 0.01f);
    }

}