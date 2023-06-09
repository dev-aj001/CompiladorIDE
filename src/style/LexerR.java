package style;

// DO NOT EDIT
// Generated by JFlex 1.9.1 http://jflex.de/
// source: src/lexico/Lexer.flex

import vista.*;
import lexico.*;
import compilerTools.Token;


@SuppressWarnings("fallthrough")
class LexerR {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0, 0
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\11\0\1\1\1\2\1\3\1\1\1\4\22\0\1\1"+
    "\1\5\1\6\3\0\1\7\1\0\1\10\1\11\1\12"+
    "\1\13\1\14\1\15\1\16\1\17\1\20\11\21\1\0"+
    "\1\22\1\23\1\24\1\23\2\0\14\25\1\26\15\25"+
    "\1\27\1\0\1\30\1\0\1\25\1\0\1\31\1\32"+
    "\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42"+
    "\1\25\1\43\1\44\1\45\1\46\1\47\1\25\1\50"+
    "\1\51\1\52\1\53\1\54\3\25\1\55\1\56\1\7"+
    "\1\57\7\0\1\3\73\0\1\25\7\0\1\25\3\0"+
    "\1\25\3\0\1\25\1\0\1\25\6\0\1\25\1\0"+
    "\1\25\4\0\1\25\7\0\1\25\3\0\1\25\3\0"+
    "\1\25\1\0\1\25\6\0\1\25\1\0\1\25\u012b\0"+
    "\2\3\326\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /**
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\2\1\1\3\1\4\1\5\1\6"+
    "\1\7\1\6\1\10\1\6\2\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\20\15\1\20\1\21\1\13\1\0"+
    "\1\22\2\0\1\2\2\0\1\23\1\24\1\0\24\15"+
    "\1\25\3\15\2\0\1\26\1\0\7\15\1\27\6\15"+
    "\1\30\13\15\1\0\1\2\3\15\1\31\1\32\20\15"+
    "\1\33\2\15\1\34\6\15\1\35\1\36\10\15\1\37"+
    "\3\15\1\40\3\15\1\41\11\15\1\42\3\15\1\43"+
    "\1\44\3\15\1\45\2\15\1\46\2\15\1\47\1\50"+
    "\1\51\2\15\1\52\3\15\1\53\3\15\1\54\3\15"+
    "\1\55";

