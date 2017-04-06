package zhangyi.insight.refactor.featureenvy;

public class Carriage {
    private int percentReservedBarrier = 70;

    public int subscribedPercent() {
        return 0;
    }

    public boolean canSubscribe() {
        return subscribedPercent() < this.percentReservedBarrier;
    }
}
