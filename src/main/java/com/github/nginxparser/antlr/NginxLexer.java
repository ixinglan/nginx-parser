// Generated from /Users/zhaojianqiang/github/nginx-java-parser-dependabot-maven-junit-junit-4.13.1/src/main/resources/grammar/Nginx.g4 by ANTLR 4.12.0

package com.github.nginxparser.antlr;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class NginxLexer extends Lexer {
    static {
        RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION);
    }

    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
        new PredictionContextCache();
    public static final int
        T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
        T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, Value = 15, STR_EXT = 16,
        Comment = 17, REGEXP_PREFIXED = 18, QUOTED_STRING = 19, SINGLE_QUOTED = 20, WS = 21;
    public static String[] channelNames = {
        "DEFAULT_TOKEN_CHANNEL", "HIDDEN"
    };

    public static String[] modeNames = {
        "DEFAULT_MODE"
    };

    private static String[] makeRuleNames() {
        return new String[]{
            "T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8",
            "T__9", "T__10", "T__11", "T__12", "T__13", "Value", "STR_EXT", "Comment",
            "REGEXP_PREFIXED", "QUOTED_STRING", "RegexpPrefix", "StringCharacters",
            "NON_ASCII", "EscapeSequence", "SINGLE_QUOTED", "WS"
        };
    }

    public static final String[] ruleNames = makeRuleNames();

    private static String[] makeLiteralNames() {
        return new String[]{
            null, "';'", "'{'", "'}'", "'if'", "'('", "')'", "'\\.'", "'^'", "'location'",
            "'rewrite'", "'last'", "'break'", "'redirect'", "'permanent'"
        };
    }

    private static final String[] _LITERAL_NAMES = makeLiteralNames();

    private static String[] makeSymbolicNames() {
        return new String[]{
            null, null, null, null, null, null, null, null, null, null, null, null,
            null, null, null, "Value", "STR_EXT", "Comment", "REGEXP_PREFIXED", "QUOTED_STRING",
            "SINGLE_QUOTED", "WS"
        };
    }

    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;

    static {
        tokenNames = new String[_SYMBOLIC_NAMES.length];
        for (int i = 0; i < tokenNames.length; i++) {
            tokenNames[i] = VOCABULARY.getLiteralName(i);
            if (tokenNames[i] == null) {
                tokenNames[i] = VOCABULARY.getSymbolicName(i);
            }

            if (tokenNames[i] == null) {
                tokenNames[i] = "<INVALID>";
            }
        }
    }

    @Override
    @Deprecated
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override

    public Vocabulary getVocabulary() {
        return VOCABULARY;
    }


    public NginxLexer(CharStream input) {
        super(input);
        _interp = new LexerATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @Override
    public String getGrammarFileName() {
        return "Nginx.g4";
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public String getSerializedATN() {
        return _serializedATN;
    }

    @Override
    public String[] getChannelNames() {
        return channelNames;
    }

    @Override
    public String[] getModeNames() {
        return modeNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public static final String _serializedATN =
        "\u0004\u0000\u0015\u00bc\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002" +
            "\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002" +
            "\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002" +
            "\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002" +
            "\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e" +
            "\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011" +
            "\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014" +
            "\u0002\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017" +
            "\u0002\u0018\u0007\u0018\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001" +
            "\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004" +
            "\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006" +
            "\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001" +
            "\b\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001" +
            "\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b" +
            "\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001" +
            "\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001" +
            "\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001" +
            "\u000e\u0001\u000e\u0001\u000e\u0003\u000ex\b\u000e\u0001\u000f\u0001" +
            "\u000f\u0004\u000f|\b\u000f\u000b\u000f\f\u000f}\u0001\u0010\u0004\u0010" +
            "\u0081\b\u0010\u000b\u0010\f\u0010\u0082\u0001\u0010\u0005\u0010\u0086" +
            "\b\u0010\n\u0010\f\u0010\u0089\t\u0010\u0001\u0010\u0005\u0010\u008c\b" +
            "\u0010\n\u0010\f\u0010\u008f\t\u0010\u0001\u0011\u0001\u0011\u0004\u0011" +
            "\u0093\b\u0011\u000b\u0011\f\u0011\u0094\u0001\u0012\u0001\u0012\u0003" +
            "\u0012\u0099\b\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0003" +
            "\u0013\u009f\b\u0013\u0001\u0014\u0001\u0014\u0004\u0014\u00a3\b\u0014" +
            "\u000b\u0014\f\u0014\u00a4\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016" +
            "\u0003\u0016\u00ab\b\u0016\u0001\u0017\u0001\u0017\u0005\u0017\u00af\b" +
            "\u0017\n\u0017\f\u0017\u00b2\t\u0017\u0001\u0017\u0001\u0017\u0001\u0018" +
            "\u0004\u0018\u00b7\b\u0018\u000b\u0018\f\u0018\u00b8\u0001\u0018\u0001" +
            "\u0018\u0000\u0000\u0019\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004" +
            "\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017" +
            "\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'" +
            "\u0000)\u0000+\u0000-\u0000/\u00141\u0015\u0001\u0000\u000b\b\u0000!!" +
            "$$&&*:==?_az~~\u0001\u0000##\u0002\u0000\t\n\r\r\u0002\u0000\n\n\r\r\t" +
            "\u0000!!#$&&(:==?_az||~~\u0001\u0000~~\u0001\u0000**\u0002\u0000\"\"\\" +
            "\\\b\u0000\"\"\'\'\\\\bbffnnrrtt\u0002\u0000\'\'\\\\\u0003\u0000\t\n\r" +
            "\r  \u00c6\u0000\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000" +
            "\u0000\u0000\u0000\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000" +
            "\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000" +
            "\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000" +
            "\u0000\u0011\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000" +
            "\u0000\u0015\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000" +
            "\u0000\u0019\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000" +
            "\u0000\u001d\u0001\u0000\u0000\u0000\u0000\u001f\u0001\u0000\u0000\u0000" +
            "\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001\u0000\u0000\u0000\u0000%" +
            "\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001\u0001\u0000" +
            "\u0000\u0000\u00013\u0001\u0000\u0000\u0000\u00035\u0001\u0000\u0000\u0000" +
            "\u00057\u0001\u0000\u0000\u0000\u00079\u0001\u0000\u0000\u0000\t<\u0001" +
            "\u0000\u0000\u0000\u000b>\u0001\u0000\u0000\u0000\r@\u0001\u0000\u0000" +
            "\u0000\u000fC\u0001\u0000\u0000\u0000\u0011E\u0001\u0000\u0000\u0000\u0013" +
            "N\u0001\u0000\u0000\u0000\u0015V\u0001\u0000\u0000\u0000\u0017[\u0001" +
            "\u0000\u0000\u0000\u0019a\u0001\u0000\u0000\u0000\u001bj\u0001\u0000\u0000" +
            "\u0000\u001dw\u0001\u0000\u0000\u0000\u001f{\u0001\u0000\u0000\u0000!" +
            "\u0080\u0001\u0000\u0000\u0000#\u0090\u0001\u0000\u0000\u0000%\u0096\u0001" +
            "\u0000\u0000\u0000\'\u009c\u0001\u0000\u0000\u0000)\u00a2\u0001\u0000" +
            "\u0000\u0000+\u00a6\u0001\u0000\u0000\u0000-\u00a8\u0001\u0000\u0000\u0000" +
            "/\u00ac\u0001\u0000\u0000\u00001\u00b6\u0001\u0000\u0000\u000034\u0005" +
            ";\u0000\u00004\u0002\u0001\u0000\u0000\u000056\u0005{\u0000\u00006\u0004" +
            "\u0001\u0000\u0000\u000078\u0005}\u0000\u00008\u0006\u0001\u0000\u0000" +
            "\u00009:\u0005i\u0000\u0000:;\u0005f\u0000\u0000;\b\u0001\u0000\u0000" +
            "\u0000<=\u0005(\u0000\u0000=\n\u0001\u0000\u0000\u0000>?\u0005)\u0000" +
            "\u0000?\f\u0001\u0000\u0000\u0000@A\u0005\\\u0000\u0000AB\u0005.\u0000" +
            "\u0000B\u000e\u0001\u0000\u0000\u0000CD\u0005^\u0000\u0000D\u0010\u0001" +
            "\u0000\u0000\u0000EF\u0005l\u0000\u0000FG\u0005o\u0000\u0000GH\u0005c" +
            "\u0000\u0000HI\u0005a\u0000\u0000IJ\u0005t\u0000\u0000JK\u0005i\u0000" +
            "\u0000KL\u0005o\u0000\u0000LM\u0005n\u0000\u0000M\u0012\u0001\u0000\u0000" +
            "\u0000NO\u0005r\u0000\u0000OP\u0005e\u0000\u0000PQ\u0005w\u0000\u0000" +
            "QR\u0005r\u0000\u0000RS\u0005i\u0000\u0000ST\u0005t\u0000\u0000TU\u0005" +
            "e\u0000\u0000U\u0014\u0001\u0000\u0000\u0000VW\u0005l\u0000\u0000WX\u0005" +
            "a\u0000\u0000XY\u0005s\u0000\u0000YZ\u0005t\u0000\u0000Z\u0016\u0001\u0000" +
            "\u0000\u0000[\\\u0005b\u0000\u0000\\]\u0005r\u0000\u0000]^\u0005e\u0000" +
            "\u0000^_\u0005a\u0000\u0000_`\u0005k\u0000\u0000`\u0018\u0001\u0000\u0000" +
            "\u0000ab\u0005r\u0000\u0000bc\u0005e\u0000\u0000cd\u0005d\u0000\u0000" +
            "de\u0005i\u0000\u0000ef\u0005r\u0000\u0000fg\u0005e\u0000\u0000gh\u0005" +
            "c\u0000\u0000hi\u0005t\u0000\u0000i\u001a\u0001\u0000\u0000\u0000jk\u0005" +
            "p\u0000\u0000kl\u0005e\u0000\u0000lm\u0005r\u0000\u0000mn\u0005m\u0000" +
            "\u0000no\u0005a\u0000\u0000op\u0005n\u0000\u0000pq\u0005e\u0000\u0000" +
            "qr\u0005n\u0000\u0000rs\u0005t\u0000\u0000s\u001c\u0001\u0000\u0000\u0000" +
            "tx\u0003\u001f\u000f\u0000ux\u0003%\u0012\u0000vx\u0003/\u0017\u0000w" +
            "t\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000wv\u0001\u0000\u0000" +
            "\u0000x\u001e\u0001\u0000\u0000\u0000y|\u0007\u0000\u0000\u0000z|\u0003" +
            "+\u0015\u0000{y\u0001\u0000\u0000\u0000{z\u0001\u0000\u0000\u0000|}\u0001" +
            "\u0000\u0000\u0000}{\u0001\u0000\u0000\u0000}~\u0001\u0000\u0000\u0000" +
            "~ \u0001\u0000\u0000\u0000\u007f\u0081\u0007\u0001\u0000\u0000\u0080\u007f" +
            "\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000\u0000\u0000\u0082\u0080" +
            "\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0087" +
            "\u0001\u0000\u0000\u0000\u0084\u0086\u0007\u0002\u0000\u0000\u0085\u0084" +
            "\u0001\u0000\u0000\u0000\u0086\u0089\u0001\u0000\u0000\u0000\u0087\u0085" +
            "\u0001\u0000\u0000\u0000\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u008d" +
            "\u0001\u0000\u0000\u0000\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u008c" +
            "\b\u0003\u0000\u0000\u008b\u008a\u0001\u0000\u0000\u0000\u008c\u008f\u0001" +
            "\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008d\u008e\u0001" +
            "\u0000\u0000\u0000\u008e\"\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000" +
            "\u0000\u0000\u0090\u0092\u0003\'\u0013\u0000\u0091\u0093\u0007\u0004\u0000" +
            "\u0000\u0092\u0091\u0001\u0000\u0000\u0000\u0093\u0094\u0001\u0000\u0000" +
            "\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000" +
            "\u0000\u0095$\u0001\u0000\u0000\u0000\u0096\u0098\u0005\"\u0000\u0000" +
            "\u0097\u0099\u0003)\u0014\u0000\u0098\u0097\u0001\u0000\u0000\u0000\u0098" +
            "\u0099\u0001\u0000\u0000\u0000\u0099\u009a\u0001\u0000\u0000\u0000\u009a" +
            "\u009b\u0005\"\u0000\u0000\u009b&\u0001\u0000\u0000\u0000\u009c\u009e" +
            "\u0007\u0005\u0000\u0000\u009d\u009f\u0007\u0006\u0000\u0000\u009e\u009d" +
            "\u0001\u0000\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f(\u0001" +
            "\u0000\u0000\u0000\u00a0\u00a3\b\u0007\u0000\u0000\u00a1\u00a3\u0003-" +
            "\u0016\u0000\u00a2\u00a0\u0001\u0000\u0000\u0000\u00a2\u00a1\u0001\u0000" +
            "\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a2\u0001\u0000" +
            "\u0000\u0000\u00a4\u00a5\u0001\u0000\u0000\u0000\u00a5*\u0001\u0000\u0000" +
            "\u0000\u00a6\u00a7\u0002\u0080\u8000\uffff\u0000\u00a7,\u0001\u0000\u0000" +
            "\u0000\u00a8\u00aa\u0005\\\u0000\u0000\u00a9\u00ab\u0007\b\u0000\u0000" +
            "\u00aa\u00a9\u0001\u0000\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000" +
            "\u00ab.\u0001\u0000\u0000\u0000\u00ac\u00b0\u0005\'\u0000\u0000\u00ad" +
            "\u00af\b\t\u0000\u0000\u00ae\u00ad\u0001\u0000\u0000\u0000\u00af\u00b2" +
            "\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b0\u00b1" +
            "\u0001\u0000\u0000\u0000\u00b1\u00b3\u0001\u0000\u0000\u0000\u00b2\u00b0" +
            "\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\'\u0000\u0000\u00b40\u0001" +
            "\u0000\u0000\u0000\u00b5\u00b7\u0007\n\u0000\u0000\u00b6\u00b5\u0001\u0000" +
            "\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000" +
            "\u0000\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000" +
            "\u0000\u0000\u00ba\u00bb\u0006\u0018\u0000\u0000\u00bb2\u0001\u0000\u0000" +
            "\u0000\u000f\u0000w{}\u0082\u0087\u008d\u0094\u0098\u009e\u00a2\u00a4" +
            "\u00aa\u00b0\u00b8\u0001\u0006\u0000\u0000";
    public static final ATN _ATN =
        new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}