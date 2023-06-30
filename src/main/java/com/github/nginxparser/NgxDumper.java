package com.github.nginxparser;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * NgxDumper is used to serialize an existing or manually created NgxConfig object
 */
public class NgxDumper {

    private NgxConfig config;
    private final static int PAD_SIZE = 2;
    private final static String PAD_SYMBOL = "  ";
    private final static String LBRACE = "{";
    private final static String RBRACE = "}";
    private final static String LF = "\n";
    private final static String CRLF = "\r\n";

    public NgxDumper(NgxConfig config) {
        this.config = config;
    }

    /**
     * Converts config int String
     *
     * @return Serialized config
     */
    public String dump() {
        StringWriter writer = new StringWriter();
        writeToStream(config, new PrintWriter(writer), 0);
        return writer.toString();
    }

    /**
     * Serializes config and sends result to the provided OutputStream
     *
     * @param out stream to write to
     */
    public void dump(OutputStream out) {
        writeToStream(config, new PrintWriter(out), 0);
    }

    private void writeToStream(NgxBlock config, PrintWriter writer, int level) {
        for (NgxEntry entry : config) {
            NgxEntryType type = NgxEntryType.fromClass(entry.getClass());
            switch (type) {
                case BLOCK:
                    NgxBlock block = (NgxBlock) entry;
                    writer.append(getOffset(level))
                        .append(block.toString())
                        .append(getLineEnding());
                    writeToStream(block, writer, level + 1);
                    writer
                        .append(getOffset(level))
                        .append(RBRACE)
                        .append(getLineEnding());
                    break;
                case IF:
                    NgxIfBlock ifBlock = (NgxIfBlock) entry;
                    // String name = ifBlock.getName();
                    // String value = ifBlock.getValue();
                    writer
                        .append(getOffset(level))
                        //It has already been processed in the parsing stage,
                        // and there is no need to do this again here
                        // .append(name + " (" + value + ") {")
                        .append(ifBlock.toString())
                        .append(getLineEnding());
                    writeToStream(ifBlock, writer, level + 1);
                    writer
                        .append(getOffset(level))
                        .append(RBRACE)
                        .append(getLineEnding());
                    break;
                case COMMENT:
                case PARAM:
                    writer
                        .append(getOffset(level))
                        .append(entry.toString())
                        .append(getLineEnding());
                    break;
            }
        }
        writer.flush();
    }

    public String getOffset(int level) {
        String offset = "";
        for (int i = 0; i < level; i++) {
            offset += PAD_SYMBOL;
        }
        return offset;
    }

    public String getLineEnding() {
        return LF;
    }
}
