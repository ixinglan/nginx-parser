package com.github.odiszapc.nginxparser;

import com.github.nginxparser.NgxBlock;
import com.github.nginxparser.NgxEntry;
import org.junit.Assert;
import org.junit.Test;

import java.util.Iterator;

import static com.github.odiszapc.nginxparser.TestUtils.*;

public class TricksTest  extends ParseTestBase {

    @Test
    public void testC1() throws Exception {
        Iterator<NgxEntry> it = parse("tricks/c1.conf").getEntries().iterator();
        NgxBlock loc = (NgxBlock) it.next();
        assertBlock(loc, "events");

        Iterator<NgxEntry> it2 = loc.getEntries().iterator();
        assertParam(it2.next(), "worker_connections", "2048");
        assertParam(it2.next(), "use", "epoll");
        Assert.assertFalse(it2.hasNext());
        Assert.assertFalse(it.hasNext());
    }
}
