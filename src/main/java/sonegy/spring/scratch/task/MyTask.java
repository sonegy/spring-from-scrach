package sonegy.spring.scratch.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author: sonegy@sk.com
 */
@Component
public class MyTask {

    @Scheduled(fixedRate = 1000)
    public void fixedRate() {

        String name = Thread.currentThread().getName();
        System.out.println("MyTask name = " + name);
        System.out.println("MyTask.fixedRate");
    }

}
