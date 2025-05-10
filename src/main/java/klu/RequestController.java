package klu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/requests")
@CrossOrigin(origins = "*") // Adjust as needed
public class RequestController {

    @Autowired
    private RequestService requestService;

    @PostMapping
    public FoodRequest submitRequest(@RequestBody FoodRequest request) {
        return requestService.saveRequest(request);
    }
}