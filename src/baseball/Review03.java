package baseball;

public class Review03 {

    public static void main(String[] args) {

        BaseBallTeam baseBallTeam1 = new BaseBallTeam();
        BaseBallTeam baseBallTeam2 = new BaseBallTeam();
        BaseBallTeam baseBallTeam3 = new BaseBallTeam();
        BaseBallTeam baseBallTeam4 = new BaseBallTeam();
        BaseBallTeam baseBallTeam5 = new BaseBallTeam();
        BaseBallTeam baseBallTeam6 = new BaseBallTeam();

        baseBallTeam1.setName("東京ヤクルトスワローズ");
        baseBallTeam2.setName("横浜DeNAベイスターズ");
        baseBallTeam3.setName("阪神タイガース");
        baseBallTeam4.setName("読売ジャイアンツ");
        baseBallTeam5.setName("広島東洋カープ");
        baseBallTeam6.setName("中日ドラゴンズ");

        String Name1 = baseBallTeam1.getName();
        String Name2 = baseBallTeam2.getName();
        String Name3 = baseBallTeam3.getName();
        String Name4 = baseBallTeam4.getName();
        String Name5 = baseBallTeam5.getName();
        String Name6 = baseBallTeam6.getName();

        baseBallTeam1.setWin(80);
        baseBallTeam2.setWin(73);
        baseBallTeam3.setWin(68);
        baseBallTeam4.setWin(68);
        baseBallTeam5.setWin(66);
        baseBallTeam6.setWin(66);

        int win1 = baseBallTeam1.getWin();
        int win2 = baseBallTeam2.getWin();
        int win3 = baseBallTeam3.getWin();
        int win4 = baseBallTeam4.getWin();
        int win5 = baseBallTeam5.getWin();
        int win6 = baseBallTeam6.getWin();

        baseBallTeam1.setLose(59);
        baseBallTeam2.setLose(68);
        baseBallTeam3.setLose(71);
        baseBallTeam4.setLose(72);
        baseBallTeam5.setLose(74);
        baseBallTeam6.setLose(75);

        int lose1 = baseBallTeam1.getLose();
        int lose2 = baseBallTeam2.getLose();
        int lose3 = baseBallTeam3.getLose();
        int lose4 = baseBallTeam4.getLose();
        int lose5 = baseBallTeam5.getLose();
        int lose6 = baseBallTeam6.getLose();

        baseBallTeam1.setDraw(4);
        baseBallTeam2.setDraw(2);
        baseBallTeam3.setDraw(4);
        baseBallTeam4.setDraw(3);
        baseBallTeam5.setDraw(3);
        baseBallTeam6.setDraw(2);

        int draw1 = baseBallTeam1.getDraw();
        int draw2 = baseBallTeam2.getDraw();
        int draw3 = baseBallTeam3.getDraw();
        int draw4 = baseBallTeam4.getDraw();
        int draw5 = baseBallTeam5.getDraw();
        int draw6 = baseBallTeam6.getDraw();

        double rate1 = baseBallTeam1.getRate();
        double rate2 = baseBallTeam2.getRate();
        double rate3 = baseBallTeam3.getRate();
        double rate4 = baseBallTeam4.getRate();
        double rate5 = baseBallTeam5.getRate();
        double rate6 = baseBallTeam6.getRate();

        baseBallTeam1.report();
        baseBallTeam2.report();
        baseBallTeam3.report();
        baseBallTeam4.report();
        baseBallTeam5.report();
        baseBallTeam6.report();
    }
}
