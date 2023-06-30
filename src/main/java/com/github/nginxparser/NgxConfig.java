package com.github.nginxparser;

import com.github.nginxparser.antlr.NginxLexer;
import com.github.nginxparser.antlr.NginxListenerImpl;
import com.github.nginxparser.antlr.NginxParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

/**
 * Main class that describes Nginx config
 */
public class NgxConfig extends NgxBlock {

    public static final Class<? extends NgxEntry> PARAM = NgxParam.class;
    public static final Class<? extends NgxEntry> COMMENT = NgxComment.class;
    public static final Class<? extends NgxEntry> BLOCK = NgxBlock.class;
    public static final Class<? extends NgxEntry> IF = NgxIfBlock.class;

    /**
     * Parse an existing config
     *
     * @param path Path to config file
     * @return Config object
     * @throws IOException
     */
    public static NgxConfig read(String path) throws IOException {
        FileInputStream input = new FileInputStream(path);
        return read(input);
    }

    public static NgxConfig read(InputStream in) throws IOException {
        return readAntlr(in);
    }

    public static NgxConfig readAntlr(InputStream in) throws IOException {
        // ANTLRInputStream input = new ANTLRInputStream(in);
        CharStream charStream = CharStreams.fromStream(in);
        NginxLexer lexer = new NginxLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        NginxParser parser = new NginxParser(tokens);
        ParseTreeWalker walker = new ParseTreeWalker();

        ParseTree tree = parser.config(); // begin parsing at init rule
        NginxListenerImpl listener = new NginxListenerImpl();
        walker.walk(listener, tree);

        return listener.getResult();
    }

    @Override
    public Collection<NgxToken> getTokens() {
        throw new IllegalStateException("Not implemented");
    }

    @Override
    public void addValue(NgxToken token) {
        throw new IllegalStateException("Not implemented");
    }

    public String toString() {
        return "Nginx Config (" + getEntries().size() + " entries)";
    }

}
