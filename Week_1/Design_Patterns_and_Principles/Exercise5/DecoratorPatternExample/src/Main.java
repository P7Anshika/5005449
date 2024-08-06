public class Main {
    public static void main(String[] args) {
        // Create a basic EmailNotifier
        Notifier emailNotifier = new EmailNotifier();

        // Add SMS functionality to the EmailNotifier
        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);

        // Add Slack functionality to the SMSNotifier
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        // Send notifications
        slackNotifier.send("Hello, this is a notification!");
    }
}