  private static int [] zzUnpackAction() {
    int [] result = new int[199];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /**
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\60\0\60\0\140\0\220\0\300\0\60\0\60"+
    "\0\60\0\60\0\60\0\360\0\60\0\u0120\0\u0150\0\u0180"+
    "\0\60\0\220\0\220\0\u01b0\0\60\0\60\0\u01e0\0\u0210"+
    "\0\u0240\0\u0270\0\u02a0\0\u02d0\0\u0300\0\u0330\0\u0360\0\u0390"+
    "\0\u03c0\0\u03f0\0\u0420\0\u0450\0\u0480\0\u04b0\0\60\0\60"+
    "\0\60\0\300\0\300\0\u04e0\0\u0510\0\u0540\0\u0570\0\u05a0"+
    "\0\u05d0\0\u0600\0\u0630\0\u0660\0\u0690\0\u06c0\0\u06f0\0\u0720"+
    "\0\u0750\0\u0780\0\u07b0\0\u07e0\0\u0810\0\u0840\0\u0870\0\u08a0"+
    "\0\u08d0\0\u0900\0\u0930\0\u0960\0\u0990\0\u09c0\0\u09f0\0\u0a20"+
    "\0\u0a50\0\u0a80\0\u0ab0\0\u0ae0\0\u0b10\0\u05a0\0\u0b40\0\u0b70"+
    "\0\u0ba0\0\u0bd0\0\u0c00\0\u0c30\0\u0c60\0\u0c90\0\u01b0\0\u0cc0"+
    "\0\u0cf0\0\u0d20\0\u0d50\0\u0d80\0\u0db0\0\u01b0\0\u0de0\0\u0e10"+
    "\0\u0e40\0\u0e70\0\u0ea0\0\u0ed0\0\u0f00\0\u0f30\0\u0f60\0\u0f90"+
    "\0\u0fc0\0\u0ff0\0\u0ae0\0\u1020\0\u1050\0\u1080\0\u01b0\0\u01b0"+
    "\0\u10b0\0\u10e0\0\u1110\0\u1140\0\u1170\0\u11a0\0\u11d0\0\u1200"+
    "\0\u1230\0\u1260\0\u1290\0\u12c0\0\u12f0\0\u1320\0\u1350\0\u1380"+
    "\0\u01b0\0\u13b0\0\u13e0\0\u01b0\0\u1410\0\u1440\0\u1470\0\u14a0"+
    "\0\u14d0\0\u1500\0\u01b0\0\u01b0\0\u1530\0\u1560\0\u1590\0\u15c0"+
    "\0\u15f0\0\u1620\0\u1650\0\u1680\0\u01b0\0\u16b0\0\u16e0\0\u1710"+
    "\0\u01b0\0\u1740\0\u1770\0\u17a0\0\u01b0\0\u17d0\0\u1800\0\u1830"+
    "\0\u1860\0\u1890\0\u18c0\0\u18f0\0\u1920\0\u1950\0\u01b0\0\u1980"+
    "\0\u19b0\0\u19e0\0\u01b0\0\u01b0\0\u1a10\0\u1a40\0\u1a70\0\u1aa0"+
    "\0\u1ad0\0\u1b00\0\u01b0\0\u1b30\0\u1b60\0\u01b0\0\u01b0\0\u01b0"+
    "\0\u1b90\0\u1bc0\0\u01b0\0\u1bf0\0\u1c20\0\u1c50\0\u01b0\0\u1c80"+
    "\0\u1cb0\0\u1ce0\0\u01b0\0\u1d10\0\u1d40\0\u1d70\0\u01b0";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[199];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length() - 1;
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /**
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpacktrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\2\3\1\0\1\4\1\5\1\6\1\7\1\10"+
    "\1\11\2\12\1\13\1\14\1\15\1\16\1\17\1\20"+
    "\1\21\1\22\1\23\2\24\1\25\1\26\1\27\1\30"+
    "\1\31\1\32\1\33\1\34\1\24\1\35\1\36\2\24"+
    "\1\37\1\40\1\24\1\41\1\42\1\43\1\44\1\24"+
    "\1\45\1\46\1\47\1\50\62\0\1\3\101\0\1\51"+
    "\33\0\2\52\1\0\1\52\1\0\1\52\1\53\51\52"+
    "\20\0\1\54\1\20\50\0\1\55\4\0\1\56\55\0"+
    "\1\57\1\60\1\0\2\61\3\0\2\62\2\0\25\62"+
    "\17\0\1\63\1\60\1\0\2\20\3\0\2\62\2\0"+
    "\25\62\22\0\2\24\3\0\2\24\2\0\25\24\22\0"+
    "\2\24\3\0\2\24\2\0\2\24\1\64\7\24\1\65"+
    "\5\24\1\66\1\24\1\67\2\24\22\0\2\24\3\0"+
    "\2\24\2\0\15\24\1\70\7\24\22\0\2\24\3\0"+
    "\2\24\2\0\1\71\14\24\1\72\7\24\22\0\2\24"+
    "\3\0\2\24\2\0\4\24\1\73\20\24\22\0\2\24"+
    "\3\0\2\24\2\0\20\24\1\74\4\24\22\0\2\24"+
    "\3\0\2\24\2\0\1\75\3\24\1\76\20\24\22\0"+
    "\2\24\3\0\2\24\2\0\15\24\1\77\4\24\1\100"+
    "\2\24\22\0\2\24\3\0\2\24\2\0\14\24\1\101"+
    "\10\24\22\0\2\24\3\0\2\24\2\0\4\24\1\102"+
    "\3\24\1\103\14\24\22\0\2\24\3\0\2\24\2\0"+
    "\22\24\1\104\2\24\22\0\2\24\3\0\2\24\2\0"+
    "\15\24\1\105\7\24\22\0\2\24\3\0\2\24\2\0"+
    "\4\24\1\106\3\24\1\107\14\24\22\0\2\24\3\0"+
    "\2\24\2\0\10\24\1\110\14\24\22\0\2\24\3\0"+
    "\2\24\2\0\4\24\1\111\20\24\22\0\2\24\3\0"+
    "\2\24\2\0\4\24\1\112\20\24\22\0\2\24\3\0"+
    "\2\24\2\0\15\24\1\113\7\24\20\0\1\60\41\0"+
    "\12\114\1\115\45\114\2\56\1\3\1\56\1\4\53\56"+
    "\21\0\1\61\56\0\2\116\53\0\1\57\2\0\2\61"+
    "\3\0\2\62\2\0\25\62\22\0\2\62\3\0\2\62"+
    "\2\0\25\62\23\0\1\117\56\0\2\24\3\0\2\24"+
    "\2\0\21\24\1\120\3\24\22\0\2\24\3\0\2\24"+
    "\2\0\4\24\1\121\20\24\22\0\2\24\3\0\2\24"+
    "\2\0\16\24\1\122\6\24\22\0\2\24\3\0\2\24"+
    "\2\0\21\24\1\123\3\24\22\0\2\24\3\0\2\24"+
    "\2\0\15\24\1\124\7\24\22\0\2\24\3\0\2\24"+
    "\2\0\3\24\1\125\21\24\22\0\2\24\3\0\2\24"+
    "\2\0\14\24\1\126\10\24\22\0\2\24\3\0\2\24"+
    "\2\0\2\24\1\127\15\24\1\130\4\24\22\0\2\24"+
    "\3\0\2\24\2\0\21\24\1\131\3\24\22\0\2\24"+
    "\3\0\2\24\2\0\12\24\1\132\12\24\22\0\2\24"+
    "\3\0\2\24\2\0\2\24\1\133\22\24\22\0\2\24"+
    "\3\0\2\24\2\0\17\24\1\134\5\24\22\0\2\24"+
    "\3\0\2\24\2\0\13\24\1\135\11\24\22\0\2\24"+
    "\3\0\2\24\2\0\2\24\1\136\16\24\1\137\3\24"+
    "\22\0\2\24\3\0\2\24\2\0\14\24\1\140\10\24"+
    "\22\0\2\24\3\0\2\24\2\0\4\24\1\141\20\24"+
    "\22\0\2\24\3\0\2\24\2\0\13\24\1\142\11\24"+
    "\22\0\2\24\3\0\2\24\2\0\21\24\1\143\3\24"+
    "\22\0\2\24\3\0\2\24\2\0\16\24\1\144\6\24"+
    "\22\0\2\24\3\0\2\24\2\0\4\24\1\145\20\24"+
    "\22\0\2\24\3\0\2\24\2\0\14\24\1\146\10\24"+
    "\22\0\2\24\3\0\2\24\2\0\13\24\1\147\11\24"+
    "\22\0\2\24\3\0\2\24\2\0\17\24\1\150\5\24"+
    "\22\0\2\24\3\0\2\24\2\0\14\24\1\151\10\24"+
    "\2\0\12\114\1\152\57\114\1\152\4\114\1\153\40\114"+
    "\15\0\1\63\2\0\2\117\3\0\2\62\2\0\25\62"+
    "\22\0\2\24\3\0\2\24\2\0\10\24\1\154\14\24"+
    "\22\0\2\24\3\0\2\24\2\0\17\24\1\155\5\24"+
    "\22\0\2\24\3\0\2\24\2\0\4\24\1\156\20\24"+
    "\22\0\2\24\3\0\2\24\2\0\15\24\1\157\7\24"+
    "\22\0\2\24\3\0\2\24\2\0\12\24\1\160\12\24"+
    "\22\0\2\24\3\0\2\24\2\0\4\24\1\161\20\24"+
    "\22\0\2\24\3\0\2\24\2\0\20\24\1\162\4\24"+
    "\22\0\2\24\3\0\2\24\2\0\1\163\24\24\22\0"+
    "\2\24\3\0\2\24\2\0\1\164\24\24\22\0\2\24"+
    "\3\0\2\24\2\0\12\24\1\165\5\24\1\166\4\24"+
    "\22\0\2\24\3\0\2\24\2\0\7\24\1\167\15\24"+
    "\22\0\2\24\3\0\2\24\2\0\1\170\24\24\22\0"+
    "\2\24\3\0\2\24\2\0\4\24\1\171\20\24\22\0"+
    "\2\24\3\0\2\24\2\0\4\24\1\172\20\24\22\0"+
    "\2\24\3\0\2\24\2\0\20\24\1\173\4\24\22\0"+
    "\2\24\3\0\2\24\2\0\14\24\1\174\10\24\22\0"+
    "\2\24\3\0\2\24\2\0\4\24\1\175\20\24\22\0"+
    "\2\24\3\0\2\24\2\0\4\24\1\176\20\24\22\0"+
    "\2\24\3\0\2\24\2\0\4\24\1\177\20\24\22\0"+
    "\2\24\3\0\2\24\2\0\6\24\1\200\16\24\22\0"+
    "\2\24\3\0\2\24\2\0\15\24\1\201\7\24\22\0"+
    "\2\24\3\0\2\24\2\0\16\24\1\202\6\24\22\0"+
    "\2\24\3\0\2\24\2\0\3\24\1\203\21\24\22\0"+
    "\2\24\3\0\2\24\2\0\1\204\24\24\2\0\12\114"+
    "\1\152\4\114\1\3\40\114\20\0\2\24\3\0\2\24"+
    "\2\0\23\24\1\205\1\24\22\0\2\24\3\0\2\24"+
    "\2\0\21\24\1\206\3\24\22\0\2\24\3\0\2\24"+
    "\2\0\17\24\1\207\5\24\22\0\2\24\3\0\2\24"+
    "\2\0\14\24\1\167\10\24\22\0\2\24\3\0\2\24"+
    "\2\0\21\24\1\210\3\24\22\0\2\24\3\0\2\24"+
    "\2\0\2\24\1\211\22\24\22\0\2\24\3\0\2\24"+
    "\2\0\3\24\1\212\21\24\22\0\2\24\3\0\2\24"+
    "\2\0\1\213\24\24\22\0\2\24\3\0\2\24\2\0"+
    "\15\24\1\214\7\24\22\0\2\24\3\0\2\24\2\0"+
    "\1\160\24\24\22\0\2\24\3\0\2\24\2\0\17\24"+
    "\1\215\5\24\22\0\2\24\3\0\2\24\2\0\3\24"+
    "\1\216\21\24\22\0\2\24\3\0\2\24\2\0\14\24"+
    "\1\217\10\24\22\0\2\24\3\0\2\24\2\0\1\220"+
    "\24\24\22\0\2\24\3\0\2\24\2\0\21\24\1\221"+
    "\3\24\22\0\2\24\3\0\2\24\2\0\17\24\1\222"+
    "\5\24\22\0\2\24\3\0\2\24\2\0\14\24\1\223"+
    "\10\24\22\0\2\24\3\0\2\24\2\0\21\24\1\224"+
    "\3\24\22\0\2\24\3\0\2\24\2\0\15\24\1\225"+
    "\7\24\22\0\2\24\3\0\2\24\2\0\4\24\1\226"+
    "\20\24\22\0\2\24\3\0\2\24\2\0\1\227\24\24"+
    "\22\0\2\24\3\0\2\24\2\0\1\230\24\24\22\0"+
    "\2\24\3\0\2\24\2\0\1\231\24\24\22\0\2\24"+
    "\3\0\2\24\2\0\20\24\1\232\4\24\22\0\2\24"+
    "\3\0\2\24\2\0\1\233\24\24\22\0\2\24\3\0"+
    "\2\24\2\0\21\24\1\234\3\24\22\0\2\24\3\0"+
    "\2\24\2\0\15\24\1\235\7\24\22\0\2\24\3\0"+
    "\2\24\2\0\10\24\1\236\14\24\22\0\2\24\3\0"+
    "\2\24\2\0\1\237\24\24\22\0\2\24\3\0\2\24"+
    "\2\0\21\24\1\240\3\24\22\0\2\24\3\0\2\24"+
    "\2\0\11\24\1\241\13\24\22\0\2\24\3\0\2\24"+
    "\2\0\17\24\1\242\5\24\22\0\2\24\3\0\2\24"+
    "\2\0\15\24\1\160\7\24\22\0\2\24\3\0\2\24"+
    "\2\0\2\24\1\243\22\24\22\0\2\24\3\0\2\24"+
    "\2\0\10\24\1\244\14\24\22\0\2\24\3\0\2\24"+
    "\2\0\17\24\1\245\5\24\22\0\2\24\3\0\2\24"+
    "\2\0\3\24\1\246\21\24\22\0\2\24\3\0\2\24"+
    "\2\0\17\24\1\247\5\24\22\0\2\24\3\0\2\24"+
    "\2\0\15\24\1\250\7\24\22\0\2\24\3\0\2\24"+
    "\2\0\14\24\1\251\10\24\22\0\2\24\3\0\2\24"+
    "\2\0\10\24\1\252\14\24\22\0\2\24\3\0\2\24"+
    "\2\0\15\24\1\253\7\24\22\0\2\24\3\0\2\24"+
    "\2\0\3\24\1\254\21\24\22\0\2\24\3\0\2\24"+
    "\2\0\1\255\24\24\22\0\2\24\3\0\2\24\2\0"+
    "\4\24\1\231\20\24\22\0\2\24\3\0\2\24\2\0"+
    "\1\256\24\24\22\0\2\24\3\0\2\24\2\0\10\24"+
    "\1\257\14\24\22\0\2\24\3\0\2\24\2\0\17\24"+
    "\1\260\5\24\22\0\2\24\3\0\2\24\2\0\1\261"+
    "\24\24\22\0\2\24\3\0\2\24\2\0\4\24\1\262"+
    "\20\24\22\0\2\24\3\0\2\24\2\0\17\24\1\263"+
    "\5\24\22\0\2\24\3\0\2\24\2\0\21\24\1\264"+
    "\3\24\22\0\2\24\3\0\2\24\2\0\23\24\1\265"+
    "\1\24\22\0\2\24\3\0\2\24\2\0\17\24\1\266"+
    "\5\24\22\0\2\24\3\0\2\24\2\0\20\24\1\267"+
    "\4\24\22\0\2\24\3\0\2\24\2\0\1\270\24\24"+
    "\22\0\2\24\3\0\1\24\1\271\2\0\25\24\22\0"+
    "\2\24\3\0\2\24\2\0\21\24\1\272\3\24\22\0"+
    "\2\24\3\0\2\24\2\0\17\24\1\166\5\24\22\0"+
    "\2\24\3\0\2\24\2\0\4\24\1\273\20\24\22\0"+
    "\2\24\3\0\2\24\2\0\1\274\24\24\22\0\2\24"+
    "\3\0\2\24\2\0\10\24\1\275\14\24\22\0\2\24"+
    "\3\0\2\24\2\0\22\24\1\276\2\24\22\0\2\24"+
    "\3\0\2\24\2\0\17\24\1\277\5\24\22\0\2\24"+
    "\3\0\2\24\2\0\4\24\1\300\20\24\22\0\2\24"+
    "\3\0\2\24\2\0\17\24\1\301\5\24\22\0\2\24"+
    "\3\0\2\24\2\0\14\24\1\302\10\24\22\0\2\24"+
    "\3\0\2\24\2\0\1\303\24\24\22\0\2\24\3\0"+
    "\2\24\2\0\21\24\1\304\3\24\22\0\2\24\3\0"+
    "\2\24\2\0\17\24\1\305\5\24\22\0\2\24\3\0"+
    "\2\24\2\0\1\306\24\24\22\0\2\24\3\0\2\24"+
    "\2\0\20\24\1\307\4\24\2\0";

  private static int [] zzUnpacktrans() {
    int [] result = new int[7584];
    int offset = 0;
    offset = zzUnpacktrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpacktrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\2\11\3\1\5\11\1\1\1\11\3\1\1\11"+
    "\3\1\2\11\20\1\3\11\1\0\1\1\2\0\1\1"+
    "\2\0\2\1\1\0\30\1\2\0\1\1\1\0\32\1"+
    "\1\0\135\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[199];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen())];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  @SuppressWarnings("unused")
  private boolean zzEOFDone;

  /* user code: */
    private Token token(String lexeme, String lexicalComp, int line, int column){
        return new Token(lexeme, lexicalComp, line+1, column+1);
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  LexerR(java.io.Reader in) {
    this.zzReader = in;
  }


  /** Returns the maximum size of the scanner buffer, which limits the size of tokens. */
  private int zzMaxBufferLen() {
    return Integer.MAX_VALUE;
  }

  /**  Whether the scanner buffer can grow to accommodate a larger token. */
  private boolean zzCanGrow() {
    return true;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate && zzCanGrow()) {
      /* if not, and it can grow: blow it up */
      char newBuffer[] = new char[Math.min(zzBuffer.length * 2, zzMaxBufferLen())];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      if (requested == 0) {
        throw new java.io.EOFException("Scan buffer limit reached ["+zzBuffer.length+"]");
      }
      else {
        throw new java.io.IOException(
            "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
      }
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    int initBufferSize = Math.min(ZZ_BUFFERSIZE, zzMaxBufferLen());
    if (zzBuffer.length > initBufferSize) {
      zzBuffer = new char[initBufferSize];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public Token yylex() throws java.io.IOException
  {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is
        // (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof)
            zzPeek = false;
          else
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { return token(yytext(), "ERROR", yyline, yycolumn);
            }
          // fall through
          case 46: break;
          case 2:
            { /*Ignorar*/
            }
          // fall through
          case 47: break;
          case 3:
            { return token(yytext(), "OP_LOGICO", yyline, yycolumn);
            }
          // fall through
          case 48: break;
          case 4:
            { return token(yytext(), "PARENTESIS_A", yyline, yycolumn);
            }
          // fall through
          case 49: break;
          case 5:
            { return token(yytext(), "PARENTESIS_C", yyline, yycolumn);
            }
          // fall through
          case 50: break;
          case 6:
            { return token(yytext(), "OP_ARITMETICO", yyline, yycolumn);
            }
          // fall through
          case 51: break;
          case 7:
            { return token(yytext(), "COMA", yyline, yycolumn);
            }
          // fall through
          case 52: break;
          case 8:
            { return token(yytext(), "PUNTO", yyline, yycolumn);
            }
          // fall through
          case 53: break;
          case 9:
            { return token(yytext(), "NUMERO_ENTERO", yyline, yycolumn);
            }
          // fall through
          case 54: break;
          case 10:
            { return token(yytext(), "PUNTO_COMA", yyline, yycolumn);
            }
          // fall through
          case 55: break;
          case 11:
            { return token(yytext(), "OP_RELACIONAL", yyline, yycolumn);
            }
          // fall through
          case 56: break;
          case 12:
            { return token (yytext(), "OP_ASIG", yyline, yycolumn);
            }
          // fall through
          case 57: break;
          case 13:
            { return token(yytext(), "IDENTIFICADOR", yyline, yycolumn);
            }
          // fall through
          case 58: break;
          case 14:
            { return token(yytext(), "CORCHETE_A", yyline, yycolumn);
            }
          // fall through
          case 59: break;
          case 15:
            { return token(yytext(), "CORCHETE_C", yyline, yycolumn);
            }
          // fall through
          case 60: break;
          case 16:
            { return token(yytext(), "LLAVE_A", yyline, yycolumn);
            }
          // fall through
          case 61: break;
          case 17:
            { return token(yytext(), "LLAVE_C", yyline, yycolumn);
            }
          // fall through
          case 62: break;
          case 18:
            { return token(yytext(), "CADENA_TEXTO", yyline, yycolumn);
            }
          // fall through
          case 63: break;
          case 19:
            { return token(yytext(), "ERROR_1", yyline, yycolumn);
            }
          // fall through
          case 64: break;
          case 20:
            { return token(yytext(), "ERROR_2", yyline, yycolumn);
            }
          // fall through
          case 65: break;
          case 21:
            { return token(yytext(), "ESTRUCTURA_SI", yyline, yycolumn);
            }
          // fall through
          case 66: break;
          case 22:
            { return token(yytext(), "NUMERO_REAL", yyline, yycolumn);
            }
          // fall through
          case 67: break;
          case 23:
            { return token(yytext(), "DECREMENTO", yyline, yycolumn);
            }
          // fall through
          case 68: break;
          case 24:
            { return token(yytext(), "INCREMENTO", yyline, yycolumn);
            }
          // fall through
          case 69: break;
          case 25:
            { return token(yytext(), "VALOR_AUTOMATICO", yyline, yycolumn);
            }
          // fall through
          case 70: break;
          case 26:
            { return token(yytext(), "TIPO_DATO", yyline, yycolumn);
            }
          // fall through
          case 71: break;
          case 27:
            { return token(yytext(), "ESTRUCTURA_SINO", yyline, yycolumn);
            }
          // fall through
          case 72: break;
          case 28:
            { return token(yytext(), "ZONA", yyline, yycolumn);
            }
          // fall through
          case 73: break;
          case 29:
            { return token(yytext(), "ESC_FALLA", yyline, yycolumn);
            }
          // fall through
          case 74: break;
          case 30:
            { return token(yytext(), "VALOR_BOOLEANO", yyline, yycolumn);
            }
          // fall through
          case 75: break;
          case 31:
            { return token(yytext(), "STAT_RIEGO", yyline, yycolumn);
            }
          // fall through
          case 76: break;
          case 32:
            { return token(yytext(), "OUT_MENSAJE", yyline, yycolumn);
            }
          // fall through
          case 77: break;
          case 33:
            { return token(yytext(), "STAT_ESTADO", yyline, yycolumn);
            }
          // fall through
          case 78: break;
          case 34:
            { return token(yytext(), "ACTIVAR", yyline, yycolumn);
            }
          // fall through
          case 79: break;
          case 35:
            { return token(yytext(), "STAT_HORARIO", yyline, yycolumn);
            }
          // fall through
          case 80: break;
          case 36:
            { return token(yytext(), "STAT_HUMEDAD", yyline, yycolumn);
            }
          // fall through
          case 81: break;
          case 37:
            { return token(yytext(), "REPETIR", yyline, yycolumn);
            }
          // fall through
          case 82: break;
          case 38:
            { return token(yytext(), "ASPERSOR", yyline, yycolumn);
            }
          // fall through
          case 83: break;
          case 39:
            { return token(yytext(), "INTENTAR", yyline, yycolumn);
            }
          // fall through
          case 84: break;
          case 40:
            { return token(yytext(), "MIENTRAS", yyline, yycolumn);
            }
          // fall through
          case 85: break;
          case 41:
            { return token(yytext(), "STAT_POTENCIA", yyline, yycolumn);
            }
          // fall through
          case 86: break;
          case 42:
            { return token(yytext(), "CONSTANTE", yyline, yycolumn);
            }
          // fall through
          case 87: break;
          case 43:
            { return token(yytext(), "DESACTIVAR", yyline, yycolumn);
            }
          // fall through
          case 88: break;
          case 44:
            { return token(yytext(), "STAT_TEMPERATURA", yyline, yycolumn);
            }
          // fall through
          case 89: break;
          case 45:
            { return token(yytext(), "REPETIR_MIENTRAS", yyline, yycolumn);
            }
          // fall through
          case 90: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
