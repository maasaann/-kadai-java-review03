package baseball;

public class Review03 {

    public static void main(String[] args) {

        BaseBallTeam baseBallTeam1 = new BaseBallTeam();
        BaseBallTeam baseBallTeam2 = new BaseBallTeam();
        BaseBallTeam baseBallTeam3 = new BaseBallTeam();
        BaseBallTeam baseBallTeam4 = new BaseBallTeam();
        BaseBallTeam baseBallTeam5 = new BaseBallTeam();
        BaseBallTeam baseBallTeam6 = new BaseBallTeam();

        baseBallTeam1.setTeamName("東京ヤクルトスワローズ");
        baseBallTeam2.setTeamName("横浜DeNAベイスターズ");
        baseBallTeam3.setTeamName("阪神タイガース");
        baseBallTeam4.setTeamName("読売ジャイアンツ");
        baseBallTeam5.setTeamName("広島東洋カープ");
        baseBallTeam6.setTeamName("中日ドラゴンズ");

        String teamName1 = baseBallTeam1.getTeamName();
        String teamName2 = baseBallTeam2.getTeamName();
        String teamName3 = baseBallTeam3.getTeamName();
        String teamName4 = baseBallTeam4.getTeamName();
        String teamName5 = baseBallTeam5.getTeamName();
        String teamName6 = baseBallTeam6.getTeamName();

        baseBallTeam1.setWin(80);
        baseBallTeam2.setWin(73);
        baseBallTeam3.setWin(68);
        baseBallTeam4.setWin(68);
        baseBallTeam5.setWin(66);
        baseBallTeam6.setWin(66);

        int Win1 = baseBallTeam1.getWin();
        int Win2 = baseBallTeam2.getWin();
        int Win3 = baseBallTeam3.getWin();
        int Win4 = baseBallTeam4.getWin();
        int Win5 = baseBallTeam5.getWin();
        int Win6 = baseBallTeam6.getWin();

        baseBallTeam1.setLose(59);
        baseBallTeam2.setLose(68);
        baseBallTeam3.setLose(71);
        baseBallTeam4.setLose(72);
        baseBallTeam5.setLose(74);
        baseBallTeam6.setLose(75);

        int Lose1 = baseBallTeam1.getLose();
        int Lose2 = baseBallTeam2.getLose();
        int Lose3 = baseBallTeam3.getLose();
        int Lose4 = baseBallTeam4.getLose();
        int Lose5 = baseBallTeam5.getLose();
        int Lose6 = baseBallTeam6.getLose();

        baseBallTeam1.setDraw(4);
        baseBallTeam2.setDraw(2);
        baseBallTeam3.setDraw(4);
        baseBallTeam4.setDraw(3);
        baseBallTeam5.setDraw(3);
        baseBallTeam6.setDraw(2);

        int Draw1 = baseBallTeam1.getDraw();
        int Draw2 = baseBallTeam2.getDraw();
        int Draw3 = baseBallTeam3.getDraw();
        int Draw4 = baseBallTeam4.getDraw();
        int Draw5 = baseBallTeam5.getDraw();
        int Draw6 = baseBallTeam6.getDraw();

        double Rate1 = baseBallTeam1.getRate(Win1, Lose1);
        double Rate2 = baseBallTeam2.getRate(Win2, Lose2);
        double Rate3 = baseBallTeam3.getRate(Win3, Lose3);
        double Rate4 = baseBallTeam4.getRate(Win4, Lose4);
        double Rate5 = baseBallTeam5.getRate(Win5, Lose5);
        double Rate6 = baseBallTeam6.getRate(Win6, Lose6);

        baseBallTeam1.report(teamName1,Win1,Lose1,Draw1,Rate1);
        baseBallTeam2.report(teamName2,Win2,Lose2,Draw2,Rate2);
        baseBallTeam3.report(teamName3,Win3,Lose3,Draw3,Rate3);
        baseBallTeam4.report(teamName4,Win4,Lose4,Draw4,Rate4);
        baseBallTeam5.report(teamName5,Win5,Lose5,Draw5,Rate5);
        baseBallTeam6.report(teamName6,Win6,Lose6,Draw6,Rate6);
    }
}
