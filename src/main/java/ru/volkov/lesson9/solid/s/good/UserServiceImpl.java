package ru.volkov.lesson9.solid.s.good;

public class UserServiceImpl implements UserService {

    private EmailInfo emailInfo;
    private EmailService emailService;

    @Override
    public void registerUser(User user) {
        // save user to database
        // send mail to user for verification.

        emailInfo = new EmailInfo("some subject", "some body", user.getEmail());
        emailService = new EmailServiceImpl();
        emailService.sendEmail(emailInfo);
    }
}
