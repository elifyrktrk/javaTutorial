public class CustomeerManage {
    private BaseLogger logger;

    public CustomeerManage(BaseLogger logger){
        this.logger=logger;
    }

    public void add(){
        System.out.println("Müşteri eklendi");
        this.logger.log("log mesajı");
    }
}
