package junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UtilTest {

//    @Test
//    public void 引数に受け取った値がintの範囲の数値なら判定を返す() {
//        assertFalse(Util.isNumber(""));
//        assertTrue(Util.isNumber("123"));
//        assertFalse(Util.isNumber("abc"));
//    }

//    @Test
//    public void 引数に受け取った文字列が郵便番号の形式であるかを判定する() {
//        assertTrue(Util.isPostalCode("123-4567"));
//        assertFalse(Util.isPostalCode(""));
//        assertFalse(Util.isPostalCode("123-456"));
//    }

//        @Test
//    public void 引数に受け取った文字列が小文字のアルファベットのみで構成されているかどうかを判定する() {
//            assertTrue(Util.isSmallAlphabet("abcdefg"));
//            assertFalse(Util.isSmallAlphabet("あいうえお"));
//            assertFalse(Util.isSmallAlphabet("12345"));
//            assertFalse(Util.isSmallAlphabet(""));
//        }

//    @Test
//    public void 引数に受け取った3つの数値を3辺として三角形が作成() {
//        assert Util.isTriangle(2, 3, 4) == true;
//        assert Util.isTriangle(2147483645, 2, 2) == true;
//        assert Util.isTriangle(0, 0, 0) == false;
//        assert Util.isTriangle(1, 2, -1) == false;
//    }

    @Test
    public void 受け取った引数が何かしらの整数を2乗した数値だった場合その整数を返却() {
        assertEquals(10, Util.isSquareNumber(100));
        assertEquals(0, Util.isSquareNumber(0));
        assertEquals(-1, Util.isSquareNumber(-1));
        assertEquals(-1, Util.isSquareNumber(100001));
    }
}