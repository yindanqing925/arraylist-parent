package org.nh.common.config.executor;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.task.TaskExecutor;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * TaskExecutor
 *
 * @Author yindanqing
 * @Description TODO
 * @Date 2019/6/11 20:05
 */
@Configuration
public class TaskExecutorConfig {

    //核心线程数
    private static final int CORE_POOL_SIZE = 5;
    //最大线程数
    private static final int MAX_POOL_SIZE = 20;
    //队列最大长度
    private static final int WORKING_QUEUE_SIZE = 32;
    //最大空闲时间
    private static final int MAX_IDLE_TIME = 30;
    //线程池名称
    private static final String THREAD_FACTORY_NAME = "async-task-thread-pool";

    @Bean
    public TaskExecutor taskExecutor(){
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setMaxPoolSize(MAX_POOL_SIZE);
        taskExecutor.setCorePoolSize(CORE_POOL_SIZE);
        taskExecutor.setQueueCapacity(WORKING_QUEUE_SIZE);
        taskExecutor.setThreadNamePrefix(THREAD_FACTORY_NAME);
        taskExecutor.setRejectedExecutionHandler(new ThreadPoolExecutor.AbortPolicy());
        ThreadFactory threadFactory = new ThreadFactoryBuilder().setNameFormat(THREAD_FACTORY_NAME + "-%d").build();
        taskExecutor.setThreadFactory(threadFactory);
        taskExecutor.setAllowCoreThreadTimeOut(true);
        taskExecutor.setKeepAliveSeconds(MAX_IDLE_TIME);
        taskExecutor.initialize();
        return new ExceptionHandlingAsyncTaskExecutor(taskExecutor);
    }

}
