class Notification
{
    String name;
    String message;
    Notification()
    {

    }
    Notification(String name,String message)
    {
        this.name=name;
        this.message=message;
    }
    void send()
    {
        System.out.println("Parent class");
    }
}
class EmailNotification extends Notification
{
    EmailNotification(String name,String message)
    {
        super();
    }
    void send()
    {
        System.out.println("Email");
    }
}
class SMSNotification extends Notification
{
    SMSNotification(String name,String message)
    {
        super();
    }
    void send()
    {
        System.out.println("SMS");
    }
}

public class Notify {
    public static void main(String args[])
    {
        Notification n=new EmailNotification("Divya","Hi");
    }
}
