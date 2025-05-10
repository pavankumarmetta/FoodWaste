package klu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RequestService {

    @Autowired
    private RequestRepository repository;

    public FoodRequest saveRequest(FoodRequest request) {
        return repository.save(request);
    }
}