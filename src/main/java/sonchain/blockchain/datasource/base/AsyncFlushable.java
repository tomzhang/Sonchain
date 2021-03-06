package sonchain.blockchain.datasource.base;

import com.google.common.util.concurrent.ListenableFuture;

public interface AsyncFlushable {
    ListenableFuture<Boolean> flushAsync() throws InterruptedException;
    void flipStorage() throws InterruptedException;
}
