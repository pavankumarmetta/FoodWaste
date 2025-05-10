package klu;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/deliveries")
@CrossOrigin(origins = "*") // Allow frontend to access this
public class TrackingController {

    private List<Delivery> deliveries = new ArrayList<>();

    public TrackingController() {
        // Mock data
        deliveries.add(createDelivery(1L, "in-transit", "Restaurant A", "Shelter B", "30 mins",
                List.of(
                        new TimelineEvent("2025-05-10 10:00", "Picked up from Restaurant A"),
                        new TimelineEvent("2025-05-10 10:15", "En route to Shelter B")
                )
        ));

        deliveries.add(createDelivery(2L, "pending", "Grocery Store C", "Food Bank D", "45 mins",
                List.of(
                        new TimelineEvent("2025-05-10 09:45", "Order received"),
                        new TimelineEvent("2025-05-10 10:00", "Waiting for pickup")
                )
        ));
    }

    @GetMapping
    public List<Delivery> getAllDeliveries(@RequestParam(required = false) String status) {
        if (status == null || status.equals("all")) {
            return deliveries;
        }
        return deliveries.stream()
                .filter(delivery -> delivery.getStatus().equalsIgnoreCase(status))
                .collect(Collectors.toList());
    }

    private Delivery createDelivery(Long id, String status, String origin, String destination, String eta, List<TimelineEvent> timeline) {
        Delivery delivery = new Delivery();
        delivery.setId(id);
        delivery.setStatus(status);
        delivery.setOrigin(origin);
        delivery.setDestination(destination);
        delivery.setEta(eta);
        delivery.setTimeline(timeline);
        return delivery;
    }
}
