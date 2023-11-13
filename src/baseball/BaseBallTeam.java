package baseball;

public class BaseBallTeam {

    private String name; //チーム名
    private int win; //勝ち数
    private int lose; //負け数
    private int draw; //引き分け数

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setWin(int win) {
        this.win = win;
    }
    public int getWin() {
        return win;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }
    public int getLose() {
        return lose;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }
    public int getDraw() {
        return draw;
    }

    //getrateメソッド
    public double getRate() {
        double result = (double)win / (double)(win + lose);
        return result;
    }

    //reportメソッド
    public void report() {

        System.out.println(
                        name + " の2022年の成績は " +
                        win + "勝 " +
                        lose + "敗 " +
                        draw + "分、勝率は " +
                        getRate() + "です。");
    }

}
