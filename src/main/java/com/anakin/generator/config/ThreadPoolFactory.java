package com.anakin.generator.config;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author: anakin
 * @description: 线程池工厂，用于生产线程池，项目中所有的线程池通过此创建 目的是方便管理线程池
 * @date 2019-05-12 18:04
 */
@Slf4j
public class ThreadPoolFactory {
    /**
     * corePoolSize 池中所保存的线程数，包括空闲线程。
     */
    private static final int corePoolSize = Runtime.getRuntime().availableProcessors();// 获得核心数

    /**
     * blockingCoefficient 阻塞系数
     */
    private static final double blockingCoefficient = 0.9;

    /**
     * maximumPoolSize - 池中允许的最大线程数。
     *
     */
    private static final int maximumPoolSize = (int) (corePoolSize / (1 - blockingCoefficient));

    /**
     * keepAliveTime -当线程数大于核心时，此为终止前多余的空闲线程等待新任务的最长时间，线程池维护线程所允许的空闲时间
     */

    private static final int keepAliveTime = 30;

    /**
     * 阻塞队列的大小（缓存队列）
     */

    private static final int capacity = 300;

    /**
     * 线程池对象
     */

    private  volatile   static  ThreadPoolExecutor threadPoolExecutor = null;

    // 构造方法私有化
    private ThreadPoolFactory() {

    }

    /**
     * 从线程池工厂获得线程池
     *
     */
    public static ThreadPoolExecutor getThreadPoolExecutor() {

        if (null == threadPoolExecutor) {

            ThreadPoolExecutor t;

            synchronized (ThreadPoolExecutor.class) {

                t = threadPoolExecutor;

                if (null == t) {

                    synchronized (ThreadPoolExecutor.class) {

                        // 自定义创建线程池
                        t = new ThreadPoolExecutor(corePoolSize, maximumPoolSize, keepAliveTime,
                                TimeUnit.MILLISECONDS, new LinkedBlockingQueue<Runnable>(capacity),
                                new ThreadPoolExecutor.AbortPolicy());
                        log.info("创建线程池：corePoolSize：" + corePoolSize + ",maximumPoolSize：" + maximumPoolSize
                                + ",空闲线程存活keepAliveTime：" + keepAliveTime + ",阻塞队列大小capacity：" + capacity);

                    }

                    threadPoolExecutor = t;
                }
            }

        }

        return threadPoolExecutor;

    }

}
