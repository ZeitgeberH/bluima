package ch.epfl.bbp.io;

import static ch.epfl.bbp.io.LineReader.asText;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.File;

import org.junit.Test;

import ch.epfl.bbp.ResourceHelper;

public class ZipFileIteratorTest {

    @Test
    public void test() throws Exception {

        File zip = ResourceHelper
                .getFile("directoryIterator/zipFileIterator.zip");

        ZipFileIterator iterator = new ZipFileIterator(zip);

        for (int i = 0; i < 3; i++) {
            assertTrue(iterator.hasNext());
            File file = iterator.next();
            assertEquals("test", asText(file).substring(0, 4));
        }

        assertFalse(iterator.hasNext());
    }
}
