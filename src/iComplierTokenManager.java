/* Generated By:JJTree&JavaCC: Do not edit this line. iComplierTokenManager.java */
import java.util.*;
import java.io.*;

/** Token Manager. */
public class iComplierTokenManager implements iComplierConstants
{

  /** Debug output. */
  public static  java.io.PrintStream debugStream = System.out;
  /** Set debug output. */
  public static  void setDebugStream(java.io.PrintStream ds) { debugStream = ds; }
private static final int jjStopStringLiteralDfa_0(int pos, long active0, long active1)
{
   switch (pos)
   {
      case 0:
         if ((active0 & 0x3fffff8000L) != 0L)
         {
            jjmatchedKind = 38;
            return 22;
         }
         if ((active0 & 0x8000000000000L) != 0L || (active1 & 0x8000L) != 0L)
            return 43;
         return -1;
      case 1:
         if ((active0 & 0x210400000L) != 0L)
            return 22;
         if ((active0 & 0x3defbf8000L) != 0L)
         {
            if (jjmatchedPos != 1)
            {
               jjmatchedKind = 38;
               jjmatchedPos = 1;
            }
            return 22;
         }
         return -1;
      case 2:
         if ((active0 & 0x100080000L) != 0L)
            return 22;
         if ((active0 & 0x3ceff78000L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 2;
            return 22;
         }
         return -1;
      case 3:
         if ((active0 & 0x424130000L) != 0L)
            return 22;
         if ((active0 & 0x38cbe48000L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 3;
            return 22;
         }
         return -1;
      case 4:
         if ((active0 & 0x1082240000L) != 0L)
            return 22;
         if ((active0 & 0x2849c08000L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 4;
            return 22;
         }
         return -1;
      case 5:
         if ((active0 & 0x2040c08000L) != 0L)
            return 22;
         if ((active0 & 0x809000000L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 5;
            return 22;
         }
         return -1;
      case 6:
         if ((active0 & 0x8000000L) != 0L)
            return 22;
         if ((active0 & 0x801000000L) != 0L)
         {
            jjmatchedKind = 38;
            jjmatchedPos = 6;
            return 22;
         }
         return -1;
      default :
         return -1;
   }
}
private static final int jjStartNfa_0(int pos, long active0, long active1)
{
   return jjMoveNfa_0(jjStopStringLiteralDfa_0(pos, active0, active1), pos + 1);
}
static private int jjStopAtPos(int pos, int kind)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   return pos + 1;
}
static private int jjMoveStringLiteralDfa0_0()
{
   switch(curChar)
   {
      case 33:
         jjmatchedKind = 65;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x80L);
      case 37:
         jjmatchedKind = 80;
         return jjMoveStringLiteralDfa1_0(0x10000000000000L, 0x0L);
      case 38:
         jjmatchedKind = 63;
         return jjMoveStringLiteralDfa1_0(0x200000000000000L, 0x8L);
      case 40:
         return jjStopAtPos(0, 39);
      case 41:
         return jjStopAtPos(0, 43);
      case 42:
         jjmatchedKind = 48;
         return jjMoveStringLiteralDfa1_0(0x4000000000000L, 0x0L);
      case 43:
         jjmatchedKind = 78;
         return jjMoveStringLiteralDfa1_0(0x1020000000000000L, 0x0L);
      case 44:
         return jjStopAtPos(0, 41);
      case 45:
         jjmatchedKind = 62;
         return jjMoveStringLiteralDfa1_0(0x2040000000000000L, 0x0L);
      case 47:
         jjmatchedKind = 79;
         return jjMoveStringLiteralDfa1_0(0x8000000000000L, 0x0L);
      case 58:
         return jjStopAtPos(0, 49);
      case 59:
         return jjStopAtPos(0, 42);
      case 60:
         jjmatchedKind = 72;
         return jjMoveStringLiteralDfa1_0(0x80000000000000L, 0x1400L);
      case 61:
         jjmatchedKind = 40;
         return jjMoveStringLiteralDfa1_0(0x0L, 0x40L);
      case 62:
         jjmatchedKind = 73;
         return jjMoveStringLiteralDfa1_0(0x100000000000000L, 0x2800L);
      case 91:
         return jjStopAtPos(0, 44);
      case 93:
         return jjStopAtPos(0, 45);
      case 94:
         jjmatchedKind = 69;
         return jjMoveStringLiteralDfa1_0(0x400000000000000L, 0x0L);
      case 98:
         return jjMoveStringLiteralDfa1_0(0x1000000000L, 0x0L);
      case 99:
         return jjMoveStringLiteralDfa1_0(0x806020000L, 0x0L);
      case 100:
         return jjMoveStringLiteralDfa1_0(0x208400000L, 0x0L);
      case 101:
         return jjMoveStringLiteralDfa1_0(0x20000000L, 0x0L);
      case 102:
         return jjMoveStringLiteralDfa1_0(0x100200000L, 0x0L);
      case 103:
         return jjMoveStringLiteralDfa1_0(0x400000000L, 0x0L);
      case 105:
         return jjMoveStringLiteralDfa1_0(0x10080000L, 0x0L);
      case 108:
         return jjMoveStringLiteralDfa1_0(0x100000L, 0x0L);
      case 114:
         return jjMoveStringLiteralDfa1_0(0x2000000000L, 0x0L);
      case 115:
         return jjMoveStringLiteralDfa1_0(0x40848000L, 0x0L);
      case 117:
         return jjMoveStringLiteralDfa1_0(0x1000000L, 0x0L);
      case 118:
         return jjMoveStringLiteralDfa1_0(0x10000L, 0x0L);
      case 119:
         return jjMoveStringLiteralDfa1_0(0x80000000L, 0x0L);
      case 123:
         return jjStopAtPos(0, 46);
      case 124:
         jjmatchedKind = 68;
         return jjMoveStringLiteralDfa1_0(0x800000000000000L, 0x4L);
      case 125:
         return jjStopAtPos(0, 47);
      case 126:
         return jjStopAtPos(0, 64);
      default :
         return jjMoveNfa_0(0, 0);
   }
}
static private int jjMoveStringLiteralDfa1_0(long active0, long active1)
{
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(0, active0, active1);
      return 1;
   }
   switch(curChar)
   {
      case 38:
         if ((active1 & 0x8L) != 0L)
            return jjStopAtPos(1, 67);
         break;
      case 43:
         if ((active0 & 0x1000000000000000L) != 0L)
            return jjStopAtPos(1, 60);
         break;
      case 45:
         if ((active0 & 0x2000000000000000L) != 0L)
            return jjStopAtPos(1, 61);
         break;
      case 60:
         if ((active1 & 0x1000L) != 0L)
         {
            jjmatchedKind = 76;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x80000000000000L, active1, 0L);
      case 61:
         if ((active0 & 0x4000000000000L) != 0L)
            return jjStopAtPos(1, 50);
         else if ((active0 & 0x8000000000000L) != 0L)
            return jjStopAtPos(1, 51);
         else if ((active0 & 0x10000000000000L) != 0L)
            return jjStopAtPos(1, 52);
         else if ((active0 & 0x20000000000000L) != 0L)
            return jjStopAtPos(1, 53);
         else if ((active0 & 0x40000000000000L) != 0L)
            return jjStopAtPos(1, 54);
         else if ((active0 & 0x200000000000000L) != 0L)
            return jjStopAtPos(1, 57);
         else if ((active0 & 0x400000000000000L) != 0L)
            return jjStopAtPos(1, 58);
         else if ((active0 & 0x800000000000000L) != 0L)
            return jjStopAtPos(1, 59);
         else if ((active1 & 0x40L) != 0L)
            return jjStopAtPos(1, 70);
         else if ((active1 & 0x80L) != 0L)
            return jjStopAtPos(1, 71);
         else if ((active1 & 0x400L) != 0L)
            return jjStopAtPos(1, 74);
         else if ((active1 & 0x800L) != 0L)
            return jjStopAtPos(1, 75);
         break;
      case 62:
         if ((active1 & 0x2000L) != 0L)
         {
            jjmatchedKind = 77;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0x100000000000000L, active1, 0L);
      case 97:
         return jjMoveStringLiteralDfa2_0(active0, 0x4000000L, active1, 0L);
      case 101:
         return jjMoveStringLiteralDfa2_0(active0, 0x2008000000L, active1, 0L);
      case 102:
         if ((active0 & 0x10000000L) != 0L)
            return jjStartNfaWithStates_0(1, 28, 22);
         break;
      case 104:
         return jjMoveStringLiteralDfa2_0(active0, 0x80060000L, active1, 0L);
      case 105:
         return jjMoveStringLiteralDfa2_0(active0, 0x800000L, active1, 0L);
      case 108:
         return jjMoveStringLiteralDfa2_0(active0, 0x20200000L, active1, 0L);
      case 110:
         return jjMoveStringLiteralDfa2_0(active0, 0x1080000L, active1, 0L);
      case 111:
         if ((active0 & 0x200000000L) != 0L)
         {
            jjmatchedKind = 33;
            jjmatchedPos = 1;
         }
         return jjMoveStringLiteralDfa2_0(active0, 0xd02510000L, active1, 0L);
      case 114:
         return jjMoveStringLiteralDfa2_0(active0, 0x1000000000L, active1, 0L);
      case 116:
         return jjMoveStringLiteralDfa2_0(active0, 0x8000L, active1, 0L);
      case 119:
         return jjMoveStringLiteralDfa2_0(active0, 0x40000000L, active1, 0L);
      case 124:
         if ((active1 & 0x4L) != 0L)
            return jjStopAtPos(1, 66);
         break;
      default :
         break;
   }
   return jjStartNfa_0(0, active0, active1);
}
static private int jjMoveStringLiteralDfa2_0(long old0, long active0, long old1, long active1)
{
   if (((active0 &= old0) | (active1 &= old1)) == 0L)
      return jjStartNfa_0(0, old0, old1);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(1, active0, 0L);
      return 2;
   }
   switch(curChar)
   {
      case 61:
         if ((active0 & 0x80000000000000L) != 0L)
            return jjStopAtPos(2, 55);
         else if ((active0 & 0x100000000000000L) != 0L)
            return jjStopAtPos(2, 56);
         break;
      case 97:
         return jjMoveStringLiteralDfa3_0(active0, 0x28000L);
      case 101:
         return jjMoveStringLiteralDfa3_0(active0, 0x1000000000L);
      case 102:
         return jjMoveStringLiteralDfa3_0(active0, 0x8000000L);
      case 103:
         return jjMoveStringLiteralDfa3_0(active0, 0x800000L);
      case 105:
         return jjMoveStringLiteralDfa3_0(active0, 0xc0010000L);
      case 110:
         return jjMoveStringLiteralDfa3_0(active0, 0x802100000L);
      case 111:
         return jjMoveStringLiteralDfa3_0(active0, 0x240000L);
      case 114:
         if ((active0 & 0x100000000L) != 0L)
            return jjStartNfaWithStates_0(2, 32, 22);
         break;
      case 115:
         return jjMoveStringLiteralDfa3_0(active0, 0x25000000L);
      case 116:
         if ((active0 & 0x80000L) != 0L)
            return jjStartNfaWithStates_0(2, 19, 22);
         return jjMoveStringLiteralDfa3_0(active0, 0x2400000000L);
      case 117:
         return jjMoveStringLiteralDfa3_0(active0, 0x400000L);
      default :
         break;
   }
   return jjStartNfa_0(1, active0, 0L);
}
static private int jjMoveStringLiteralDfa3_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(1, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(2, active0, 0L);
      return 3;
   }
   switch(curChar)
   {
      case 97:
         return jjMoveStringLiteralDfa4_0(active0, 0x1008200000L);
      case 98:
         return jjMoveStringLiteralDfa4_0(active0, 0x400000L);
      case 100:
         if ((active0 & 0x10000L) != 0L)
            return jjStartNfaWithStates_0(3, 16, 22);
         break;
      case 101:
         if ((active0 & 0x4000000L) != 0L)
            return jjStartNfaWithStates_0(3, 26, 22);
         else if ((active0 & 0x20000000L) != 0L)
            return jjStartNfaWithStates_0(3, 29, 22);
         break;
      case 103:
         if ((active0 & 0x100000L) != 0L)
            return jjStartNfaWithStates_0(3, 20, 22);
         break;
      case 105:
         return jjMoveStringLiteralDfa4_0(active0, 0x1000000L);
      case 108:
         return jjMoveStringLiteralDfa4_0(active0, 0x80000000L);
      case 110:
         return jjMoveStringLiteralDfa4_0(active0, 0x800000L);
      case 111:
         if ((active0 & 0x400000000L) != 0L)
            return jjStartNfaWithStates_0(3, 34, 22);
         break;
      case 114:
         if ((active0 & 0x20000L) != 0L)
            return jjStartNfaWithStates_0(3, 17, 22);
         return jjMoveStringLiteralDfa4_0(active0, 0x40000L);
      case 115:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000000L);
      case 116:
         return jjMoveStringLiteralDfa4_0(active0, 0x840008000L);
      case 117:
         return jjMoveStringLiteralDfa4_0(active0, 0x2000000000L);
      default :
         break;
   }
   return jjStartNfa_0(2, active0, 0L);
}
static private int jjMoveStringLiteralDfa4_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(2, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(3, active0, 0L);
      return 4;
   }
   switch(curChar)
   {
      case 99:
         return jjMoveStringLiteralDfa5_0(active0, 0x40000000L);
      case 101:
         if ((active0 & 0x80000000L) != 0L)
            return jjStartNfaWithStates_0(4, 31, 22);
         return jjMoveStringLiteralDfa5_0(active0, 0x800000L);
      case 103:
         return jjMoveStringLiteralDfa5_0(active0, 0x1000000L);
      case 105:
         return jjMoveStringLiteralDfa5_0(active0, 0x800008000L);
      case 107:
         if ((active0 & 0x1000000000L) != 0L)
            return jjStartNfaWithStates_0(4, 36, 22);
         break;
      case 108:
         return jjMoveStringLiteralDfa5_0(active0, 0x400000L);
      case 114:
         return jjMoveStringLiteralDfa5_0(active0, 0x2000000000L);
      case 116:
         if ((active0 & 0x40000L) != 0L)
            return jjStartNfaWithStates_0(4, 18, 22);
         else if ((active0 & 0x200000L) != 0L)
            return jjStartNfaWithStates_0(4, 21, 22);
         else if ((active0 & 0x2000000L) != 0L)
            return jjStartNfaWithStates_0(4, 25, 22);
         break;
      case 117:
         return jjMoveStringLiteralDfa5_0(active0, 0x8000000L);
      default :
         break;
   }
   return jjStartNfa_0(3, active0, 0L);
}
static private int jjMoveStringLiteralDfa5_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(3, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(4, active0, 0L);
      return 5;
   }
   switch(curChar)
   {
      case 99:
         if ((active0 & 0x8000L) != 0L)
            return jjStartNfaWithStates_0(5, 15, 22);
         break;
      case 100:
         if ((active0 & 0x800000L) != 0L)
            return jjStartNfaWithStates_0(5, 23, 22);
         break;
      case 101:
         if ((active0 & 0x400000L) != 0L)
            return jjStartNfaWithStates_0(5, 22, 22);
         break;
      case 104:
         if ((active0 & 0x40000000L) != 0L)
            return jjStartNfaWithStates_0(5, 30, 22);
         break;
      case 108:
         return jjMoveStringLiteralDfa6_0(active0, 0x8000000L);
      case 110:
         if ((active0 & 0x2000000000L) != 0L)
            return jjStartNfaWithStates_0(5, 37, 22);
         return jjMoveStringLiteralDfa6_0(active0, 0x801000000L);
      default :
         break;
   }
   return jjStartNfa_0(4, active0, 0L);
}
static private int jjMoveStringLiteralDfa6_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(4, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(5, active0, 0L);
      return 6;
   }
   switch(curChar)
   {
      case 101:
         return jjMoveStringLiteralDfa7_0(active0, 0x1000000L);
      case 116:
         if ((active0 & 0x8000000L) != 0L)
            return jjStartNfaWithStates_0(6, 27, 22);
         break;
      case 117:
         return jjMoveStringLiteralDfa7_0(active0, 0x800000000L);
      default :
         break;
   }
   return jjStartNfa_0(5, active0, 0L);
}
static private int jjMoveStringLiteralDfa7_0(long old0, long active0)
{
   if (((active0 &= old0)) == 0L)
      return jjStartNfa_0(5, old0, 0L);
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) {
      jjStopStringLiteralDfa_0(6, active0, 0L);
      return 7;
   }
   switch(curChar)
   {
      case 100:
         if ((active0 & 0x1000000L) != 0L)
            return jjStartNfaWithStates_0(7, 24, 22);
         break;
      case 101:
         if ((active0 & 0x800000000L) != 0L)
            return jjStartNfaWithStates_0(7, 35, 22);
         break;
      default :
         break;
   }
   return jjStartNfa_0(6, active0, 0L);
}
static private int jjStartNfaWithStates_0(int pos, int kind, int state)
{
   jjmatchedKind = kind;
   jjmatchedPos = pos;
   try { curChar = input_stream.readChar(); }
   catch(java.io.IOException e) { return pos + 1; }
   return jjMoveNfa_0(state, pos + 1);
}
static final long[] jjbitVec0 = {
   0x0L, 0x0L, 0xffffffffffffffffL, 0xffffffffffffffffL
};
static private int jjMoveNfa_0(int startState, int curPos)
{
   int startsAt = 0;
   jjnewStateCnt = 55;
   int i = 1;
   jjstateSet[0] = startState;
   int kind = 0x7fffffff;
   for (;;)
   {
      if (++jjround == 0x7fffffff)
         ReInitRounds();
      if (curChar < 64)
      {
         long l = 1L << curChar;
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(0, 6);
                  else if (curChar == 47)
                     jjAddStates(7, 8);
                  else if (curChar == 34)
                     jjCheckNAddStates(9, 11);
                  else if (curChar == 39)
                     jjAddStates(12, 13);
                  else if (curChar == 46)
                     jjCheckNAdd(4);
                  if ((0x3fe000000000000L & l) != 0L)
                  {
                     if (kind > 7)
                        kind = 7;
                     jjCheckNAddTwoStates(1, 2);
                  }
                  else if (curChar == 48)
                  {
                     if (kind > 7)
                        kind = 7;
                     jjCheckNAddStates(14, 16);
                  }
                  break;
               case 43:
                  if (curChar == 42)
                     jjCheckNAddTwoStates(49, 50);
                  else if (curChar == 47)
                  {
                     if (kind > 5)
                        kind = 5;
                     jjCheckNAddStates(17, 19);
                  }
                  break;
               case 1:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 7)
                     kind = 7;
                  jjCheckNAddTwoStates(1, 2);
                  break;
               case 3:
                  if (curChar == 46)
                     jjCheckNAdd(4);
                  break;
               case 4:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 11)
                     kind = 11;
                  jjCheckNAddStates(20, 22);
                  break;
               case 6:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(7);
                  break;
               case 7:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 11)
                     kind = 11;
                  jjCheckNAddTwoStates(7, 8);
                  break;
               case 9:
                  if (curChar == 39)
                     jjAddStates(12, 13);
                  break;
               case 10:
                  if ((0xffffff7fffffdbffL & l) != 0L)
                     jjCheckNAdd(11);
                  break;
               case 11:
                  if (curChar == 39 && kind > 13)
                     kind = 13;
                  break;
               case 13:
                  if ((0x8400000000L & l) != 0L)
                     jjCheckNAdd(11);
                  break;
               case 14:
                  if (curChar == 34)
                     jjCheckNAddStates(9, 11);
                  break;
               case 15:
                  if ((0xfffffffbffffdbffL & l) != 0L)
                     jjCheckNAddStates(9, 11);
                  break;
               case 17:
                  if ((0x8400002400L & l) != 0L)
                     jjCheckNAddStates(9, 11);
                  break;
               case 18:
                  if (curChar == 34 && kind > 14)
                     kind = 14;
                  break;
               case 19:
                  if (curChar == 10)
                     jjCheckNAddStates(9, 11);
                  break;
               case 20:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 19;
                  break;
               case 22:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 38)
                     kind = 38;
                  jjstateSet[jjnewStateCnt++] = 22;
                  break;
               case 23:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(0, 6);
                  break;
               case 24:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(24, 25);
                  break;
               case 25:
                  if (curChar != 46)
                     break;
                  if (kind > 11)
                     kind = 11;
                  jjCheckNAddStates(23, 25);
                  break;
               case 26:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 11)
                     kind = 11;
                  jjCheckNAddStates(23, 25);
                  break;
               case 28:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(29);
                  break;
               case 29:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 11)
                     kind = 11;
                  jjCheckNAddTwoStates(29, 8);
                  break;
               case 30:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(30, 31);
                  break;
               case 32:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(33);
                  break;
               case 33:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 11)
                     kind = 11;
                  jjCheckNAddTwoStates(33, 8);
                  break;
               case 34:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddStates(26, 28);
                  break;
               case 36:
                  if ((0x280000000000L & l) != 0L)
                     jjCheckNAdd(37);
                  break;
               case 37:
                  if ((0x3ff000000000000L & l) != 0L)
                     jjCheckNAddTwoStates(37, 8);
                  break;
               case 38:
                  if (curChar != 48)
                     break;
                  if (kind > 7)
                     kind = 7;
                  jjCheckNAddStates(14, 16);
                  break;
               case 40:
                  if ((0x3ff000000000000L & l) == 0L)
                     break;
                  if (kind > 7)
                     kind = 7;
                  jjCheckNAddTwoStates(40, 2);
                  break;
               case 41:
                  if ((0xff000000000000L & l) == 0L)
                     break;
                  if (kind > 7)
                     kind = 7;
                  jjCheckNAddTwoStates(41, 2);
                  break;
               case 42:
                  if (curChar == 47)
                     jjAddStates(7, 8);
                  break;
               case 44:
                  if ((0xffffffffffffdbffL & l) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjCheckNAddStates(17, 19);
                  break;
               case 45:
                  if ((0x2400L & l) != 0L && kind > 5)
                     kind = 5;
                  break;
               case 46:
                  if (curChar == 10 && kind > 5)
                     kind = 5;
                  break;
               case 47:
                  if (curChar == 13)
                     jjstateSet[jjnewStateCnt++] = 46;
                  break;
               case 48:
                  if (curChar == 42)
                     jjCheckNAddTwoStates(49, 50);
                  break;
               case 49:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(49, 50);
                  break;
               case 50:
                  if (curChar == 42)
                     jjCheckNAddStates(29, 31);
                  break;
               case 51:
                  if ((0xffff7bffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(52, 53);
                  break;
               case 52:
                  if ((0xfffffbffffffffffL & l) != 0L)
                     jjCheckNAddTwoStates(52, 53);
                  break;
               case 53:
                  if (curChar == 42)
                     jjCheckNAddStates(32, 34);
                  break;
               case 54:
                  if (curChar == 47 && kind > 6)
                     kind = 6;
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else if (curChar < 128)
      {
         long l = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 0:
               case 22:
                  if ((0x7fffffe87fffffeL & l) == 0L)
                     break;
                  if (kind > 38)
                     kind = 38;
                  jjCheckNAdd(22);
                  break;
               case 2:
                  if ((0x20100000201000L & l) != 0L && kind > 7)
                     kind = 7;
                  break;
               case 5:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(35, 36);
                  break;
               case 8:
                  if ((0x5000000050L & l) != 0L && kind > 11)
                     kind = 11;
                  break;
               case 10:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAdd(11);
                  break;
               case 12:
                  if (curChar == 92)
                     jjstateSet[jjnewStateCnt++] = 13;
                  break;
               case 13:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAdd(11);
                  break;
               case 15:
                  if ((0xffffffffefffffffL & l) != 0L)
                     jjCheckNAddStates(9, 11);
                  break;
               case 16:
                  if (curChar == 92)
                     jjAddStates(37, 38);
                  break;
               case 17:
                  if ((0x14404410000000L & l) != 0L)
                     jjCheckNAddStates(9, 11);
                  break;
               case 27:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(39, 40);
                  break;
               case 31:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(41, 42);
                  break;
               case 35:
                  if ((0x2000000020L & l) != 0L)
                     jjAddStates(43, 44);
                  break;
               case 39:
                  if ((0x100000001000000L & l) != 0L)
                     jjCheckNAdd(40);
                  break;
               case 40:
                  if ((0x7e0000007eL & l) == 0L)
                     break;
                  if (kind > 7)
                     kind = 7;
                  jjCheckNAddTwoStates(40, 2);
                  break;
               case 44:
                  if (kind > 5)
                     kind = 5;
                  jjAddStates(17, 19);
                  break;
               case 49:
                  jjAddStates(45, 46);
                  break;
               case 51:
               case 52:
                  jjCheckNAddTwoStates(52, 53);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      else
      {
         int i2 = (curChar & 0xff) >> 6;
         long l2 = 1L << (curChar & 077);
         do
         {
            switch(jjstateSet[--i])
            {
               case 10:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjstateSet[jjnewStateCnt++] = 11;
                  break;
               case 15:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(9, 11);
                  break;
               case 44:
                  if ((jjbitVec0[i2] & l2) == 0L)
                     break;
                  if (kind > 5)
                     kind = 5;
                  jjAddStates(17, 19);
                  break;
               case 49:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjAddStates(45, 46);
                  break;
               case 51:
               case 52:
                  if ((jjbitVec0[i2] & l2) != 0L)
                     jjCheckNAddTwoStates(52, 53);
                  break;
               default : break;
            }
         } while(i != startsAt);
      }
      if (kind != 0x7fffffff)
      {
         jjmatchedKind = kind;
         jjmatchedPos = curPos;
         kind = 0x7fffffff;
      }
      ++curPos;
      if ((i = jjnewStateCnt) == (startsAt = 55 - (jjnewStateCnt = startsAt)))
         return curPos;
      try { curChar = input_stream.readChar(); }
      catch(java.io.IOException e) { return curPos; }
   }
}
static final int[] jjnextStates = {
   24, 25, 30, 31, 34, 35, 8, 43, 48, 15, 16, 18, 10, 12, 39, 41, 
   2, 44, 45, 47, 4, 5, 8, 26, 27, 8, 34, 35, 8, 50, 51, 54, 
   51, 53, 54, 6, 7, 17, 20, 28, 29, 32, 33, 36, 37, 49, 50, 
};

/** Token literal values. */
public static final String[] jjstrLiteralImages = {
"", null, null, null, null, null, null, null, null, null, null, null, null, 
null, null, "\163\164\141\164\151\143", "\166\157\151\144", "\143\150\141\162", 
"\163\150\157\162\164", "\151\156\164", "\154\157\156\147", "\146\154\157\141\164", 
"\144\157\165\142\154\145", "\163\151\147\156\145\144", "\165\156\163\151\147\156\145\144", 
"\143\157\156\163\164", "\143\141\163\145", "\144\145\146\141\165\154\164", "\151\146", 
"\145\154\163\145", "\163\167\151\164\143\150", "\167\150\151\154\145", "\146\157\162", 
"\144\157", "\147\157\164\157", "\143\157\156\164\151\156\165\145", 
"\142\162\145\141\153", "\162\145\164\165\162\156", null, "\50", "\75", "\54", "\73", "\51", "\133", 
"\135", "\173", "\175", "\52", "\72", "\52\75", "\57\75", "\45\75", "\53\75", 
"\55\75", "\74\74\75", "\76\76\75", "\46\75", "\136\75", "\174\75", "\53\53", "\55\55", 
"\55", "\46", "\176", "\41", "\174\174", "\46\46", "\174", "\136", "\75\75", 
"\41\75", "\74", "\76", "\74\75", "\76\75", "\74\74", "\76\76", "\53", "\57", "\45", };

/** Lexer state names. */
public static final String[] lexStateNames = {
   "DEFAULT",
};
static final long[] jjtoToken = {
   0xffffffffffffe881L, 0x1ffffL, 
};
static final long[] jjtoSkip = {
   0x7eL, 0x0L, 
};
static protected SimpleCharStream input_stream;
static private final int[] jjrounds = new int[55];
static private final int[] jjstateSet = new int[110];
private static final StringBuilder jjimage = new StringBuilder();
private static StringBuilder image = jjimage;
private static int jjimageLen;
private static int lengthOfMatch;
static protected char curChar;
/** Constructor. */
public iComplierTokenManager(SimpleCharStream stream){
   if (input_stream != null)
      throw new TokenMgrError("ERROR: Second call to constructor of static lexer. You must use ReInit() to initialize the static variables.", TokenMgrError.STATIC_LEXER_ERROR);
   input_stream = stream;
}

/** Constructor. */
public iComplierTokenManager(SimpleCharStream stream, int lexState){
   this(stream);
   SwitchTo(lexState);
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream)
{
   jjmatchedPos = jjnewStateCnt = 0;
   curLexState = defaultLexState;
   input_stream = stream;
   ReInitRounds();
}
static private void ReInitRounds()
{
   int i;
   jjround = 0x80000001;
   for (i = 55; i-- > 0;)
      jjrounds[i] = 0x80000000;
}

/** Reinitialise parser. */
static public void ReInit(SimpleCharStream stream, int lexState)
{
   ReInit(stream);
   SwitchTo(lexState);
}

/** Switch to specified lex state. */
static public void SwitchTo(int lexState)
{
   if (lexState >= 1 || lexState < 0)
      throw new TokenMgrError("Error: Ignoring invalid lexical state : " + lexState + ". State unchanged.", TokenMgrError.INVALID_LEXICAL_STATE);
   else
      curLexState = lexState;
}

static protected Token jjFillToken()
{
   final Token t;
   final String curTokenImage;
   final int beginLine;
   final int endLine;
   final int beginColumn;
   final int endColumn;
   String im = jjstrLiteralImages[jjmatchedKind];
   curTokenImage = (im == null) ? input_stream.GetImage() : im;
   beginLine = input_stream.getBeginLine();
   beginColumn = input_stream.getBeginColumn();
   endLine = input_stream.getEndLine();
   endColumn = input_stream.getEndColumn();
   t = Token.newToken(jjmatchedKind, curTokenImage);

   t.beginLine = beginLine;
   t.endLine = endLine;
   t.beginColumn = beginColumn;
   t.endColumn = endColumn;

   return t;
}

static int curLexState = 0;
static int defaultLexState = 0;
static int jjnewStateCnt;
static int jjround;
static int jjmatchedPos;
static int jjmatchedKind;

/** Get the next Token. */
public static Token getNextToken() 
{
  Token matchedToken;
  int curPos = 0;

  EOFLoop :
  for (;;)
  {
   try
   {
      curChar = input_stream.BeginToken();
   }
   catch(java.io.IOException e)
   {
      jjmatchedKind = 0;
      matchedToken = jjFillToken();
      return matchedToken;
   }
   image = jjimage;
   image.setLength(0);
   jjimageLen = 0;

   try { input_stream.backup(0);
      while (curChar <= 32 && (0x100002600L & (1L << curChar)) != 0L)
         curChar = input_stream.BeginToken();
   }
   catch (java.io.IOException e1) { continue EOFLoop; }
   jjmatchedKind = 0x7fffffff;
   jjmatchedPos = 0;
   curPos = jjMoveStringLiteralDfa0_0();
   if (jjmatchedKind != 0x7fffffff)
   {
      if (jjmatchedPos + 1 < curPos)
         input_stream.backup(curPos - jjmatchedPos - 1);
      if ((jjtoToken[jjmatchedKind >> 6] & (1L << (jjmatchedKind & 077))) != 0L)
      {
         matchedToken = jjFillToken();
         return matchedToken;
      }
      else
      {
         SkipLexicalActions(null);
         continue EOFLoop;
      }
   }
   int error_line = input_stream.getEndLine();
   int error_column = input_stream.getEndColumn();
   String error_after = null;
   boolean EOFSeen = false;
   try { input_stream.readChar(); input_stream.backup(1); }
   catch (java.io.IOException e1) {
      EOFSeen = true;
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
      if (curChar == '\n' || curChar == '\r') {
         error_line++;
         error_column = 0;
      }
      else
         error_column++;
   }
   if (!EOFSeen) {
      input_stream.backup(1);
      error_after = curPos <= 1 ? "" : input_stream.GetImage();
   }
   throw new TokenMgrError(EOFSeen, curLexState, error_line, error_column, error_after, curChar, TokenMgrError.LEXICAL_ERROR);
  }
}

static void SkipLexicalActions(Token matchedToken)
{
   switch(jjmatchedKind)
   {
      case 5 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
  System.out.print("\u005ct\u005ct\u005ctSkipped line comment\u005cn");
         break;
      case 6 :
         image.append(input_stream.GetSuffix(jjimageLen + (lengthOfMatch = jjmatchedPos + 1)));
  System.out.print("\u005ct\u005ct\u005ctSkipped block comment\u005cn");
         break;
      default :
         break;
   }
}
static private void jjCheckNAdd(int state)
{
   if (jjrounds[state] != jjround)
   {
      jjstateSet[jjnewStateCnt++] = state;
      jjrounds[state] = jjround;
   }
}
static private void jjAddStates(int start, int end)
{
   do {
      jjstateSet[jjnewStateCnt++] = jjnextStates[start];
   } while (start++ != end);
}
static private void jjCheckNAddTwoStates(int state1, int state2)
{
   jjCheckNAdd(state1);
   jjCheckNAdd(state2);
}

static private void jjCheckNAddStates(int start, int end)
{
   do {
      jjCheckNAdd(jjnextStates[start]);
   } while (start++ != end);
}

}
