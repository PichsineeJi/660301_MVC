import java.util.HashMap;

public class CowManage {
    private static HashMap<String, Cow> cowInfo = new HashMap<>();
    
    public static void main(String[] args) {
        //cow info
        cowInfo.put("11111111", new Cow("11111111", "pink", 5, 8));
        cowInfo.put("22222222", new Cow("22222222", "white", 2, 4));
        cowInfo.put("33333333", new Cow("33333333", "brown", 7, 6));
        cowInfo.put("44444444", new Cow("44444444", "white", 4, 11));
        cowInfo.put("55555555", new Cow("55555555", "pink", 1, 10));
        cowInfo.put("66666666", new Cow("66666666", "pink", 6, 1));
        cowInfo.put("77777777", new Cow("77777777", "brown", 9, 8));
        cowInfo.put("88888888", new Cow("88888888", "brown", 0, 3));
        cowInfo.put("99999999", new Cow("99999999", "white", 5, 2));
        cowInfo.put("10101010", new Cow("10101010", "white", 3, 5));
        cowInfo.put("10111111", new Cow("10111111", "brown", 2, 0));
        cowInfo.put("10121212", new Cow("10121212", "pink", 8, 7));
        cowInfo.put("10131313", new Cow("10131313", "pink", 1, 6));
        cowInfo.put("10141414", new Cow("10141414", "brown", 4, 4));
        cowInfo.put("10151515", new Cow("10151515", "white", 2, 1));
        cowInfo.put("10161616", new Cow("10161616", "brown", 2, 2));
        cowInfo.put("10171717", new Cow("10171717", "pink", 7, 8));
        cowInfo.put("10181818", new Cow("10181818", "brown", 8, 1));
        cowInfo.put("10191919", new Cow("10191919", "white", 5, 0));
        cowInfo.put("20202020", new Cow("20202020", "pink", 7, 3));

        CowView view = new CowView();
        CowControl control = new CowControl(view, cowInfo);
    }
}
