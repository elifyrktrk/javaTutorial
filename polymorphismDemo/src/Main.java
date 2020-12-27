public class Main {

    public static void main(String[] args) {
        //EmailLogger emailLogger = new EmailLogger();
        //emailLogger.Log("Log mesajı");
//        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(),new EmailLogger(),new DatabaseLogger(), new ConsoleLogger()};
//        for(BaseLogger logger:loggers){
//            logger.Log("Log mesajı");
//        }
        CustomeerManage customeerManage =new CustomeerManage(new DatabaseLogger());
        customeerManage.add();
    }
}
