
package com.github.odiszapc.nginxparser;

import com.github.nginxparser.*;
import org.junit.Assert;

import java.io.InputStream;
import java.util.Iterator;

public class TestUtils {
    public static NgxConfig parseAntlr(String path) throws Exception {
        return NgxConfig.read(getStream(path));
    }

    public static InputStream getStream(String path) {
        return Thread.currentThread().getContextClassLoader().getResourceAsStream(path);
    }

    public static String dump(String path) throws Exception {
        NgxConfig conf = TestUtils.parseAntlr(path);
        NgxDumper dumper = new NgxDumper(conf);
        return dumper.dump();
    }

    public static void assertParam(NgxEntry entry, String name, String... values) {
        Assert.assertTrue(entry instanceof NgxParam);
        Assert.assertEquals(((NgxParam) entry).getName(), name);

        Iterator<String> it = ((NgxParam) entry).getValues().iterator();
        for (String value : values) {
            Assert.assertEquals(it.next(), value);
        }

    }

    public static NgxBlock assertBlock(NgxEntry entry, String name, String... values) {
        Assert.assertTrue(entry instanceof NgxBlock);
        Assert.assertEquals(((NgxBlock) entry).getName(), name);

        Assert.assertEquals(values.length, ((NgxBlock) entry).getValues().size());
        Iterator<String> it = ((NgxBlock) entry).getValues().iterator();
        for (String value : values) {
            Assert.assertEquals(it.next(), value);
        }

        return (NgxBlock) entry;
    }

    public static NgxIfBlock assertIfBlock(NgxEntry entry, String name, String... values) {
        Assert.assertTrue(entry instanceof NgxBlock);
        Assert.assertEquals(((NgxIfBlock) entry).getName(), name);

        Assert.assertEquals(values.length, ((NgxBlock) entry).getValues().size());
        Iterator<String> it = ((NgxBlock) entry).getValues().iterator();
        for (String value : values) {
            Assert.assertEquals(it.next(), value);
        }

        return (NgxIfBlock) entry;
    }

    @SuppressWarnings("UnusedReturnValue")
    public static NgxComment assertComment(NgxEntry entry, @SuppressWarnings("SameParameterValue") String value) {
        Assert.assertTrue(entry instanceof NgxComment);
        Assert.assertEquals(((NgxComment) entry).getValue(), value);
        return (NgxComment) entry;
    }
}
