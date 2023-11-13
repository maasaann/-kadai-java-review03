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

        baseBallTeam1.setWin(80);
        baseBallTeam2.setWin(73);
        baseBallTeam3.setWin(68);
        baseBallTeam4.setWin(68);
        baseBallTeam5.setWin(66);
        baseBallTeam6.setWin(66);

        baseBallTeam1.setLose(59);
        baseBallTeam2.setLose(68);
        baseBallTeam3.setLose(71);
        baseBallTeam4.setLose(72);
        baseBallTeam5.setLose(74);
        baseBallTeam6.setLose(75);

        baseBallTeam1.setDraw(4);
        baseBallTeam2.setDraw(2);
        baseBallTeam3.setDraw(4);
        baseBallTeam4.setDraw(3);
        baseBallTeam5.setDraw(3);
        baseBallTeam6.setDraw(2);

        baseBallTeam1.report();
        baseBallTeam2.report();
        baseBallTeam3.report();
        baseBallTeam4.report();
        baseBallTeam5.report();
        baseBallTeam6.report();

    }
}
