package baseball;

public class BaseBallTeam {

    private String teamName; //チーム名
    private int Win; //勝ち数
    private int Lose; //負け数
    private int Draw; //引き分け数
    private double Rate; //勝率

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public String getTeamName() {
        return teamName;
    }

    public void setWin(int Win) {
        this.Win = Win;
    }
    public int getWin() {
        return Win;
    }

    public void setLose(int Lose) {
        this.Lose = Lose;
    }
    public int getLose() {
        return Lose;
    }

    public void setDraw(int Draw) {
        this.Draw = Draw;
    }
    public int getDraw() {
        return Draw;
    }

    //getRateメソッド
    public double getRate(double Win, double Lose) {
        double result = Win / (Win + Lose); //勝ち数/(勝ち数+負け数)
        return result;
    }

    //reportメソッド
    public void report(String name, int Win, int Lose, int Draw, double Rate) {
      System.out.println(name + " の2022年の成績は " + Win + "勝 " + Lose + "敗 " + Draw + "分、勝率は " + Rate + "です。");
    }

}
