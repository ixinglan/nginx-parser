// Generated from /Users/zhaojianqiang/github/nginx-java-parser-dependabot-maven-junit-junit-4.13.1/src/main/resources/grammar/Nginx.g4 by ANTLR 4.12.0

package com.github.nginxparser.antlr;

import com.github.nginxparser.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class NginxParser extends Parser {
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
    public static final int
        RULE_config = 0, RULE_statement = 1, RULE_genericStatement = 2, RULE_regexHeaderStatement = 3,
        RULE_block = 4, RULE_genericBlockHeader = 5, RULE_if_statement = 6, RULE_if_body = 7,
        RULE_regexp = 8, RULE_locationBlockHeader = 9, RULE_rewriteStatement = 10;

    private static String[] makeRuleNames() {
        return new String[]{
            "config", "statement", "genericStatement", "regexHeaderStatement", "block",
            "genericBlockHeader", "if_statement", "if_body", "regexp", "locationBlockHeader",
            "rewriteStatement"
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
    public ATN getATN() {
        return _ATN;
    }

    public NginxParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    @SuppressWarnings("CheckReturnValue")
    public static class ConfigContext extends ParserRuleContext {
        public NgxConfig ret;
        public StatementContext statement;
        public BlockContext block;
        public Token Comment;

        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
        }

        public List<BlockContext> block() {
            return getRuleContexts(BlockContext.class);
        }

        public BlockContext block(int i) {
            return getRuleContext(BlockContext.class, i);
        }

        public List<TerminalNode> Comment() {
            return getTokens(NginxParser.Comment);
        }

        public TerminalNode Comment(int i) {
            return getToken(NginxParser.Comment, i);
        }

        public ConfigContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_config;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof NginxListener) ((NginxListener) listener).enterConfig(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof NginxListener) ((NginxListener) listener).exitConfig(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof NginxVisitor) return ((NginxVisitor<? extends T>) visitor).visitConfig(this);
            else return visitor.visitChildren(this);
        }
    }

    public final ConfigContext config() throws RecognitionException {
        ConfigContext _localctx = new ConfigContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_config);
        ((ConfigContext) _localctx).ret = new NgxConfig();
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(30);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        setState(30);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 0, _ctx)) {
                            case 1: {
                                setState(22);
                                ((ConfigContext) _localctx).statement = statement();
                                _localctx.ret.addEntry(((ConfigContext) _localctx).statement.ret);
                            }
                            break;
                            case 2: {
                                setState(25);
                                ((ConfigContext) _localctx).block = block();
                                _localctx.ret.addEntry(((ConfigContext) _localctx).block.ret);
                            }
                            break;
                            case 3: {
                                setState(28);
                                ((ConfigContext) _localctx).Comment = match(Comment);
                                _localctx.ret.addEntry(new NgxComment((((ConfigContext) _localctx).Comment != null ? ((ConfigContext) _localctx).Comment.getText() : null)));
                            }
                            break;
                        }
                    }
                    setState(32);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 427520L) != 0));
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class StatementContext extends ParserRuleContext {
        public NgxParam ret;
        public RewriteStatementContext rewriteStatement;
        public GenericStatementContext genericStatement;
        public RegexHeaderStatementContext regexHeaderStatement;

        public RewriteStatementContext rewriteStatement() {
            return getRuleContext(RewriteStatementContext.class, 0);
        }

        public GenericStatementContext genericStatement() {
            return getRuleContext(GenericStatementContext.class, 0);
        }

        public RegexHeaderStatementContext regexHeaderStatement() {
            return getRuleContext(RegexHeaderStatementContext.class, 0);
        }

        public StatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof NginxListener) ((NginxListener) listener).enterStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof NginxListener) ((NginxListener) listener).exitStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof NginxVisitor) return ((NginxVisitor<? extends T>) visitor).visitStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public final StatementContext statement() throws RecognitionException {
        StatementContext _localctx = new StatementContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_statement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(43);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case T__9: {
                        setState(34);
                        ((StatementContext) _localctx).rewriteStatement = rewriteStatement();
                        ((StatementContext) _localctx).ret = ((StatementContext) _localctx).rewriteStatement.ret;
                    }
                    break;
                    case Value: {
                        setState(37);
                        ((StatementContext) _localctx).genericStatement = genericStatement();
                        ((StatementContext) _localctx).ret = ((StatementContext) _localctx).genericStatement.ret;
                    }
                    break;
                    case REGEXP_PREFIXED: {
                        setState(40);
                        ((StatementContext) _localctx).regexHeaderStatement = regexHeaderStatement();
                        ((StatementContext) _localctx).ret = ((StatementContext) _localctx).regexHeaderStatement.ret;
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                setState(45);
                match(T__0);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class GenericStatementContext extends ParserRuleContext {
        public NgxParam ret;
        public Token Value;
        public RegexpContext r;

        public List<TerminalNode> Value() {
            return getTokens(NginxParser.Value);
        }

        public TerminalNode Value(int i) {
            return getToken(NginxParser.Value, i);
        }

        public List<RegexpContext> regexp() {
            return getRuleContexts(RegexpContext.class);
        }

        public RegexpContext regexp(int i) {
            return getRuleContext(RegexpContext.class, i);
        }

        public GenericStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_genericStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof NginxListener) ((NginxListener) listener).enterGenericStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof NginxListener) ((NginxListener) listener).exitGenericStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof NginxVisitor)
                return ((NginxVisitor<? extends T>) visitor).visitGenericStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public final GenericStatementContext genericStatement() throws RecognitionException {
        GenericStatementContext _localctx = new GenericStatementContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_genericStatement);
        ((GenericStatementContext) _localctx).ret = new NgxParam();
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(47);
                ((GenericStatementContext) _localctx).Value = match(Value);
                _localctx.ret.addValue((((GenericStatementContext) _localctx).Value != null ? ((GenericStatementContext) _localctx).Value.getText() : null));
                setState(56);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33184L) != 0)) {
                    {
                        setState(54);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 3, _ctx)) {
                            case 1: {
                                setState(49);
                                ((GenericStatementContext) _localctx).Value = match(Value);
                                _localctx.ret.addValue((((GenericStatementContext) _localctx).Value != null ? ((GenericStatementContext) _localctx).Value.getText() : null));
                            }
                            break;
                            case 2: {
                                setState(51);
                                ((GenericStatementContext) _localctx).r = regexp();
                                _localctx.ret.addValue(((GenericStatementContext) _localctx).r.ret);
                            }
                            break;
                        }
                    }
                    setState(58);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class RegexHeaderStatementContext extends ParserRuleContext {
        public NgxParam ret;
        public Token REGEXP_PREFIXED;
        public Token Value;

        public TerminalNode REGEXP_PREFIXED() {
            return getToken(NginxParser.REGEXP_PREFIXED, 0);
        }

        public TerminalNode Value() {
            return getToken(NginxParser.Value, 0);
        }

        public RegexHeaderStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_regexHeaderStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof NginxListener) ((NginxListener) listener).enterRegexHeaderStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof NginxListener) ((NginxListener) listener).exitRegexHeaderStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof NginxVisitor)
                return ((NginxVisitor<? extends T>) visitor).visitRegexHeaderStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public final RegexHeaderStatementContext regexHeaderStatement() throws RecognitionException {
        RegexHeaderStatementContext _localctx = new RegexHeaderStatementContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_regexHeaderStatement);
        ((RegexHeaderStatementContext) _localctx).ret = new NgxParam();
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(59);
                ((RegexHeaderStatementContext) _localctx).REGEXP_PREFIXED = match(REGEXP_PREFIXED);
                _localctx.ret.addValue((((RegexHeaderStatementContext) _localctx).REGEXP_PREFIXED != null ? ((RegexHeaderStatementContext) _localctx).REGEXP_PREFIXED.getText() : null));
                setState(61);
                ((RegexHeaderStatementContext) _localctx).Value = match(Value);
                _localctx.ret.addValue((((RegexHeaderStatementContext) _localctx).Value != null ? ((RegexHeaderStatementContext) _localctx).Value.getText() : null));
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class BlockContext extends ParserRuleContext {
        public NgxBlock ret;
        public LocationBlockHeaderContext locationBlockHeader;
        public GenericBlockHeaderContext genericBlockHeader;
        public Token Comment;
        public StatementContext statement;
        public BlockContext b;
        public If_statementContext if_statement;

        public LocationBlockHeaderContext locationBlockHeader() {
            return getRuleContext(LocationBlockHeaderContext.class, 0);
        }

        public GenericBlockHeaderContext genericBlockHeader() {
            return getRuleContext(GenericBlockHeaderContext.class, 0);
        }

        public List<TerminalNode> Comment() {
            return getTokens(NginxParser.Comment);
        }

        public TerminalNode Comment(int i) {
            return getToken(NginxParser.Comment, i);
        }

        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
        }

        public List<If_statementContext> if_statement() {
            return getRuleContexts(If_statementContext.class);
        }

        public If_statementContext if_statement(int i) {
            return getRuleContext(If_statementContext.class, i);
        }

        public List<BlockContext> block() {
            return getRuleContexts(BlockContext.class);
        }

        public BlockContext block(int i) {
            return getRuleContext(BlockContext.class, i);
        }

        public BlockContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_block;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof NginxListener) ((NginxListener) listener).enterBlock(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof NginxListener) ((NginxListener) listener).exitBlock(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof NginxVisitor) return ((NginxVisitor<? extends T>) visitor).visitBlock(this);
            else return visitor.visitChildren(this);
        }
    }

    public final BlockContext block() throws RecognitionException {
        BlockContext _localctx = new BlockContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_block);
        ((BlockContext) _localctx).ret = new NgxBlock();
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(70);
                _errHandler.sync(this);
                switch (_input.LA(1)) {
                    case T__8: {
                        setState(64);
                        ((BlockContext) _localctx).locationBlockHeader = locationBlockHeader();
                        _localctx.ret.getTokens().addAll(((BlockContext) _localctx).locationBlockHeader.ret);
                    }
                    break;
                    case Value: {
                        setState(67);
                        ((BlockContext) _localctx).genericBlockHeader = genericBlockHeader();
                        _localctx.ret.getTokens().addAll(((BlockContext) _localctx).genericBlockHeader.ret);
                    }
                    break;
                    default:
                        throw new NoViableAltException(this);
                }
                setState(73);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Comment) {
                    {
                        setState(72);
                        ((BlockContext) _localctx).Comment = match(Comment);
                    }
                }

                setState(75);
                match(T__1);
                setState(89);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 427536L) != 0)) {
                    {
                        setState(87);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
                            case 1: {
                                setState(76);
                                ((BlockContext) _localctx).statement = statement();
                                _localctx.ret.addEntry(((BlockContext) _localctx).statement.ret);
                            }
                            break;
                            case 2: {
                                setState(79);
                                ((BlockContext) _localctx).b = block();
                                _localctx.ret.addEntry(((BlockContext) _localctx).b.ret);
                            }
                            break;
                            case 3: {
                                setState(82);
                                ((BlockContext) _localctx).if_statement = if_statement();
                                _localctx.ret.addEntry(((BlockContext) _localctx).if_statement.ret);
                            }
                            break;
                            case 4: {
                                setState(85);
                                ((BlockContext) _localctx).Comment = match(Comment);
                                _localctx.ret.addEntry(new NgxComment((((BlockContext) _localctx).Comment != null ? ((BlockContext) _localctx).Comment.getText() : null)));
                            }
                            break;
                        }
                    }
                    setState(91);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(92);
                match(T__2);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class GenericBlockHeaderContext extends ParserRuleContext {
        public List<NgxToken> ret;
        public Token Value;
        public RegexpContext regexp;

        public List<TerminalNode> Value() {
            return getTokens(NginxParser.Value);
        }

        public TerminalNode Value(int i) {
            return getToken(NginxParser.Value, i);
        }

        public List<RegexpContext> regexp() {
            return getRuleContexts(RegexpContext.class);
        }

        public RegexpContext regexp(int i) {
            return getRuleContext(RegexpContext.class, i);
        }

        public GenericBlockHeaderContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_genericBlockHeader;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof NginxListener) ((NginxListener) listener).enterGenericBlockHeader(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof NginxListener) ((NginxListener) listener).exitGenericBlockHeader(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof NginxVisitor)
                return ((NginxVisitor<? extends T>) visitor).visitGenericBlockHeader(this);
            else return visitor.visitChildren(this);
        }
    }

    public final GenericBlockHeaderContext genericBlockHeader() throws RecognitionException {
        GenericBlockHeaderContext _localctx = new GenericBlockHeaderContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_genericBlockHeader);
        ((GenericBlockHeaderContext) _localctx).ret = new ArrayList<NgxToken>();
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(94);
                ((GenericBlockHeaderContext) _localctx).Value = match(Value);
                _localctx.ret.add(new NgxToken((((GenericBlockHeaderContext) _localctx).Value != null ? ((GenericBlockHeaderContext) _localctx).Value.getText() : null)));
                setState(103);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 33184L) != 0)) {
                    {
                        setState(101);
                        _errHandler.sync(this);
                        switch (getInterpreter().adaptivePredict(_input, 9, _ctx)) {
                            case 1: {
                                setState(96);
                                ((GenericBlockHeaderContext) _localctx).Value = match(Value);
                                _localctx.ret.add(new NgxToken((((GenericBlockHeaderContext) _localctx).Value != null ? ((GenericBlockHeaderContext) _localctx).Value.getText() : null)));
                            }
                            break;
                            case 2: {
                                setState(98);
                                ((GenericBlockHeaderContext) _localctx).regexp = regexp();
                                _localctx.ret.add(new NgxToken(((GenericBlockHeaderContext) _localctx).regexp.ret));
                            }
                            break;
                        }
                    }
                    setState(105);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class If_statementContext extends ParserRuleContext {
        public NgxIfBlock ret;
        public Token id;
        public If_bodyContext if_body;
        public StatementContext statement;

        public If_bodyContext if_body() {
            return getRuleContext(If_bodyContext.class, 0);
        }

        public TerminalNode Comment() {
            return getToken(NginxParser.Comment, 0);
        }

        public List<StatementContext> statement() {
            return getRuleContexts(StatementContext.class);
        }

        public StatementContext statement(int i) {
            return getRuleContext(StatementContext.class, i);
        }

        public If_statementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_if_statement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof NginxListener) ((NginxListener) listener).enterIf_statement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof NginxListener) ((NginxListener) listener).exitIf_statement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof NginxVisitor) return ((NginxVisitor<? extends T>) visitor).visitIf_statement(this);
            else return visitor.visitChildren(this);
        }
    }

    public final If_statementContext if_statement() throws RecognitionException {
        If_statementContext _localctx = new If_statementContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_if_statement);
        ((If_statementContext) _localctx).ret = new NgxIfBlock();
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(106);
                ((If_statementContext) _localctx).id = match(T__3);
                _localctx.ret.addValue(new NgxToken((((If_statementContext) _localctx).id != null ? ((If_statementContext) _localctx).id.getText() : null)));
                setState(108);
                ((If_statementContext) _localctx).if_body = if_body();
                _localctx.ret.getTokens().addAll(((If_statementContext) _localctx).if_body.ret);
                setState(111);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == Comment) {
                    {
                        setState(110);
                        match(Comment);
                    }
                }

                setState(113);
                match(T__1);
                setState(119);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 295936L) != 0)) {
                    {
                        {
                            setState(114);
                            ((If_statementContext) _localctx).statement = statement();
                            _localctx.ret.addEntry(((If_statementContext) _localctx).statement.ret);
                        }
                    }
                    setState(121);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(122);
                match(T__2);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class If_bodyContext extends ParserRuleContext {
        public List<NgxToken> ret;
        public Token id;
        public Token Value;
        public RegexpContext regexp;

        public List<TerminalNode> Value() {
            return getTokens(NginxParser.Value);
        }

        public TerminalNode Value(int i) {
            return getToken(NginxParser.Value, i);
        }

        public RegexpContext regexp() {
            return getRuleContext(RegexpContext.class, 0);
        }

        public If_bodyContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_if_body;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof NginxListener) ((NginxListener) listener).enterIf_body(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof NginxListener) ((NginxListener) listener).exitIf_body(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof NginxVisitor) return ((NginxVisitor<? extends T>) visitor).visitIf_body(this);
            else return visitor.visitChildren(this);
        }
    }

    public final If_bodyContext if_body() throws RecognitionException {
        If_bodyContext _localctx = new If_bodyContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_if_body);
        ((If_bodyContext) _localctx).ret = new ArrayList<NgxToken>();
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(124);
                ((If_bodyContext) _localctx).id = match(T__4);
                _localctx.ret.add(new NgxToken((((If_bodyContext) _localctx).id != null ? ((If_bodyContext) _localctx).id.getText() : null)));
                setState(126);
                ((If_bodyContext) _localctx).Value = match(Value);
                _localctx.ret.add(new NgxToken((((If_bodyContext) _localctx).Value != null ? ((If_bodyContext) _localctx).Value.getText() : null)));
                setState(130);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
                    case 1: {
                        setState(128);
                        ((If_bodyContext) _localctx).Value = match(Value);
                        _localctx.ret.add(new NgxToken((((If_bodyContext) _localctx).Value != null ? ((If_bodyContext) _localctx).Value.getText() : null)));
                    }
                    break;
                }
                setState(137);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 14, _ctx)) {
                    case 1: {
                        setState(132);
                        ((If_bodyContext) _localctx).Value = match(Value);
                        _localctx.ret.add(new NgxToken((((If_bodyContext) _localctx).Value != null ? ((If_bodyContext) _localctx).Value.getText() : null)));
                    }
                    break;
                    case 2: {
                        setState(134);
                        ((If_bodyContext) _localctx).regexp = regexp();
                        _localctx.ret.add(new NgxToken(((If_bodyContext) _localctx).regexp.ret));
                    }
                    break;
                }
                setState(139);
                ((If_bodyContext) _localctx).id = match(T__5);
                _localctx.ret.add(new NgxToken((((If_bodyContext) _localctx).id != null ? ((If_bodyContext) _localctx).id.getText() : null)));
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class RegexpContext extends ParserRuleContext {
        public String ret;
        public Token id;
        public Token Value;
        public RegexpContext r;

        public List<TerminalNode> Value() {
            return getTokens(NginxParser.Value);
        }

        public TerminalNode Value(int i) {
            return getToken(NginxParser.Value, i);
        }

        public List<RegexpContext> regexp() {
            return getRuleContexts(RegexpContext.class);
        }

        public RegexpContext regexp(int i) {
            return getRuleContext(RegexpContext.class, i);
        }

        public RegexpContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_regexp;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof NginxListener) ((NginxListener) listener).enterRegexp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof NginxListener) ((NginxListener) listener).exitRegexp(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof NginxVisitor) return ((NginxVisitor<? extends T>) visitor).visitRegexp(this);
            else return visitor.visitChildren(this);
        }
    }

    public final RegexpContext regexp() throws RecognitionException {
        RegexpContext _localctx = new RegexpContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_regexp);
        ((RegexpContext) _localctx).ret = "";
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(153);
                _errHandler.sync(this);
                _alt = 1;
                do {
                    switch (_alt) {
                        case 1: {
                            setState(153);
                            _errHandler.sync(this);
                            switch (_input.LA(1)) {
                                case T__6: {
                                    setState(142);
                                    ((RegexpContext) _localctx).id = match(T__6);
                                    _localctx.ret += (((RegexpContext) _localctx).id != null ? ((RegexpContext) _localctx).id.getText() : null);
                                }
                                break;
                                case T__7: {
                                    setState(144);
                                    ((RegexpContext) _localctx).id = match(T__7);
                                    _localctx.ret += (((RegexpContext) _localctx).id != null ? ((RegexpContext) _localctx).id.getText() : null);
                                }
                                break;
                                case Value: {
                                    setState(146);
                                    ((RegexpContext) _localctx).Value = match(Value);
                                    _localctx.ret += (((RegexpContext) _localctx).Value != null ? ((RegexpContext) _localctx).Value.getText() : null);
                                }
                                break;
                                case T__4: {
                                    setState(148);
                                    match(T__4);
                                    setState(149);
                                    ((RegexpContext) _localctx).r = regexp();
                                    _localctx.ret += "(".concat(((RegexpContext) _localctx).r.ret).concat(")");
                                    setState(151);
                                    match(T__5);
                                }
                                break;
                                default:
                                    throw new NoViableAltException(this);
                            }
                        }
                        break;
                        default:
                            throw new NoViableAltException(this);
                    }
                    setState(155);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 16, _ctx);
                } while (_alt != 2 && _alt != ATN.INVALID_ALT_NUMBER);
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class LocationBlockHeaderContext extends ParserRuleContext {
        public List<NgxToken> ret;
        public Token id;
        public Token Value;
        public RegexpContext regexp;

        public List<TerminalNode> Value() {
            return getTokens(NginxParser.Value);
        }

        public TerminalNode Value(int i) {
            return getToken(NginxParser.Value, i);
        }

        public RegexpContext regexp() {
            return getRuleContext(RegexpContext.class, 0);
        }

        public LocationBlockHeaderContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_locationBlockHeader;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof NginxListener) ((NginxListener) listener).enterLocationBlockHeader(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof NginxListener) ((NginxListener) listener).exitLocationBlockHeader(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof NginxVisitor)
                return ((NginxVisitor<? extends T>) visitor).visitLocationBlockHeader(this);
            else return visitor.visitChildren(this);
        }
    }

    public final LocationBlockHeaderContext locationBlockHeader() throws RecognitionException {
        LocationBlockHeaderContext _localctx = new LocationBlockHeaderContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_locationBlockHeader);
        ((LocationBlockHeaderContext) _localctx).ret = new ArrayList<NgxToken>();
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(157);
                ((LocationBlockHeaderContext) _localctx).id = match(T__8);
                _localctx.ret.add(new NgxToken((((LocationBlockHeaderContext) _localctx).id != null ? ((LocationBlockHeaderContext) _localctx).id.getText() : null)));
                setState(161);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 17, _ctx)) {
                    case 1: {
                        setState(159);
                        ((LocationBlockHeaderContext) _localctx).Value = match(Value);
                        _localctx.ret.add(new NgxToken((((LocationBlockHeaderContext) _localctx).Value != null ? ((LocationBlockHeaderContext) _localctx).Value.getText() : null)));
                    }
                    break;
                }
                setState(168);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 18, _ctx)) {
                    case 1: {
                        setState(163);
                        ((LocationBlockHeaderContext) _localctx).Value = match(Value);
                        _localctx.ret.add(new NgxToken((((LocationBlockHeaderContext) _localctx).Value != null ? ((LocationBlockHeaderContext) _localctx).Value.getText() : null)));
                    }
                    break;
                    case 2: {
                        setState(165);
                        ((LocationBlockHeaderContext) _localctx).regexp = regexp();
                        _localctx.ret.add(new NgxToken(((LocationBlockHeaderContext) _localctx).regexp.ret));
                    }
                    break;
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @SuppressWarnings("CheckReturnValue")
    public static class RewriteStatementContext extends ParserRuleContext {
        public NgxParam ret;
        public Token id;
        public Token Value;
        public RegexpContext regexp;
        public Token opt;

        public List<TerminalNode> Value() {
            return getTokens(NginxParser.Value);
        }

        public TerminalNode Value(int i) {
            return getToken(NginxParser.Value, i);
        }

        public RegexpContext regexp() {
            return getRuleContext(RegexpContext.class, 0);
        }

        public RewriteStatementContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_rewriteStatement;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof NginxListener) ((NginxListener) listener).enterRewriteStatement(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof NginxListener) ((NginxListener) listener).exitRewriteStatement(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof NginxVisitor)
                return ((NginxVisitor<? extends T>) visitor).visitRewriteStatement(this);
            else return visitor.visitChildren(this);
        }
    }

    public final RewriteStatementContext rewriteStatement() throws RecognitionException {
        RewriteStatementContext _localctx = new RewriteStatementContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_rewriteStatement);
        ((RewriteStatementContext) _localctx).ret = new NgxParam();
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(170);
                ((RewriteStatementContext) _localctx).id = match(T__9);
                _localctx.ret.addValue((((RewriteStatementContext) _localctx).id != null ? ((RewriteStatementContext) _localctx).id.getText() : null));
                setState(177);
                _errHandler.sync(this);
                switch (getInterpreter().adaptivePredict(_input, 19, _ctx)) {
                    case 1: {
                        setState(172);
                        ((RewriteStatementContext) _localctx).Value = match(Value);
                        _localctx.ret.addValue((((RewriteStatementContext) _localctx).Value != null ? ((RewriteStatementContext) _localctx).Value.getText() : null));
                    }
                    break;
                    case 2: {
                        setState(174);
                        ((RewriteStatementContext) _localctx).regexp = regexp();
                        _localctx.ret.addValue(((RewriteStatementContext) _localctx).regexp.ret);
                    }
                    break;
                }
                setState(179);
                ((RewriteStatementContext) _localctx).Value = match(Value);
                _localctx.ret.addValue((((RewriteStatementContext) _localctx).Value != null ? ((RewriteStatementContext) _localctx).Value.getText() : null));
                setState(183);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 30720L) != 0)) {
                    {
                        setState(181);
                        ((RewriteStatementContext) _localctx).opt = _input.LT(1);
                        _la = _input.LA(1);
                        if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & 30720L) != 0))) {
                            ((RewriteStatementContext) _localctx).opt = (Token) _errHandler.recoverInline(this);
                        } else {
                            if (_input.LA(1) == Token.EOF) matchedEOF = true;
                            _errHandler.reportMatch(this);
                            consume();
                        }
                        _localctx.ret.addValue((((RewriteStatementContext) _localctx).opt != null ? ((RewriteStatementContext) _localctx).opt.getText() : null));
                    }
                }

            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static final String _serializedATN =
        "\u0004\u0001\u0015\u00ba\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001" +
            "\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004" +
            "\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007" +
            "\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000" +
            "\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000" +
            "\u0004\u0000\u001f\b\u0000\u000b\u0000\f\u0000 \u0001\u0001\u0001\u0001" +
            "\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001" +
            "\u0001\u0001\u0003\u0001,\b\u0001\u0001\u0001\u0001\u0001\u0001\u0002" +
            "\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002" +
            "\u0005\u00027\b\u0002\n\u0002\f\u0002:\t\u0002\u0001\u0003\u0001\u0003" +
            "\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004" +
            "\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004G\b\u0004\u0001\u0004" +
            "\u0003\u0004J\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004" +
            "\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004" +
            "\u0001\u0004\u0001\u0004\u0005\u0004X\b\u0004\n\u0004\f\u0004[\t\u0004" +
            "\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005" +
            "\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005f\b\u0005\n\u0005\f\u0005" +
            "i\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006" +
            "\u0003\u0006p\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006" +
            "\u0005\u0006v\b\u0006\n\u0006\f\u0006y\t\u0006\u0001\u0006\u0001\u0006" +
            "\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007" +
            "\u0003\u0007\u0083\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007" +
            "\u0001\u0007\u0003\u0007\u008a\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007" +
            "\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001" +
            "\b\u0001\b\u0001\b\u0004\b\u009a\b\b\u000b\b\f\b\u009b\u0001\t\u0001\t" +
            "\u0001\t\u0001\t\u0003\t\u00a2\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001" +
            "\t\u0003\t\u00a9\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001" +
            "\n\u0003\n\u00b2\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00b8\b\n" +
            "\u0001\n\u0000\u0000\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012" +
            "\u0014\u0000\u0001\u0001\u0000\u000b\u000e\u00ca\u0000\u001e\u0001\u0000" +
            "\u0000\u0000\u0002+\u0001\u0000\u0000\u0000\u0004/\u0001\u0000\u0000\u0000" +
            "\u0006;\u0001\u0000\u0000\u0000\bF\u0001\u0000\u0000\u0000\n^\u0001\u0000" +
            "\u0000\u0000\fj\u0001\u0000\u0000\u0000\u000e|\u0001\u0000\u0000\u0000" +
            "\u0010\u0099\u0001\u0000\u0000\u0000\u0012\u009d\u0001\u0000\u0000\u0000" +
            "\u0014\u00aa\u0001\u0000\u0000\u0000\u0016\u0017\u0003\u0002\u0001\u0000" +
            "\u0017\u0018\u0006\u0000\uffff\uffff\u0000\u0018\u001f\u0001\u0000\u0000" +
            "\u0000\u0019\u001a\u0003\b\u0004\u0000\u001a\u001b\u0006\u0000\uffff\uffff" +
            "\u0000\u001b\u001f\u0001\u0000\u0000\u0000\u001c\u001d\u0005\u0011\u0000" +
            "\u0000\u001d\u001f\u0006\u0000\uffff\uffff\u0000\u001e\u0016\u0001\u0000" +
            "\u0000\u0000\u001e\u0019\u0001\u0000\u0000\u0000\u001e\u001c\u0001\u0000" +
            "\u0000\u0000\u001f \u0001\u0000\u0000\u0000 \u001e\u0001\u0000\u0000\u0000" +
            " !\u0001\u0000\u0000\u0000!\u0001\u0001\u0000\u0000\u0000\"#\u0003\u0014" +
            "\n\u0000#$\u0006\u0001\uffff\uffff\u0000$,\u0001\u0000\u0000\u0000%&\u0003" +
            "\u0004\u0002\u0000&\'\u0006\u0001\uffff\uffff\u0000\',\u0001\u0000\u0000" +
            "\u0000()\u0003\u0006\u0003\u0000)*\u0006\u0001\uffff\uffff\u0000*,\u0001" +
            "\u0000\u0000\u0000+\"\u0001\u0000\u0000\u0000+%\u0001\u0000\u0000\u0000" +
            "+(\u0001\u0000\u0000\u0000,-\u0001\u0000\u0000\u0000-.\u0005\u0001\u0000" +
            "\u0000.\u0003\u0001\u0000\u0000\u0000/0\u0005\u000f\u0000\u000008\u0006" +
            "\u0002\uffff\uffff\u000012\u0005\u000f\u0000\u000027\u0006\u0002\uffff" +
            "\uffff\u000034\u0003\u0010\b\u000045\u0006\u0002\uffff\uffff\u000057\u0001" +
            "\u0000\u0000\u000061\u0001\u0000\u0000\u000063\u0001\u0000\u0000\u0000" +
            "7:\u0001\u0000\u0000\u000086\u0001\u0000\u0000\u000089\u0001\u0000\u0000" +
            "\u00009\u0005\u0001\u0000\u0000\u0000:8\u0001\u0000\u0000\u0000;<\u0005" +
            "\u0012\u0000\u0000<=\u0006\u0003\uffff\uffff\u0000=>\u0005\u000f\u0000" +
            "\u0000>?\u0006\u0003\uffff\uffff\u0000?\u0007\u0001\u0000\u0000\u0000" +
            "@A\u0003\u0012\t\u0000AB\u0006\u0004\uffff\uffff\u0000BG\u0001\u0000\u0000" +
            "\u0000CD\u0003\n\u0005\u0000DE\u0006\u0004\uffff\uffff\u0000EG\u0001\u0000" +
            "\u0000\u0000F@\u0001\u0000\u0000\u0000FC\u0001\u0000\u0000\u0000GI\u0001" +
            "\u0000\u0000\u0000HJ\u0005\u0011\u0000\u0000IH\u0001\u0000\u0000\u0000" +
            "IJ\u0001\u0000\u0000\u0000JK\u0001\u0000\u0000\u0000KY\u0005\u0002\u0000" +
            "\u0000LM\u0003\u0002\u0001\u0000MN\u0006\u0004\uffff\uffff\u0000NX\u0001" +
            "\u0000\u0000\u0000OP\u0003\b\u0004\u0000PQ\u0006\u0004\uffff\uffff\u0000" +
            "QX\u0001\u0000\u0000\u0000RS\u0003\f\u0006\u0000ST\u0006\u0004\uffff\uffff" +
            "\u0000TX\u0001\u0000\u0000\u0000UV\u0005\u0011\u0000\u0000VX\u0006\u0004" +
            "\uffff\uffff\u0000WL\u0001\u0000\u0000\u0000WO\u0001\u0000\u0000\u0000" +
            "WR\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000X[\u0001\u0000\u0000" +
            "\u0000YW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Z\\\u0001\u0000" +
            "\u0000\u0000[Y\u0001\u0000\u0000\u0000\\]\u0005\u0003\u0000\u0000]\t\u0001" +
            "\u0000\u0000\u0000^_\u0005\u000f\u0000\u0000_g\u0006\u0005\uffff\uffff" +
            "\u0000`a\u0005\u000f\u0000\u0000af\u0006\u0005\uffff\uffff\u0000bc\u0003" +
            "\u0010\b\u0000cd\u0006\u0005\uffff\uffff\u0000df\u0001\u0000\u0000\u0000" +
            "e`\u0001\u0000\u0000\u0000eb\u0001\u0000\u0000\u0000fi\u0001\u0000\u0000" +
            "\u0000ge\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000h\u000b\u0001" +
            "\u0000\u0000\u0000ig\u0001\u0000\u0000\u0000jk\u0005\u0004\u0000\u0000" +
            "kl\u0006\u0006\uffff\uffff\u0000lm\u0003\u000e\u0007\u0000mo\u0006\u0006" +
            "\uffff\uffff\u0000np\u0005\u0011\u0000\u0000on\u0001\u0000\u0000\u0000" +
            "op\u0001\u0000\u0000\u0000pq\u0001\u0000\u0000\u0000qw\u0005\u0002\u0000" +
            "\u0000rs\u0003\u0002\u0001\u0000st\u0006\u0006\uffff\uffff\u0000tv\u0001" +
            "\u0000\u0000\u0000ur\u0001\u0000\u0000\u0000vy\u0001\u0000\u0000\u0000" +
            "wu\u0001\u0000\u0000\u0000wx\u0001\u0000\u0000\u0000xz\u0001\u0000\u0000" +
            "\u0000yw\u0001\u0000\u0000\u0000z{\u0005\u0003\u0000\u0000{\r\u0001\u0000" +
            "\u0000\u0000|}\u0005\u0005\u0000\u0000}~\u0006\u0007\uffff\uffff\u0000" +
            "~\u007f\u0005\u000f\u0000\u0000\u007f\u0082\u0006\u0007\uffff\uffff\u0000" +
            "\u0080\u0081\u0005\u000f\u0000\u0000\u0081\u0083\u0006\u0007\uffff\uffff" +
            "\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000\u0000" +
            "\u0000\u0083\u0089\u0001\u0000\u0000\u0000\u0084\u0085\u0005\u000f\u0000" +
            "\u0000\u0085\u008a\u0006\u0007\uffff\uffff\u0000\u0086\u0087\u0003\u0010" +
            "\b\u0000\u0087\u0088\u0006\u0007\uffff\uffff\u0000\u0088\u008a\u0001\u0000" +
            "\u0000\u0000\u0089\u0084\u0001\u0000\u0000\u0000\u0089\u0086\u0001\u0000" +
            "\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000\u008a\u008b\u0001\u0000" +
            "\u0000\u0000\u008b\u008c\u0005\u0006\u0000\u0000\u008c\u008d\u0006\u0007" +
            "\uffff\uffff\u0000\u008d\u000f\u0001\u0000\u0000\u0000\u008e\u008f\u0005" +
            "\u0007\u0000\u0000\u008f\u009a\u0006\b\uffff\uffff\u0000\u0090\u0091\u0005" +
            "\b\u0000\u0000\u0091\u009a\u0006\b\uffff\uffff\u0000\u0092\u0093\u0005" +
            "\u000f\u0000\u0000\u0093\u009a\u0006\b\uffff\uffff\u0000\u0094\u0095\u0005" +
            "\u0005\u0000\u0000\u0095\u0096\u0003\u0010\b\u0000\u0096\u0097\u0006\b" +
            "\uffff\uffff\u0000\u0097\u0098\u0005\u0006\u0000\u0000\u0098\u009a\u0001" +
            "\u0000\u0000\u0000\u0099\u008e\u0001\u0000\u0000\u0000\u0099\u0090\u0001" +
            "\u0000\u0000\u0000\u0099\u0092\u0001\u0000\u0000\u0000\u0099\u0094\u0001" +
            "\u0000\u0000\u0000\u009a\u009b\u0001\u0000\u0000\u0000\u009b\u0099\u0001" +
            "\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u0011\u0001" +
            "\u0000\u0000\u0000\u009d\u009e\u0005\t\u0000\u0000\u009e\u00a1\u0006\t" +
            "\uffff\uffff\u0000\u009f\u00a0\u0005\u000f\u0000\u0000\u00a0\u00a2\u0006" +
            "\t\uffff\uffff\u0000\u00a1\u009f\u0001\u0000\u0000\u0000\u00a1\u00a2\u0001" +
            "\u0000\u0000\u0000\u00a2\u00a8\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005" +
            "\u000f\u0000\u0000\u00a4\u00a9\u0006\t\uffff\uffff\u0000\u00a5\u00a6\u0003" +
            "\u0010\b\u0000\u00a6\u00a7\u0006\t\uffff\uffff\u0000\u00a7\u00a9\u0001" +
            "\u0000\u0000\u0000\u00a8\u00a3\u0001\u0000\u0000\u0000\u00a8\u00a5\u0001" +
            "\u0000\u0000\u0000\u00a9\u0013\u0001\u0000\u0000\u0000\u00aa\u00ab\u0005" +
            "\n\u0000\u0000\u00ab\u00b1\u0006\n\uffff\uffff\u0000\u00ac\u00ad\u0005" +
            "\u000f\u0000\u0000\u00ad\u00b2\u0006\n\uffff\uffff\u0000\u00ae\u00af\u0003" +
            "\u0010\b\u0000\u00af\u00b0\u0006\n\uffff\uffff\u0000\u00b0\u00b2\u0001" +
            "\u0000\u0000\u0000\u00b1\u00ac\u0001\u0000\u0000\u0000\u00b1\u00ae\u0001" +
            "\u0000\u0000\u0000\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005" +
            "\u000f\u0000\u0000\u00b4\u00b7\u0006\n\uffff\uffff\u0000\u00b5\u00b6\u0007" +
            "\u0000\u0000\u0000\u00b6\u00b8\u0006\n\uffff\uffff\u0000\u00b7\u00b5\u0001" +
            "\u0000\u0000\u0000\u00b7\u00b8\u0001\u0000\u0000\u0000\u00b8\u0015\u0001" +
            "\u0000\u0000\u0000\u0015\u001e +68FIWYegow\u0082\u0089\u0099\u009b\u00a1" +
            "\u00a8\u00b1\u00b7";
    public static final ATN _ATN =
        new ATNDeserializer().deserialize(_serializedATN.toCharArray());

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}