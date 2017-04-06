package zhangyi.insight.refactor.featureenvy;

import java.util.ArrayList;
import java.util.List;

public class Train {
    private final List<Carriage> carriages = new ArrayList<Carriage>();


    public void reserveSeats(ReservationRequest request) {
        for (Carriage carriage : carriages) {
            if (carriage.canSubscribe()) {
                request.reserveSeatsIn(carriage);
                return;
            }
        }
        request.cannotFindSeat();
    }

}

