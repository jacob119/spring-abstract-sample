package org.jacob.springabstractbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class BasketballService extends BallService {

    @Autowired
    public BasketballService(RuleRepository ruleRepository) {
        super(ruleRepository);
    }
}