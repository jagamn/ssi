package org.test.annotation;

import java.util.List;

/**
 * @author jianghm
 * @date 2015/4/16
 */
public class PasswordUtils {

    @UseCase(id = 47, description = "Passwords must contain at least one numeric")
    public Boolean validatePassword(String password) {
        return (password.matches("wds"));
    }

    @UseCase(id = 48)
    public String encryptPassword(String password) {
        return new StringBuilder(password).reverse().toString();
    }

    @UseCase(id = 49, description = "New passwords can’t equal previously used ones")
    public Boolean checkForNewPassword(List<String> prevPasswords, String password) {
        return !prevPasswords.contains(password);
    }
}
