package lv.IfHomework;

import java.util.Objects;

public class UserLoginService {
    User userClass = new User();

   public void login(String inputPassword, String user) {
        if ((userClass.getPassword().equals(inputPassword)) && (userClass.getLogin().equals(user))) {
            System.out.println("Lietotajs un parole ievaditi veiksmigi");
            userClass.setLoginAttemptsLeft(-70);
            System.out.println(userClass.getLoginAttemptsLeft());
        } else System.out.println("Nepareizais lietotaja vards vai parole");
    }

    public void verify() {
        if (userClass.getLoginAttemptsLeft() <= 0) {
            userClass.block();
            System.out.println("noblokets");
        } else if (userClass.getBlocked() == true) {
            System.out.println("Lietotajs ir noblokets");
        } else System.out.println("viss chotka");
        System.out.println(userClass.getLoginAttemptsLeft());

    }


}

