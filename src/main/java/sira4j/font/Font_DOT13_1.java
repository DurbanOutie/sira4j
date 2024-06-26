package sira4j.font;

public class Font_DOT13_1{

    public static final int w = 6;
    public static final int h = 8;
    
    public static int[][][] charset = new int[128][][];

    static {
        
        charset[' '] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['!'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['\"'] = 
        new int[][]{
            {1, 0, 1, 0, 0, 0},
            {1, 0, 1, 0, 0, 0},
            {1, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['#'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 1, 0, 1, 0, 0},
            {1, 1, 1, 1, 1, 0},
            {0, 1, 0, 1, 0, 0},
            {1, 1, 1, 1, 1, 0},
            {0, 1, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['$'] = 
        new int[][]{
            {0, 0, 1, 0, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {1, 0, 1, 1, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {0, 0, 1, 0, 0, 0},
            {1, 0, 1, 1, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {0, 0, 1, 0, 0, 0}
        };
        charset['%'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 1, 0},
            {1, 0, 1, 0, 1, 0},
            {0, 1, 1, 1, 0, 0},
            {0, 0, 1, 1, 0, 0},
            {0, 1, 1, 0, 1, 0},
            {1, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['&'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0},
            {0, 1, 0, 1, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {1, 0, 1, 0, 1, 0},
            {1, 0, 0, 1, 0, 0},
            {0, 1, 1, 0, 1, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['\''] = 
        new int[][]{
            {1, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['('] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0}
        };
        charset[')'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0}
        };
        charset['*'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 1, 0, 1, 0, 0},
            {0, 0, 1, 0, 0, 0},
            {0, 1, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['+'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0},
            {0, 0, 1, 0, 0, 0},
            {1, 1, 1, 1, 1, 0},
            {0, 0, 1, 0, 0, 0},
            {0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset[','] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0}
        };
        charset['-'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['.'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['/'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 0},
            {0, 0, 0, 1, 0, 0},
            {0, 0, 1, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0}
        };
        charset['0'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 1, 1, 0, 0},
            {1, 1, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['1'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {1, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['2'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {0, 0, 0, 1, 0, 0},
            {0, 0, 1, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {1, 1, 1, 1, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['3'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {0, 0, 1, 0, 0, 0},
            {0, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['4'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 0},
            {0, 0, 1, 1, 0, 0},
            {0, 1, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 1, 1, 1, 1, 0},
            {0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['5'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {1, 1, 1, 1, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {0, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['6'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['7'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {1, 1, 1, 1, 0, 0},
            {0, 0, 0, 1, 0, 0},
            {0, 0, 1, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['8'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['9'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {0, 1, 1, 1, 0, 0},
            {0, 0, 0, 1, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset[':'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset[';'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0},
            {0, 0, 1, 0, 0, 0}
        };
        charset['<'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 1, 1, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {1, 1, 0, 0, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {0, 0, 1, 1, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['='] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['>'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {1, 1, 0, 0, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {0, 0, 1, 1, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {1, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['?'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {1, 0, 1, 0, 0, 0},
            {0, 0, 1, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['@'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 1, 1, 0, 0},
            {1, 0, 1, 1, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {0, 1, 1, 1, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['A'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 1, 1, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['B'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['C'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['D'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['E'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {1, 1, 1, 1, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {1, 1, 1, 1, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['F'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {1, 1, 1, 1, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['G'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {1, 0, 1, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['H'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 1, 1, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['I'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['J'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 0},
            {0, 0, 0, 1, 0, 0},
            {0, 0, 0, 1, 0, 0},
            {0, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['K'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['L'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {1, 1, 1, 1, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['M'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {1, 1, 0, 1, 1, 0},
            {1, 0, 1, 0, 1, 0},
            {1, 0, 1, 0, 1, 0},
            {1, 0, 0, 0, 1, 0},
            {1, 0, 0, 0, 1, 0},
            {1, 0, 0, 0, 1, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['N'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 1, 0, 1, 0, 0},
            {1, 0, 1, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['O'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['P'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['Q'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {0, 0, 0, 1, 0, 0}
        };
        charset['R'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['S'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['T'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {1, 1, 1, 1, 1, 0},
            {0, 0, 1, 0, 0, 0},
            {0, 0, 1, 0, 0, 0},
            {0, 0, 1, 0, 0, 0},
            {0, 0, 1, 0, 0, 0},
            {0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['U'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 1, 0},
            {1, 0, 0, 0, 1, 0},
            {1, 0, 0, 0, 1, 0},
            {1, 0, 0, 0, 1, 0},
            {1, 0, 0, 0, 1, 0},
            {0, 1, 1, 1, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['V'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 1, 0},
            {1, 0, 0, 0, 1, 0},
            {1, 0, 0, 0, 1, 0},
            {1, 0, 0, 0, 1, 0},
            {0, 1, 0, 1, 0, 0},
            {0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        
        charset['W'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 1, 0},
            {1, 0, 0, 0, 1, 0},
            {1, 0, 0, 0, 1, 0},
            {1, 0, 1, 0, 1, 0},
            {1, 0, 1, 0, 1, 0},
            {0, 1, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['X'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['Y'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {0, 1, 1, 1, 0, 0},
            {0, 0, 0, 1, 0, 0},
            {0, 0, 0, 1, 0, 0},
            {0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['Z'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {1, 1, 1, 1, 0, 0},
            {0, 0, 0, 1, 0, 0},
            {0, 0, 1, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {1, 1, 1, 1, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['['] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {1, 1, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {1, 1, 0, 0, 0, 0}
        };
        charset['\\'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0},
            {0, 0, 1, 0, 0, 0},
            {0, 0, 0, 1, 0, 0},
            {0, 0, 0, 1, 0, 0}
        };
        charset[']'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {1, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {1, 1, 0, 0, 0, 0}
        };
        charset['^'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0},
            {0, 1, 0, 1, 0, 0},
            {1, 0, 0, 0, 1, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['_'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {1, 1, 1, 1, 1, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['`'] = 
        new int[][]{
            {1, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['a'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 1, 1, 1, 0},
            {0, 1, 0, 0, 1, 0},
            {0, 1, 0, 0, 1, 0},
            {0, 0, 1, 1, 1, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['b'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['c'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['d'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 0},
            {0, 1, 1, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {0, 1, 1, 1, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['e'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {1, 1, 0, 1, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {0, 1, 1, 1, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['f'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['g'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 1, 1, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {0, 1, 1, 1, 0, 0},
            {0, 0, 0, 1, 0, 0},
            {0, 1, 1, 0, 0, 0}
        };
        charset['h'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['i'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {0, 0, 1, 0, 0, 0},
            {0, 1, 1, 1, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['j'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 1, 1, 0, 0},
            {0, 0, 0, 1, 0, 0},
            {0, 0, 0, 1, 0, 0},
            {0, 1, 1, 0, 0, 0}
        };
        charset['k'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {1, 0, 1, 0, 0, 0},
            {1, 1, 0, 0, 0, 0},
            {1, 0, 1, 0, 0, 0},
            {1, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['l'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {1, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 0, 1, 1, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['m'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 1, 0, 1, 0, 0},
            {1, 0, 1, 0, 1, 0},
            {1, 0, 1, 0, 1, 0},
            {1, 0, 1, 0, 1, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['n'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['o'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['p'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {1, 0, 0, 0, 0, 0}
        };
        charset['q'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {0, 1, 1, 1, 0, 0},
            {0, 0, 0, 1, 1, 0}
        };
        charset['r'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 1, 1, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['s'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['t'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0},
            {0, 1, 1, 1, 0, 0},
            {0, 0, 1, 0, 0, 0},
            {0, 0, 1, 0, 0, 0},
            {0, 0, 1, 1, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['u'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['v'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 1, 0},
            {1, 0, 0, 0, 1, 0},
            {0, 1, 0, 1, 0, 0},
            {0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['w'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 1, 0},
            {1, 0, 1, 0, 1, 0},
            {1, 0, 1, 0, 1, 0},
            {0, 1, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['x'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['y'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {1, 0, 0, 1, 0, 0},
            {0, 1, 1, 1, 0, 0},
            {0, 0, 0, 1, 0, 0},
            {0, 1, 1, 0, 0, 0}
        };
        charset['z'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {0, 0, 1, 0, 0, 0},
            {1, 1, 0, 0, 0, 0},
            {1, 1, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        charset['{'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {1, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 0, 1, 0, 0, 0}
        };
        charset['|'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0}
        };
        charset['}'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 1, 1, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0}
        };
        charset['~'] = 
        new int[][]{
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 1, 0, 1, 0, 0},
            {1, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0}
        };
        
    }
}
