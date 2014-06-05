package sonegy.spring.scratch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @author: sonegy@sk.com
 */
@Component
public class Sample {

    @Autowired
    Environment environment;

}
