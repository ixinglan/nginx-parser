package com.github.odiszapc.nginxparser;

import com.github.nginxparser.NgxConfig;
import com.github.nginxparser.NgxDumper;
import com.github.nginxparser.NgxEntry;

import java.util.Iterator;

public class ParseTestBase {
    protected NgxConfig parse(String path) throws Exception {
        return TestUtils.parseAntlr(path);
    }

    protected NgxEntry getFirstParam(String path) throws Exception {
        Iterator<NgxEntry> it = parse(path).getEntries().iterator();
        return it.next();
    }

    protected void debug(NgxConfig parsedConfig) {
        NgxDumper ngxDumper = new NgxDumper(parsedConfig);
        ngxDumper.dump(System.out);
    }
}
