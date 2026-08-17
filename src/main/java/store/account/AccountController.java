package store.account;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public interface AccountController {

    @PostMapping("/account")
    public void create(AccountIn in);

    @GetMapping("/account")
    public List<AccountOut> findAll();
    
}
