public class Main {
    public static void main(String[] args) {
        run();
    }

    /**
     *  自动调用algo1()、algo2()并输出他们的运行耗时
     */
    public static void run() {
        TimerUtil timerUtil = new TimerUtilImpl();
        timerUtil.executeAndGetTime();
    }
}
