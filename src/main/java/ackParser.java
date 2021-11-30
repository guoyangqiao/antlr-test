// Generated from /Users/guoyangqiao/Projects/java/antlr4-test/src/main/resources/ack.g4 by ANTLR 4.9.2

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class ackParser extends Parser {
    public static final int
            T__0 = 1, T__1 = 2, T__2 = 3, T__3 = 4, T__4 = 5, T__5 = 6, T__6 = 7, T__7 = 8, T__8 = 9,
            T__9 = 10, T__10 = 11, T__11 = 12, T__12 = 13, T__13 = 14, T__14 = 15, T__15 = 16, T__16 = 17,
            T__17 = 18, ID = 19, POSITIVE_INT = 20, NEWLINE = 21, WS = 22;
    public static final int
            RULE_prog = 0, RULE_stat = 1, RULE_expr = 2, RULE_url = 3, RULE_select_clause = 4,
            RULE_from_clause = 5, RULE_limit_clause = 6, RULE_where_clause = 7, RULE_comparable = 8,
            RULE_field = 9;
    public static final String[] ruleNames = makeRuleNames();
    /**
     * @deprecated Use {@link #VOCABULARY} instead.
     */
    @Deprecated
    public static final String[] tokenNames;
    public static final String _serializedATN =
            "\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\30w\4\2\t\2\4\3\t" +
                    "\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3" +
                    "\2\6\2\30\n\2\r\2\16\2\31\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3" +
                    "&\n\3\3\4\3\4\3\4\3\4\3\4\3\4\5\4.\n\4\3\4\3\4\5\4\62\n\4\3\4\3\4\3\4" +
                    "\3\4\3\4\3\4\3\4\3\4\5\4<\n\4\3\5\3\5\3\5\3\5\5\5B\n\5\3\6\3\6\3\6\5\6" +
                    "G\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7R\n\7\3\b\3\b\3\t\3\t\3\t" +
                    "\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tf\n\t\3\n\3\n" +
                    "\5\nj\n\n\3\13\3\13\3\13\3\13\3\13\3\13\7\13r\n\13\f\13\16\13u\13\13\3" +
                    "\13\2\3\24\f\2\4\6\b\n\f\16\20\22\24\2\2\2}\2\27\3\2\2\2\4%\3\2\2\2\6" +
                    ";\3\2\2\2\b=\3\2\2\2\nC\3\2\2\2\fQ\3\2\2\2\16S\3\2\2\2\20e\3\2\2\2\22" +
                    "i\3\2\2\2\24k\3\2\2\2\26\30\5\4\3\2\27\26\3\2\2\2\30\31\3\2\2\2\31\27" +
                    "\3\2\2\2\31\32\3\2\2\2\32\3\3\2\2\2\33\34\5\6\4\2\34\35\7\27\2\2\35&\3" +
                    "\2\2\2\36\37\7\3\2\2\37 \7\25\2\2 !\7\4\2\2!\"\5\6\4\2\"#\7\27\2\2#&\3" +
                    "\2\2\2$&\7\27\2\2%\33\3\2\2\2%\36\3\2\2\2%$\3\2\2\2&\5\3\2\2\2\'(\7\5" +
                    "\2\2()\5\n\6\2)*\7\6\2\2*-\5\f\7\2+,\7\7\2\2,.\5\20\t\2-+\3\2\2\2-.\3" +
                    "\2\2\2.\61\3\2\2\2/\60\7\b\2\2\60\62\5\16\b\2\61/\3\2\2\2\61\62\3\2\2" +
                    "\2\62<\3\2\2\2\63<\5\24\13\2\64<\7\26\2\2\65\66\7\t\2\2\66\67\7\n\2\2" +
                    "\678\7\25\2\28<\7\13\2\29:\7\f\2\2:<\5\b\5\2;\'\3\2\2\2;\63\3\2\2\2;\64" +
                    "\3\2\2\2;\65\3\2\2\2;9\3\2\2\2<\7\3\2\2\2=>\7\r\2\2>A\7\25\2\2?@\7\16" +
                    "\2\2@B\7\25\2\2A?\3\2\2\2AB\3\2\2\2B\t\3\2\2\2CF\5\24\13\2DE\7\17\2\2" +
                    "EG\5\24\13\2FD\3\2\2\2FG\3\2\2\2G\13\3\2\2\2HR\5\24\13\2IJ\5\24\13\2J" +
                    "K\7\20\2\2KL\5\24\13\2LM\7\21\2\2MN\5\24\13\2NO\7\4\2\2OP\5\24\13\2PR" +
                    "\3\2\2\2QH\3\2\2\2QI\3\2\2\2R\r\3\2\2\2ST\7\26\2\2T\17\3\2\2\2UV\5\22" +
                    "\n\2VW\7\4\2\2WX\5\22\n\2Xf\3\2\2\2YZ\5\22\n\2Z[\7\22\2\2[\\\5\22\n\2" +
                    "\\f\3\2\2\2]^\5\22\n\2^_\7\23\2\2_`\5\22\n\2`f\3\2\2\2ab\5\22\n\2bc\7" +
                    "\24\2\2cd\5\22\n\2df\3\2\2\2eU\3\2\2\2eY\3\2\2\2e]\3\2\2\2ea\3\2\2\2f" +
                    "\21\3\2\2\2gj\5\24\13\2hj\7\26\2\2ig\3\2\2\2ih\3\2\2\2j\23\3\2\2\2kl\b" +
                    "\13\1\2lm\7\25\2\2ms\3\2\2\2no\f\4\2\2op\7\16\2\2pr\5\24\13\5qn\3\2\2" +
                    "\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\25\3\2\2\2us\3\2\2\2\r\31%-\61;AFQe" +
                    "is";
    public static final ATN _ATN =
            new ATNDeserializer().deserialize(_serializedATN.toCharArray());
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache =
            new PredictionContextCache();
    private static final String[] _LITERAL_NAMES = makeLiteralNames();
    private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
    public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

    static {
        RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION);
    }

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

    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }

    public ackParser(TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    private static String[] makeRuleNames() {
        return new String[]{
                "prog", "stat", "expr", "url", "select_clause", "from_clause", "limit_clause",
                "where_clause", "comparable", "field"
        };
    }

    private static String[] makeLiteralNames() {
        return new String[]{
                null, "'set'", "'='", "'select'", "'from'", "'where'", "'limit'", "'print'",
                "'${'", "'}'", "'visit http'", "'http://'", "'.'", "','", "'join '",
                "'on'", "'<>'", "'>'", "'<'", null, null, "';'"
        };
    }

    private static String[] makeSymbolicNames() {
        return new String[]{
                null, null, null, null, null, null, null, null, null, null, null, null,
                null, null, null, null, null, null, null, "ID", "POSITIVE_INT", "NEWLINE",
                "WS"
        };
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
        return "ack.g4";
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

    public final ProgContext prog() throws RecognitionException {
        ProgContext _localctx = new ProgContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_prog);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(21);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                    {
                        {
                            setState(20);
                            stat();
                        }
                    }
                    setState(23);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                } while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__2) | (1L << T__6) | (1L << T__9) | (1L << ID) | (1L << POSITIVE_INT) | (1L << NEWLINE))) != 0));
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

    public final StatContext stat() throws RecognitionException {
        StatContext _localctx = new StatContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_stat);
        try {
            setState(35);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__2:
                case T__6:
                case T__9:
                case ID:
                case POSITIVE_INT:
                    _localctx = new ExpContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(25);
                    expr();
                    setState(26);
                    match(NEWLINE);
                }
                break;
                case T__0:
                    _localctx = new AssignContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(28);
                    match(T__0);
                    setState(29);
                    match(ID);
                    setState(30);
                    match(T__1);
                    setState(31);
                    expr();
                    setState(32);
                    match(NEWLINE);
                }
                break;
                case NEWLINE:
                    _localctx = new BlankContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(34);
                    match(NEWLINE);
                }
                break;
                default:
                    throw new NoViableAltException(this);
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

    public final ExprContext expr() throws RecognitionException {
        ExprContext _localctx = new ExprContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_expr);
        int _la;
        try {
            setState(57);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case T__2:
                    _localctx = new SelectContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(37);
                    match(T__2);
                    setState(38);
                    select_clause();
                    setState(39);
                    match(T__3);
                    setState(40);
                    from_clause();
                    setState(43);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == T__4) {
                        {
                            setState(41);
                            match(T__4);
                            setState(42);
                            where_clause();
                        }
                    }

                    setState(47);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == T__5) {
                        {
                            setState(45);
                            match(T__5);
                            setState(46);
                            limit_clause();
                        }
                    }

                }
                break;
                case ID:
                    _localctx = new StringContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(49);
                    field(0);
                }
                break;
                case POSITIVE_INT:
                    _localctx = new IntContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(50);
                    match(POSITIVE_INT);
                }
                break;
                case T__6:
                    _localctx = new PrintContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(51);
                    match(T__6);
                    setState(52);
                    match(T__7);
                    setState(53);
                    match(ID);
                    setState(54);
                    match(T__8);
                }
                break;
                case T__9:
                    _localctx = new VisitHttpContext(_localctx);
                    enterOuterAlt(_localctx, 5);
                {
                    setState(55);
                    match(T__9);
                    setState(56);
                    url();
                }
                break;
                default:
                    throw new NoViableAltException(this);
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

    public final UrlContext url() throws RecognitionException {
        UrlContext _localctx = new UrlContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_url);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(59);
                match(T__10);
                setState(60);
                match(ID);
                setState(63);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__11) {
                    {
                        setState(61);
                        match(T__11);
                        setState(62);
                        match(ID);
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

    public final Select_clauseContext select_clause() throws RecognitionException {
        Select_clauseContext _localctx = new Select_clauseContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_select_clause);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(65);
                field(0);
                setState(68);
                _errHandler.sync(this);
                _la = _input.LA(1);
                if (_la == T__12) {
                    {
                        setState(66);
                        match(T__12);
                        setState(67);
                        field(0);
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

    public final From_clauseContext from_clause() throws RecognitionException {
        From_clauseContext _localctx = new From_clauseContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_from_clause);
        try {
            setState(79);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
                case 1:
                    _localctx = new FROM_BASICContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(70);
                    field(0);
                }
                break;
                case 2:
                    _localctx = new FROM_JOINContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(71);
                    field(0);
                    setState(72);
                    match(T__13);
                    setState(73);
                    field(0);
                    setState(74);
                    match(T__14);
                    setState(75);
                    field(0);
                    setState(76);
                    match(T__1);
                    setState(77);
                    field(0);
                }
                break;
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

    public final Limit_clauseContext limit_clause() throws RecognitionException {
        Limit_clauseContext _localctx = new Limit_clauseContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_limit_clause);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(81);
                match(POSITIVE_INT);
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

    public final Where_clauseContext where_clause() throws RecognitionException {
        Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_where_clause);
        try {
            setState(99);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 8, _ctx)) {
                case 1:
                    _localctx = new EQContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(83);
                    comparable();
                    setState(84);
                    match(T__1);
                    setState(85);
                    comparable();
                }
                break;
                case 2:
                    _localctx = new NEQContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(87);
                    comparable();
                    setState(88);
                    match(T__15);
                    setState(89);
                    comparable();
                }
                break;
                case 3:
                    _localctx = new GTContext(_localctx);
                    enterOuterAlt(_localctx, 3);
                {
                    setState(91);
                    comparable();
                    setState(92);
                    match(T__16);
                    setState(93);
                    comparable();
                }
                break;
                case 4:
                    _localctx = new LTContext(_localctx);
                    enterOuterAlt(_localctx, 4);
                {
                    setState(95);
                    comparable();
                    setState(96);
                    match(T__17);
                    setState(97);
                    comparable();
                }
                break;
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

    public final ComparableContext comparable() throws RecognitionException {
        ComparableContext _localctx = new ComparableContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_comparable);
        try {
            setState(103);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
                case ID:
                    _localctx = new C_FIELDContext(_localctx);
                    enterOuterAlt(_localctx, 1);
                {
                    setState(101);
                    field(0);
                }
                break;
                case POSITIVE_INT:
                    _localctx = new P_INTContext(_localctx);
                    enterOuterAlt(_localctx, 2);
                {
                    setState(102);
                    match(POSITIVE_INT);
                }
                break;
                default:
                    throw new NoViableAltException(this);
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

    public final FieldContext field() throws RecognitionException {
        return field(0);
    }

    private FieldContext field(int _p) throws RecognitionException {
        ParserRuleContext _parentctx = _ctx;
        int _parentState = getState();
        FieldContext _localctx = new FieldContext(_ctx, _parentState);
        FieldContext _prevctx = _localctx;
        int _startState = 18;
        enterRecursionRule(_localctx, 18, RULE_field, _p);
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                {
                    _localctx = new ATOMICContext(_localctx);
                    _ctx = _localctx;
                    _prevctx = _localctx;

                    setState(106);
                    match(ID);
                }
                _ctx.stop = _input.LT(-1);
                setState(113);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 10, _ctx);
                while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                    if (_alt == 1) {
                        if (_parseListeners != null) triggerExitRuleEvent();
                        _prevctx = _localctx;
                        {
                            {
                                _localctx = new RECURISVE_REFContext(new FieldContext(_parentctx, _parentState));
                                pushNewRecursionContext(_localctx, _startState, RULE_field);
                                setState(108);
                                if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
                                setState(109);
                                match(T__11);
                                setState(110);
                                field(3);
                            }
                        }
                    }
                    setState(115);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 10, _ctx);
                }
            }
        } catch (RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
        switch (ruleIndex) {
            case 9:
                return field_sempred((FieldContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean field_sempred(FieldContext _localctx, int predIndex) {
        switch (predIndex) {
            case 0:
                return precpred(_ctx, 2);
        }
        return true;
    }

    public static class ProgContext extends ParserRuleContext {
        public ProgContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<StatContext> stat() {
            return getRuleContexts(StatContext.class);
        }

        public StatContext stat(int i) {
            return getRuleContext(StatContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_prog;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ackListener) ((ackListener) listener).enterProg(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ackListener) ((ackListener) listener).exitProg(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ackVisitor) return ((ackVisitor<? extends T>) visitor).visitProg(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class StatContext extends ParserRuleContext {
        public StatContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public StatContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_stat;
        }

        public void copyFrom(StatContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class BlankContext extends StatContext {
        public BlankContext(StatContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode NEWLINE() {
            return getToken(ackParser.NEWLINE, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ackListener) ((ackListener) listener).enterBlank(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ackListener) ((ackListener) listener).exitBlank(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ackVisitor) return ((ackVisitor<? extends T>) visitor).visitBlank(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ExpContext extends StatContext {
        public ExpContext(StatContext ctx) {
            copyFrom(ctx);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode NEWLINE() {
            return getToken(ackParser.NEWLINE, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ackListener) ((ackListener) listener).enterExp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ackListener) ((ackListener) listener).exitExp(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ackVisitor) return ((ackVisitor<? extends T>) visitor).visitExp(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class AssignContext extends StatContext {
        public AssignContext(StatContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode ID() {
            return getToken(ackParser.ID, 0);
        }

        public ExprContext expr() {
            return getRuleContext(ExprContext.class, 0);
        }

        public TerminalNode NEWLINE() {
            return getToken(ackParser.NEWLINE, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ackListener) ((ackListener) listener).enterAssign(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ackListener) ((ackListener) listener).exitAssign(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ackVisitor) return ((ackVisitor<? extends T>) visitor).visitAssign(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ExprContext extends ParserRuleContext {
        public ExprContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ExprContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_expr;
        }

        public void copyFrom(ExprContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class PrintContext extends ExprContext {
        public PrintContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode ID() {
            return getToken(ackParser.ID, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ackListener) ((ackListener) listener).enterPrint(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ackListener) ((ackListener) listener).exitPrint(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ackVisitor) return ((ackVisitor<? extends T>) visitor).visitPrint(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class SelectContext extends ExprContext {
        public SelectContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public Select_clauseContext select_clause() {
            return getRuleContext(Select_clauseContext.class, 0);
        }

        public From_clauseContext from_clause() {
            return getRuleContext(From_clauseContext.class, 0);
        }

        public Where_clauseContext where_clause() {
            return getRuleContext(Where_clauseContext.class, 0);
        }

        public Limit_clauseContext limit_clause() {
            return getRuleContext(Limit_clauseContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ackListener) ((ackListener) listener).enterSelect(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ackListener) ((ackListener) listener).exitSelect(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ackVisitor) return ((ackVisitor<? extends T>) visitor).visitSelect(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class StringContext extends ExprContext {
        public StringContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public FieldContext field() {
            return getRuleContext(FieldContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ackListener) ((ackListener) listener).enterString(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ackListener) ((ackListener) listener).exitString(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ackVisitor) return ((ackVisitor<? extends T>) visitor).visitString(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class VisitHttpContext extends ExprContext {
        public VisitHttpContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public UrlContext url() {
            return getRuleContext(UrlContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ackListener) ((ackListener) listener).enterVisitHttp(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ackListener) ((ackListener) listener).exitVisitHttp(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ackVisitor) return ((ackVisitor<? extends T>) visitor).visitVisitHttp(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class IntContext extends ExprContext {
        public IntContext(ExprContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode POSITIVE_INT() {
            return getToken(ackParser.POSITIVE_INT, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ackListener) ((ackListener) listener).enterInt(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ackListener) ((ackListener) listener).exitInt(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ackVisitor) return ((ackVisitor<? extends T>) visitor).visitInt(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class UrlContext extends ParserRuleContext {
        public UrlContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<TerminalNode> ID() {
            return getTokens(ackParser.ID);
        }

        public TerminalNode ID(int i) {
            return getToken(ackParser.ID, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_url;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ackListener) ((ackListener) listener).enterUrl(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ackListener) ((ackListener) listener).exitUrl(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ackVisitor) return ((ackVisitor<? extends T>) visitor).visitUrl(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Select_clauseContext extends ParserRuleContext {
        public Select_clauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public List<FieldContext> field() {
            return getRuleContexts(FieldContext.class);
        }

        public FieldContext field(int i) {
            return getRuleContext(FieldContext.class, i);
        }

        @Override
        public int getRuleIndex() {
            return RULE_select_clause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ackListener) ((ackListener) listener).enterSelect_clause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ackListener) ((ackListener) listener).exitSelect_clause(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ackVisitor) return ((ackVisitor<? extends T>) visitor).visitSelect_clause(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class From_clauseContext extends ParserRuleContext {
        public From_clauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public From_clauseContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_from_clause;
        }

        public void copyFrom(From_clauseContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class FROM_BASICContext extends From_clauseContext {
        public FROM_BASICContext(From_clauseContext ctx) {
            copyFrom(ctx);
        }

        public FieldContext field() {
            return getRuleContext(FieldContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ackListener) ((ackListener) listener).enterFROM_BASIC(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ackListener) ((ackListener) listener).exitFROM_BASIC(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ackVisitor) return ((ackVisitor<? extends T>) visitor).visitFROM_BASIC(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FROM_JOINContext extends From_clauseContext {
        public FROM_JOINContext(From_clauseContext ctx) {
            copyFrom(ctx);
        }

        public List<FieldContext> field() {
            return getRuleContexts(FieldContext.class);
        }

        public FieldContext field(int i) {
            return getRuleContext(FieldContext.class, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ackListener) ((ackListener) listener).enterFROM_JOIN(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ackListener) ((ackListener) listener).exitFROM_JOIN(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ackVisitor) return ((ackVisitor<? extends T>) visitor).visitFROM_JOIN(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Limit_clauseContext extends ParserRuleContext {
        public Limit_clauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public TerminalNode POSITIVE_INT() {
            return getToken(ackParser.POSITIVE_INT, 0);
        }

        @Override
        public int getRuleIndex() {
            return RULE_limit_clause;
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ackListener) ((ackListener) listener).enterLimit_clause(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ackListener) ((ackListener) listener).exitLimit_clause(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ackVisitor) return ((ackVisitor<? extends T>) visitor).visitLimit_clause(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class Where_clauseContext extends ParserRuleContext {
        public Where_clauseContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public Where_clauseContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_where_clause;
        }

        public void copyFrom(Where_clauseContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class LTContext extends Where_clauseContext {
        public LTContext(Where_clauseContext ctx) {
            copyFrom(ctx);
        }

        public List<ComparableContext> comparable() {
            return getRuleContexts(ComparableContext.class);
        }

        public ComparableContext comparable(int i) {
            return getRuleContext(ComparableContext.class, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ackListener) ((ackListener) listener).enterLT(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ackListener) ((ackListener) listener).exitLT(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ackVisitor) return ((ackVisitor<? extends T>) visitor).visitLT(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class NEQContext extends Where_clauseContext {
        public NEQContext(Where_clauseContext ctx) {
            copyFrom(ctx);
        }

        public List<ComparableContext> comparable() {
            return getRuleContexts(ComparableContext.class);
        }

        public ComparableContext comparable(int i) {
            return getRuleContext(ComparableContext.class, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ackListener) ((ackListener) listener).enterNEQ(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ackListener) ((ackListener) listener).exitNEQ(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ackVisitor) return ((ackVisitor<? extends T>) visitor).visitNEQ(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class EQContext extends Where_clauseContext {
        public EQContext(Where_clauseContext ctx) {
            copyFrom(ctx);
        }

        public List<ComparableContext> comparable() {
            return getRuleContexts(ComparableContext.class);
        }

        public ComparableContext comparable(int i) {
            return getRuleContext(ComparableContext.class, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ackListener) ((ackListener) listener).enterEQ(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ackListener) ((ackListener) listener).exitEQ(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ackVisitor) return ((ackVisitor<? extends T>) visitor).visitEQ(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class GTContext extends Where_clauseContext {
        public GTContext(Where_clauseContext ctx) {
            copyFrom(ctx);
        }

        public List<ComparableContext> comparable() {
            return getRuleContexts(ComparableContext.class);
        }

        public ComparableContext comparable(int i) {
            return getRuleContext(ComparableContext.class, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ackListener) ((ackListener) listener).enterGT(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ackListener) ((ackListener) listener).exitGT(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ackVisitor) return ((ackVisitor<? extends T>) visitor).visitGT(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class ComparableContext extends ParserRuleContext {
        public ComparableContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public ComparableContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_comparable;
        }

        public void copyFrom(ComparableContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class P_INTContext extends ComparableContext {
        public P_INTContext(ComparableContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode POSITIVE_INT() {
            return getToken(ackParser.POSITIVE_INT, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ackListener) ((ackListener) listener).enterP_INT(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ackListener) ((ackListener) listener).exitP_INT(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ackVisitor) return ((ackVisitor<? extends T>) visitor).visitP_INT(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class C_FIELDContext extends ComparableContext {
        public C_FIELDContext(ComparableContext ctx) {
            copyFrom(ctx);
        }

        public FieldContext field() {
            return getRuleContext(FieldContext.class, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ackListener) ((ackListener) listener).enterC_FIELD(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ackListener) ((ackListener) listener).exitC_FIELD(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ackVisitor) return ((ackVisitor<? extends T>) visitor).visitC_FIELD(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class FieldContext extends ParserRuleContext {
        public FieldContext(ParserRuleContext parent, int invokingState) {
            super(parent, invokingState);
        }

        public FieldContext() {
        }

        @Override
        public int getRuleIndex() {
            return RULE_field;
        }

        public void copyFrom(FieldContext ctx) {
            super.copyFrom(ctx);
        }
    }

    public static class ATOMICContext extends FieldContext {
        public ATOMICContext(FieldContext ctx) {
            copyFrom(ctx);
        }

        public TerminalNode ID() {
            return getToken(ackParser.ID, 0);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ackListener) ((ackListener) listener).enterATOMIC(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ackListener) ((ackListener) listener).exitATOMIC(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ackVisitor) return ((ackVisitor<? extends T>) visitor).visitATOMIC(this);
            else return visitor.visitChildren(this);
        }
    }

    public static class RECURISVE_REFContext extends FieldContext {
        public RECURISVE_REFContext(FieldContext ctx) {
            copyFrom(ctx);
        }

        public List<FieldContext> field() {
            return getRuleContexts(FieldContext.class);
        }

        public FieldContext field(int i) {
            return getRuleContext(FieldContext.class, i);
        }

        @Override
        public void enterRule(ParseTreeListener listener) {
            if (listener instanceof ackListener) ((ackListener) listener).enterRECURISVE_REF(this);
        }

        @Override
        public void exitRule(ParseTreeListener listener) {
            if (listener instanceof ackListener) ((ackListener) listener).exitRECURISVE_REF(this);
        }

        @Override
        public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof ackVisitor) return ((ackVisitor<? extends T>) visitor).visitRECURISVE_REF(this);
            else return visitor.visitChildren(this);
        }
    }
}