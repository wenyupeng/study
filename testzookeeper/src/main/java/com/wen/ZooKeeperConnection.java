package com.wen;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/**
 * Created by wen on 2018/12/25.
 */
public class ZooKeeperConnection {
    /*
    declare zookeeper instance to access Zookeeper ensemble
     */
    private ZooKeeper zooKeeper;
    final CountDownLatch connectedSignal = new CountDownLatch(1);

    /* method to connect zookeeper ensemble */
    public ZooKeeper connect(String host) throws IOException, InterruptedException {
        zooKeeper = new ZooKeeper(host, 5000, new Watcher() {
            @Override
            public void process(WatchedEvent event) {
                if (event.getState() == Event.KeeperState.SyncConnected) {
                    connectedSignal.countDown();
                }
            }
        });
        connectedSignal.await();
        return zooKeeper;
    }
    /* method to disconnect from zookeeper server */
    public void close() throws InterruptedException {
        zooKeeper.close();
    }
}
